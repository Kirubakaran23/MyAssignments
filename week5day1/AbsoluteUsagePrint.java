package week5day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteUsagePrint {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://html.com/tags/table/");
			List<WebElement>data = driver.findElements(By.xpath("//td[text()='Absolute Usage']//following-sibling::td"));
			for (int i = 0; i < data.size(); i++) {
				
				String text = data.get(i).getText();
				System.out.println(text);
			}
	}

}
