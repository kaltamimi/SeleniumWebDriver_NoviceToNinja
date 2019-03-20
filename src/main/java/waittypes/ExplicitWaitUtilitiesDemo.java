package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WaitTypes;


public class ExplicitWaitUtilitiesDemo {
    private WebDriver driver;
    private String baseUrl;
    private WaitTypes waitTypes;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
        waitTypes = new WaitTypes(driver);

        // Maximize the browser's window
        driver.manage().window().maximize();
    }

    @Test()
    public void test() throws Exception {
        driver.get(baseUrl);
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        WebElement emailField = waitTypes.waitForElement(By.id("user_email"),3);
        emailField.sendKeys("test");

        waitTypes.clickWhenReady(By.name("commit"), 3);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
