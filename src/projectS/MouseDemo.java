package projectS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		try {
			// Mouse Hover
			
			Actions action = new Actions(driver);
			
			driver.get("https://the-internet.herokuapp.com/hovers");
			
			WebElement firstIcon = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
			
			action.moveToElement(firstIcon).perform();
			
			System.out.println("Mouse Hover Performed");
			
			
			Thread.sleep(3000);
			
			
			// Right Click
			
			driver.get("https://the-internet.herokuapp.com/context_menu");
			
			WebElement hotSpot = driver.findElement(By.id("hot-spot"));
			
			action.contextClick(hotSpot).perform();
			
			System.out.println("Right Click Performed");
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().accept();
			
			
		  
			
		}
		
		finally {
			
			
			driver.quit();
			
			
		}

	}

}
