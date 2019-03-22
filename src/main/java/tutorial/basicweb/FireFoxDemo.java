package tutorial.basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {
    public static void main(String[] args) {

        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "E:\\Udemy tutorials\\geckodriver-v0.24.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();

        String baseURL = "https://www.google.com/";

        driver.get(baseURL);
    }
}
