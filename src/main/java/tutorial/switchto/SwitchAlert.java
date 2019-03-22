package tutorial.switchto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SwitchAlert {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test()
    public void test1() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("kawthar");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        //alert.dismiss();

    }

    @Test()
    public void test2() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("kawthar");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        //alert.dismiss();

    }

    @After
    public void tearDown() throws Exception {
        // Thread.sleep(3000);
        //  driver.quit();
    }
}
