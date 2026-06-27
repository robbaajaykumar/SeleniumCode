package projectS;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Program2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		
		
		//Gmail SS
		File screenshortFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		File destinationFile = new File("Screenshots/loginPage.png");
		
		FileUtils.copyFile(screenshortFile, destinationFile);
		
		
	System.out.println("Gmail Screenshot is successfull");
	
	driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
	
	// inbox ss
	
	File screenshortFile2 =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	
	File destinationFile2 = new File("Screenshots/InboxPage.png");
	
	FileUtils.copyFile(screenshortFile2, destinationFile2);
	System.out.println("Inbox Screenshot is successfull");
	
		
		driver.quit();
		
	}

}
