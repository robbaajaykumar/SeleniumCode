package projectS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		
		
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
		
		
		checkbox1.click();
		checkbox2.click();
		
		
        System.out.println("checkbox1 status:"+ checkbox1.isSelected());
		
		System.out.println("checkbox2 status:"+ checkbox2.isSelected());
		System.out.println("checkbox3 status:"+ checkbox3.isSelected());
		
		if ( checkbox1.isSelected()) {
			
			checkbox1.click();
		}
	}

}
