package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {

    WebDriver driver;

    @BeforeSuite
    void setupWebDriver(){
        driver = new ChromeDriver();
    }
}
