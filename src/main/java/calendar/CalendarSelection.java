package calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarSelection { private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://www.expedia.com/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test()
    public void test() throws Exception {
        //.//div[@class='datepicker-cal-month'][position()=1]//button[text()=24]
        driver.get(baseUrl);
        // Click flights tab
        driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']/span[@class='icons-container']")).click();
        // Find departing field

        WebElement departingField = driver.findElement(By.id("package-departing-hp-package"));
        // Click departing field
        departingField.click();
        Thread.sleep(3000);

        WebElement calMonth = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]"));
        List<WebElement> allValidDate = calMonth.findElements(By.tagName("button"));

        for (WebElement date: allValidDate){
            if (date.getText().equals("26")){
                date.click();
                break;
            }
        }

    }

    @After
    public void tearDown() throws Exception {
        // Thread.sleep(3000);
        //  driver.quit();
    }
}
