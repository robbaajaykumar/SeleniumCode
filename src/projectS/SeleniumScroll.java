package projectS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			
		   driver.get("https://jqueryui.com/droppable/");
		   
		   
		   WebElement frame = driver.findElement(By.className("demo-frame"));
		 
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   
		   
		   driver.switchTo().frame(frame);
		   WebElement src = driver.findElement(By.id("draggable"));
		   WebElement des = driver.findElement(By.id("droppable"));
		   
		   Actions actions = new Actions(driver);
		   
		   actions.dragAndDrop(src, des).perform();
		   Thread.sleep(6000);
			
			
		}
		
		finally {
			driver.quit();
			
		}
	}

}
