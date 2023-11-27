package Selenium;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runtime extends DriverSetup {

    private SamplePage SamplePage;
    @BeforeTest
    public void before(){
        SamplePage = PageFactory.initElements(driver, SamplePage.class);
    }
    @Test(priority = 1)
    public void testID() {
        long s = System.currentTimeMillis();
        SamplePage.clickIDDocs();
        long e = System.currentTimeMillis();
        long r = e - s;
        System.out.println("ID load time in milliseconds: " + r);
    }
    @Test(priority = 2)
    public void testAXpath() {
        long s = System.currentTimeMillis();
        SamplePage.clickAXpathDocs();
        long e = System.currentTimeMillis();
        long r = e - s;
        System.out.println("Absolute Xpath load time in milliseconds: " + r);
    }
    @Test(priority = 3)
    public void testRXpath() {
        long s = System.currentTimeMillis();
        SamplePage.clickRXpathDocs();
        long e = System.currentTimeMillis();
        long r = e - s;
        System.out.println("Relative Xpath load time in milliseconds: " + r);
    }
    @Test(priority = 4)
    public void testCSS() {
        long s = System.currentTimeMillis();
        SamplePage.clickCSSDocs();
        long e = System.currentTimeMillis();
        long r = e - s;
        System.out.println("CSS Selector load time in milliseconds: " + r);
    }
}
