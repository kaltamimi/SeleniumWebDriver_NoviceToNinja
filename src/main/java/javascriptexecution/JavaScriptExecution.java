package javascriptexecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecution {

    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        js = (JavascriptExecutor) driver;


        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws Exception{
       // driver.get(baseUrl);
        js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");

      //  WebElement textField  = driver.findElement(By.id("displayed-text"));
        // driver.get() method waits for the page to load completely before going to the next statement
        // Adding Thread.sleep() because we are opening URL using js.executeScript() and it does not wait for the page to load completely
        // If we do not add wait, then Selenium WebDriver will immediately try to find the element and it might have issues with just a little slow connection
        Thread.sleep(5000);
        // Finding element

        WebElement textField  = (WebElement) js.executeScript("return document.getElementById('name');");
        textField.sendKeys("test");
    }

    @After
    public void tearDown() throws Exception {
        // Thread.sleep(3000);
        //  driver.quit();
    }
}
