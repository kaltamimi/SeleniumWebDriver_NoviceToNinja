package tutorial.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

public class Screenshots {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testScreenshots() throws Exception {
        driver.get(baseUrl);
        //.//div[@class='datepicker-cal-month'][position()=1]//button[text()=24]
        driver.get(baseUrl);
        // Click flights tab
        driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']/span[@class='icons-container']")).click();
        // Find departing field

        WebElement departingField = driver.findElement(By.id("package-departing-hp-package"));
        // Click departing field
        departingField.click();
        Thread.sleep(3000);
        // Find the date to be selected
        WebElement dateToSelect = driver.findElement(By.cssSelector(".datepicker-cal .datepicker-cal-month:nth-child(4) tr:nth-of-type(5) .notranslate:nth-of-type(1) [data-year]"));
        // Click the date
        dateToSelect.click();
    }

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    @After
    public void tearDown() throws Exception {
    //    String fileName = getRandomString(10) + ".png";
     //   String directory = "//Users//anil.tomar//Desktop//";
//        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(sourceFile, new File(directory + fileName));
//        driver.quit();

        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
        File dest = new File("./src/main/resources/sreenshots/" + filename);
        FileUtils.copyFile(scr, dest);
    }

}
