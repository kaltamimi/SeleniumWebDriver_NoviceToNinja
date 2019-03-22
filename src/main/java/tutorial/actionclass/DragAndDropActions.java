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

public class DragAndDropActions {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://jqueryui.com/droppable/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test()
    public void testMouseHoverActions() throws Exception {

        driver.switchTo().frame(0);
        Thread.sleep(2000);

        WebElement fromElement = driver.findElement(By.id("draggable"));
        WebElement toElement = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        //Drag and drop
       // actions.dragAndDrop(fromElement,toElement).build().perform();

        //Click and hold element ,move element , release and build
        actions.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
    }

    @After
    public void tearDown() throws Exception {
//        Thread.sleep(2000);
//        driver.quit();
    }
}