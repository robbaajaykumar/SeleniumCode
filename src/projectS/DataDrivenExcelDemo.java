package projectS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.*;
public class DataDrivenExcelDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		String filePath="LoginTestData_Sheet1.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		try {
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			WebDriver driver = new ChromeDriver();
			
			for(int i=1 ; i<=10;i++) {
				
				
			String Username = sheet.getRow(i).getCell(0).getStringCellValue();
			String Password = sheet.getRow(i).getCell(1).getStringCellValue();
			
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			driver.findElement(By.id("username")).sendKeys(Username);
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.id("submit")).click();
			
			
			//WebElement Message = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("hi")));
			
			}
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		

	}

}
