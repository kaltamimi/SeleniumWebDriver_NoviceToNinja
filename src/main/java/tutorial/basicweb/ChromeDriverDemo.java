package tutorial.basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Udemy tutorials\\chromedriver_win32\\chromedriver.exe");
        String baseURL = "https://www.google.com/";

        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        driver.findElement(By.cssSelector("[maxlength]")).sendKeys("letskodeit");
        driver.findElement(By.className("z1asCe MZy1Rb")).click();

    }
}
