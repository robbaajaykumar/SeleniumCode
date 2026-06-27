package projectS;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		
		// tables
		for( WebElement table : tables) {
			
			
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			
			// rows
			for(WebElement row : rows) {
				
				System.out.println(row.getText());
			}
			
			
			System.out.println();
			
		}
		
		driver.quit();
		
		;

	}

}
