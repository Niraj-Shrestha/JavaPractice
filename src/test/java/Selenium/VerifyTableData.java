package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyTableData extends DriverSetup {

    @Test(enabled = false)
    public void verifyTableData() {
        String URL = "https://developer.mozilla.org/en-US/docs/Learn/HTML/Tables/Basics/";
        try{
            driver.get(URL);
            driver.manage().window().maximize();

            driver.switchTo().frame(driver.findElement(By.id("frame_how_does_a_table_work")));


            WebElement data = driver.findElement(By.xpath("/html/body/table/tbody"));

            List<WebElement> table_rows = data.findElements(By.tagName("tr"));
            String[][] newTable = null;
            int row_size = table_rows.size();;

            for(int rows =0; rows<row_size;rows++){
                List<WebElement> table_column = table_rows.get(rows).findElements(By.tagName("td"));
                int column_size = table_column.size();
                for(int column=0; column<column_size;column++){
                    newTable = new String[table_rows.size()][table_column.size()];
                    String text = table_column.get(column).getText();
                    newTable[rows][column] = text;
                    //System.out.println(newTable[rows][column]+ "\t" + "|"+ "\t" );
                }
            }

            for(int i =0 ;i < newTable.length; i++){
                for(int j=0; j < newTable[i].length; j++){
                    System.out.println(newTable[i][j] + "\t");
                }
                System.out.println("________________________________________");
            }
        } catch (WebDriverException e){
            throw new WebDriverException(e);
        } finally {
            driver.quit();
        }
    }

}
