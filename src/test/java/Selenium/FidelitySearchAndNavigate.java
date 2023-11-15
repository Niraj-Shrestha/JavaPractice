package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FidelitySearchAndNavigate extends  DriverSetup{

    private PageElements pageElements;
    @BeforeTest
    public void getPages(){
        driver = new ChromeDriver();
        pageElements = PageFactory.initElements(driver,PageElements.class);
    }

    @Test(enabled = true)
    public void fidelity() {
        String URL = "https://www.fidelityinvestments.ie/";
        try{
            driver.get(URL);
            driver.manage().window().maximize();

            driver.findElement(By.id("onetrust-accept-btn-handler")).click();

            driver.findElement(By.xpath("//a[@href='https://www.fidelityinvestments.ie/job-search-results/']")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

            while (true) {
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Senior QA Engineer']")));
                    WebElement result = driver.findElement(By.xpath("//a[text()='Senior QA Engineer']"));
                    result.click();
                    break;

                } catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
                    Thread.sleep(1000);
                    WebElement nextButton = driver.findElement(By.xpath("//a[text()='>']"));
                    nextButton.click();
                }
            }
            String text = driver.findElement(By.xpath("//*[@id='tab-94faf676d935199f0fd']/div[1]")).getText();
            String[] words = text.split("\\s");
            List<String> wordList = new ArrayList<>();
            for(String word : words){
                wordList.add(word);
            }
            int count = 0;
            String expectedWord = "software";
            for(int i=0;i< wordList.size(); i ++){
                if(wordList.get(i).equalsIgnoreCase(expectedWord)){
                    count++;
                }
            }
            System.out.println(expectedWord + " appears " + count + " times.");

        } catch (WebDriverException | InterruptedException e){
            throw new WebDriverException(e);
        } finally {
            driver.quit();
        }
    }

}
