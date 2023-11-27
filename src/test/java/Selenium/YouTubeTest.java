package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class YouTubeTest extends  DriverSetup{

    @Test(enabled = false)
    public void youTube() {
        String URL = "https://www.youtube.com/";
        String Title = "YouTube";
        try{
            driver.get(URL);
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));

            WebElement searchInput = driver.findElement(By.xpath("//input[@id='search']"));
            searchInput.sendKeys("First Youtube Vide");
            searchInput.sendKeys("o");

            Thread.sleep(2000);

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ENTER).perform();
            /*WebElement searchKey = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
            searchKey.click();*/

            /*Thread.sleep(2000);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='gstl_50 sbdd_a']/div[2]/div/div/ul")));
            List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='gstl_50 sbdd_a']/div[2]/div/div/ul/li"));

            suggestions.get(7).click();*/

            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Me at the zoo')]")));
            //WebElement videoLink = driver.findElement(By.xpath("//*[contains(text(), 'Me at the zoo')]"));


            //*[@id="video-title"]/yt-formatted-string

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='video-title']/yt-formatted-string")));
            List<WebElement> results = driver.findElements(By.xpath("//*[@id='video-title']/yt-formatted-string"));
            for(WebElement e : results){
                System.out.println(e);
            }

            results.get(3).click();

            Thread.sleep(2000);

        } catch (WebDriverException e){
            throw new WebDriverException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.quit();
        }
    }


}
