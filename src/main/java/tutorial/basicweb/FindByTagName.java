package tutorial.basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        String baseURL = "http://demostore.x-cart.com/";
        driver.manage().window().maximize();
        driver.get(baseURL);


    }
}
