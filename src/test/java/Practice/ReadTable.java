package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ReadTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        List<String> result = new ArrayList<>();

        WebElement table = driver.findElement(By.id("customers"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                String cellText = cell.getText();
                result.add(cellText);
            }
        }

        int depth = 1; // You can adjust the depth as needed
        int rows1 = 3;
        int columns = result.size() / (depth * rows1);
        String[][][] array3D = new String[depth][rows1][columns];

        // Populate the 3D array from the list
        int index = 0;
        for (int d = 0; d < depth; d++) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns; j++) {
                    array3D[d][i][j] = result.get(index);
                    index++;
                }
            }
        }

        // Print the 3D array
        for (int d = 0; d < depth; d++) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(array3D[d][i][j] + "\t" + "|"+ "\t" );
                }
                System.out.println(); // Move to the next row
            }
            System.out.println(); // Add a space between depths
        }

        driver.quit();
    }
}
