package projectS;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
         //Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		 try {
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");;
		  
		  driver.findElement(By.id("start")).click();
		  
		  
		  //Explicit wait
		  WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  
		  WebElement status = explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		  
		  
		  
	   }
		 
		 
		 finally {
			 
			 
		 }
	}
}
