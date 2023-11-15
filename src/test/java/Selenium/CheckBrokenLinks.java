package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CheckBrokenLinks extends DriverSetup{

    @Test(enabled = false)
    public void checkBrokenLinks(){
        String URL = "https://www.fidelityinvestments.ie/";
        try{
            driver.get(URL);
            driver.manage().window().maximize();

            driver.findElement(By.id("onetrust-accept-btn-handler")).click();

            //driver.findElement(By.xpath("//a[@href='https://www.fidelityinvestments.ie/job-search-results/']")).click();

            List<WebElement> links = driver.findElements(By.tagName("a"));
            for(WebElement e : links){
                String link = e.getAttribute("href");
                checkLinks(link);
            }

        } catch (WebDriverException e){
            throw new WebDriverException(e);
        } finally {
            driver.quit();
        }
    }

    static void checkLinks(String url){
        try{
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();

            if(httpURLConnection.getResponseCode() == 200){
                System.out.println(url + " : is working fine");
            }else System.out.println(url + " : is Broken Link" + "[ "+httpURLConnection.getResponseCode()+"]");

        }catch (MalformedURLException e){
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
