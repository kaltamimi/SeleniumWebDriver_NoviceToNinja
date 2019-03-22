package tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Autocomplete {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://www.southwest.com/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test()
    public void test() throws Exception {
        driver.get(baseUrl);
        String searchingText = "New York/Newark, NJ - EWR";
        String partialText = "New York";

        WebElement text = driver.findElement(By.cssSelector("#LandingPageAirSearchForm_originationAirportCode"));
        text.sendKeys(partialText);

        WebElement element = driver.findElement(By.id("air-city-departure-menu"));
        List<WebElement> results = element.findElements(By.tagName("li"));
        int size = results.size();

        System.out.println("The size of the list is: " + size);

        for (int i = 0; i < size; i++) {
            System.out.println(results.get(i).getText());
        }

        Thread.sleep(3000);
        for (WebElement result : results) {
            if (result.getText().equals(searchingText)) {
                result.click();
                System.out.println("Selected: " + result.getText());
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
