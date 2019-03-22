package tutorial.basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IdXPathDemo {
    public static void main(String[] args) {

        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();

        String baseURL = "https://www.google.com/";

        driver.get(baseURL);
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("[maxlength]")).sendKeys("letskodeit");
        driver.findElement(By.cssSelector(".MZy1Rb")).click();

    }
}
