package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.WaitTypes;

public class SearchPage {

    public static WebElement element = null;

    /**
     * Returns the flight origin text box element
     * @param driver
     * @return
     */
    public static WebElement originTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-origin"));
        return element;
    }

    /**
     * Returns the flight destination text box element
     * @param driver
     * @return
     */
    public static WebElement destinationTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-destination"));
        return element;
    }

    /**
     * Returns the departure date text box element
     * @param driver
     * @return
     */
    public static WebElement departureDateTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-departing"));
        return element;
    }


    /**
     * Returns the search button box element
     * @param driver
     * @return
     */
    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.id("search-button"));
        return element;
    }

    /**
     * Click on search button
     * @param driver
     */
    public static void clickOnSearchButton(WebDriver driver) {
        element = searchButton(driver);
        element.click();
    }


    /**
     * Clear all the fields on the Search page
     * @param driver
     */
    public static void clearAllFields(WebDriver driver) {
        driver.findElement(By.id("flight-origin")).clear();
        driver.findElement(By.id("flight-destination")).clear();
        driver.findElement(By.id("flight-departing")).clear();
        driver.findElement(By.id("flight-returning")).clear();
    }

    /**
     * Fill origin city in origin text box
     * @param driver
     * @param origin
     */
    public static void fillOriginTextBox(WebDriver driver, String origin) throws Exception {
        element = originTextBox(driver);
        element.sendKeys(origin);
        Thread.sleep(2000);
        element.sendKeys(Keys.TAB);
    }

    /**
     * Fill destination city in destination text box
     * @param driver
     * @param driver
     */
    public static void fillDestinationTextBox(WebDriver driver, String destination) throws Exception {
        element = destinationTextBox(driver);
        element.sendKeys(destination);
        Thread.sleep(2000);
        element.sendKeys(Keys.TAB);
    }

    /**
     * Fill departure date in departure date text box
     * @param driver
     * @param date
     */
    public static void fillDepartureDateTextBox(WebDriver driver, String date) {
        element = departureDateTextBox(driver);
        element.sendKeys(date);
    }

    /**
     * Returns the return date text box element
     * @param driver
     * @return
     */
    public static WebElement returnDateTextBox(WebDriver driver) {
        element = driver.findElement(By.id("flight-returning"));
        return element;
    }

    /**
     * Fill return date in return date text box
     * @param driver
     * @param date
     */
    public static void fillReturnDateTextBox(WebDriver driver, String date) {
        element = returnDateTextBox(driver);
        element.clear();
        element.sendKeys(date);
    }

    /**
     * Navigate to flights tab
     * @param driver
     */
    public static void navigateToFlightsTab(WebDriver driver) {
        driver.findElement(By.id("header-history")).click();
        element = driver.findElement(By.id("tab-flight-tab"));
        element.click();
    }
    /**
     * Click on Advanced Options link
     * @param driver
     */
    public static void clickOnAdvancedLink(WebDriver driver) {
        element = driver.findElement(By.id("advanced-options"));
        element.click();
    }
    /**
     * Click non-stop check box
     * @param driver
     */
    public static void clickNonStopCheckBox(WebDriver driver) {
        element = driver.findElement(By.id("advanced-flight-nonstop"));
        element.click();
    }
    /**
     * Select flight class
     * @param driver
     */
    public static void selectFlightClass(WebDriver driver, String flightClass) {
        Select options = new Select(driver.findElement(By.id("flight-advanced-preferred-class")));
        options.selectByValue(flightClass);
    }

    /**
     * Select flight adults
     * @param driver
     * @param flightAdults
     */
    public static void selectFlightAdults(WebDriver driver, String flightAdults) {
        Select options = new Select(driver.findElement(By.id("flight-adults")));
        options.selectByValue(flightAdults);
    }
}