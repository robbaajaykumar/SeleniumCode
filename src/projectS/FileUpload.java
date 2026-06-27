package projectS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		
		String path ="C:\\Users\\HP\\Downloads\\Java_NIO_Tutorial.pdf";
		
		
		System.out.println("path of file"+ path);
		
		
		WebElement fileInput = driver.findElement(By.id("file-upload"));
		
		fileInput.sendKeys(path);
		
		
		driver.findElement(By.id("file-submit")).click();
		
		WebElement successHeader = driver.findElement(By.tagName("h3"));
		
		System.out.println("status"+ successHeader.getText());
		
		

	}

}
