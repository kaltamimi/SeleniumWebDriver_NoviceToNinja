package tutorial.javascriptexecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WindowSize {
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
        // Navigation
        js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");

        //Window size
        long height = (Long) js.executeScript("return window.innerHeight;");
        long width = (Long) js.executeScript("return window.innerWidth;");

        System.out.println("Height is: " + height);
        System.out.println("Width is: " + width);

    }

    @After
    public void tearDown() throws Exception {
         Thread.sleep(3000);
         driver.quit();
    }
}
