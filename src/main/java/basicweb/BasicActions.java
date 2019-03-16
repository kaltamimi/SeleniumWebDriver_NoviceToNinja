package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasicActions {

    WebDriver driver;
    String baseURL = "https://letskodeit.teachable.com/";


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseURL = "http://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        driver.get(baseURL);
        driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
        System.out.println("Clicked on login");
        driver.findElement(By.id("user_email")).sendKeys("test@email.com");
        System.out.println("Sending keys to username field");
        driver.findElement(By.id("user_password")).sendKeys("test");
        System.out.println("Sending keys to password field");
        driver.findElement(By.id("user_email")).clear();
        System.out.println("Clearing the username field");
    }

    @After
    public void tearDown() throws Exception {
         driver.quit();
    }
}
