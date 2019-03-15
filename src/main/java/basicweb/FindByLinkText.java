package basicweb;

import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindByLinkText {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();

        String baseURL = "https://learn.letskodeit.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Pract")).click();



    }
}
