package projectS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class E2E_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			
			driver.manage().window().maximize();
			driver.get("https://www.demoblaze.com/index.html");
			
			driver.findElement(By.id("login2")).click();
			
			Thread.sleep(5000);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
			
			driver.findElement(By.id("loginusername")).sendKeys("ajaybabu");
			driver.findElement(By.id("loginpassword")).sendKeys("251201");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			
			Thread.sleep(5000);
			
			// products
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sony xperia z5"))).click();
			Thread.sleep(2000);
			
			
			
			
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart"))).click();
			
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			
			driver.findElement(By.id("cartur")).click();
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']"))).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("name")).sendKeys("FLM Demo");
			driver.findElement(By.id("country")).sendKeys("India");
			driver.findElement(By.id("city")).sendKeys("Hyderabad");
			driver.findElement(By.id("card")).sendKeys("VISA");
			driver.findElement(By.id("month")).sendKeys("June");
			driver.findElement(By.id("year")).sendKeys("2026");
			
			driver.findElement(By.xpath("//button[text()='Purchase']")).click();
			
			
		}finally 
		{
			driver.quit();
		}

	}

}
