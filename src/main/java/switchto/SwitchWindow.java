package switchto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {


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
    }

    @Test()
    public void test() throws Exception {
        driver.get(baseUrl);

//        WebElement searchWindow = driver.findElement(By.id("search-courses"));
//        searchWindow.sendKeys("python");

        //Get Handle
        String parentWindow = driver.getWindowHandle();

        // Find Open Window button
        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();

        //Get all handles
        Set<String> handles = driver.getWindowHandles();

        // Switching between handles
        for (String handle: handles) {
            System.out.println(handle);
            if (!handle.equals(parentWindow)){
                driver.switchTo().window(handle);
                Thread.sleep(4000);
                WebElement searchWindow = driver.findElement(By.id("search-courses"));
                searchWindow.sendKeys("python");
                Thread.sleep(3000);
                driver.close();
                break;
            }
            //switch back to parent window

        }

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
    }

    @After
    public void tearDown() throws Exception {
        // Thread.sleep(3000);
        //  driver.quit();
    }
}
