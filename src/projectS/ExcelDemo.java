package projectS;
import java.io.*;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filepath = "Testing.xlsx";
		//String filePath = "C:\\Users\\HP\\eclipse-workspace\\ProjectS\\Demo.xlsx";
//		
//	   try(XSSFWorkbook workbook = new XSSFWorkbook()){
//		   
//		   XSSFSheet sheet = workbook.createSheet("TestingSampleData1");
//		   XSSFSheet sheet2 = workbook.createSheet("Testing SampleData2");
//		   
//		   sheet.createRow(0).createCell(0).setCellValue("UserName");
//		   sheet.getRow(0).createCell(1).setCellValue("Password");
//		   
//		   
//		   sheet2.createRow(0).createCell(0).setCellValue("Functional Testing");
//	       sheet2.createRow(1).createCell(0).setCellValue("API");
//	     sheet2.createRow(2).createCell(0).setCellValue("Selenium");
//		   
//		   FileOutputStream fos = new FileOutputStream(filepath);
//		   workbook.write(fos);
		   
		   // Reading the excel file
		   FileInputStream fis = new FileInputStream(filepath);
		   
		   XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		   
		   
		   XSSFSheet sheet3 = workbook1.getSheet("TestingSampleData1");	   
		   
		   String Value = sheet3.getRow(0).getCell(0).getStringCellValue();
		   
		   System.out.println(" Value in excel sheet Testing Sampledata1"+Value);
	   }
	}


