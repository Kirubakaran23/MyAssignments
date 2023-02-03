package week5day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsColumnsCount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		 List<WebElement> ColumnCountTable1 = driver.findElements(By.xpath("(//table)[1]//th"));
		 System.out.println("Column count of first table is "+ ColumnCountTable1.size());
		 List<WebElement> RowCountTable1 = driver.findElements(By.xpath("(//table)[1]//tr"));
		 System.out.println("Row count of first table is" + RowCountTable1.size());
		 List<WebElement> ColumnCountTable2 =
		 driver.findElements(By.xpath("(//table)[2]//th"));
         System.out.println("Column count of second table is" + ColumnCountTable2.size());
		 List<WebElement> RowCountTable2 =
	     driver.findElements(By.xpath("(//table)[2]//tr"));
	     System.out.println("Row count of second table is " + RowCountTable2.size());
	}
}
