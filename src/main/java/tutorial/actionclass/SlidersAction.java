package tutorial.actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SlidersAction {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://jqueryui.com/slider/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test()
    public void testMouseHoverActions() throws Exception {
        driver.switchTo().frame(0);
        Thread.sleep(2000);

        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

        Actions actions = new Actions(driver);

        actions.dragAndDropBy(slider,100,0).perform();


    }

    @After
    public void tearDown() throws Exception {
//        Thread.sleep(2000);
//        driver.quit();
    }
}