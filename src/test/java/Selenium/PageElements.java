package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageElements {

    WebDriver driver;
    public PageElements(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//a[text()='Senior QA Engineer']")
    private WebElement result;

    @FindBy(xpath = "//a[text()='>']")
    private WebElement next;

    public boolean checkResultIsDisplayed(){

        try {
            WebElement t = driver.findElement(By.xpath("//a[text()='Senior QA Engineer']"));
            if (t.isDisplayed()){
                System.out.println("Element is visible");
                return true;
            }
        }catch (Exception e){
            return false;
        }
            return false;
    }

    public void clickResult(){
        result.click();
    }

    public void clickNext(){
        next.click();
    }
}
