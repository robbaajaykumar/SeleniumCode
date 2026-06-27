package projectS;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		    
		//username
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		
		usernamefield.sendKeys("standard_user");
		  
		//password
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("secret_sauce");
		
		
		//login
		
		WebElement LoginButton = driver.findElement(By.id("Login-button"));
		LoginButton.click();
		
		
		driver.quit();
		
		
		
		
		
		

	}

}
