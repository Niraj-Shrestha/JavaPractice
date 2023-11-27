package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePage extends BasePage{
    public SamplePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "identifierId")
    private WebElement idDocs;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")
    private WebElement aXpathDocs;
    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    private WebElement rXpathDocs;
    @FindBy(css = "#identifierId")
    private WebElement cssDocs;

    public void clickIDDocs(){
        idDocs.click();
    }
    public void clickAXpathDocs(){
        aXpathDocs.click();
    }
    public void clickRXpathDocs(){
        rXpathDocs.click();
    }
    public void clickCSSDocs(){
        cssDocs.click();
    }
}
