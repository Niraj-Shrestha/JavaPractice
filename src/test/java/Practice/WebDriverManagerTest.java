package Practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class WebDriverManagerTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String actual = driver.getTitle();
        String expected = "Selenium WebDriver";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual,expected,"not matched");
        driver.quit();
    }
}