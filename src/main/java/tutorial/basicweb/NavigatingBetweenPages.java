package tutorial.basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingBetweenPages {

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
    public void test() throws InterruptedException {
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("Title of the page is " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current url is " + currentUrl);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?reset_purchase_session=1";
        driver.navigate().to(urlToNavigate);
        System.out.println("Navigating To Login");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate Back");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navigate Forward");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate Back");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        driver.navigate().refresh();
        System.out.println("Navigate Refresh");
        //another way to refresh
        driver.get(currentUrl);
        System.out.println("Navigate Refresh");

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

    @After
    public void tearDown() throws Exception {
        // driver.quit();
    }
}
