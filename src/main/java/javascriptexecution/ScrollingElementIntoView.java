package javascriptexecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ScrollingElementIntoView {

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
    public void test() throws Exception {
        // Navigation
        js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");
        Thread.sleep(5000);

        //Scroll Down
        js.executeScript("window.scrollBy(0,1900);");
        Thread.sleep(5000);

        //Scroll Up
        js.executeScript("window.scrollBy(0,-1900);");
        Thread.sleep(5000);


        WebElement mouseHover = driver.findElement(By.id("mousehover"));
        js.executeScript("arguments[0].scrollIntoView(true);", mouseHover);
        Thread.sleep(5000);

        js.executeScript("window.scrollBy(0,-190);");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}