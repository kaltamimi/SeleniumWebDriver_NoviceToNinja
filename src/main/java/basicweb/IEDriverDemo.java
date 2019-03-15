package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "E:\\Udemy tutorials\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
        String baseURL = "http://www.google.com/";

        WebDriver driver = new InternetExplorerDriver();

        driver.get(baseURL);

    }
}
