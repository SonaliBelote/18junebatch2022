package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCELLSHEET1 {
public static void main(String[] args) throws IOException {
String excelPath = "C:\\Users\\supek\\OneDrive\\Desktop\\ExecellSheet2.xlsx";
    
	//excel file read
	FileInputStream file = new FileInputStream(excelPath);
	
	//workbook read --> apache poi
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	//sheet read
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	// username1
	XSSFRow row = sheet.getRow(0);
	XSSFCell cell1 = row.getCell(1);
	String username = cell1.getStringCellValue();
	System.out.println(username);    // username1
	
	// password1
	XSSFRow row1 = sheet.getRow(1);
	XSSFCell cell2 = row1.getCell(2);
	boolean  password = cell2.getBooleanCellValue();
	System.out.println(password);    // password1
	
	XSSFRow row2 = sheet.getRow(2);
	XSSFCell cell3 = row.getCell(3);
	String value = cell3.getStringCellValue();
	System.out.println(value); 
	
	
	int lastRowNum = sheet.getLastRowNum();

	for(int i = 0; i<=3; i++)
		{ 
		for(int j=0; j<=3; j++)
		{
			XSSFRow ROWS = sheet.getRow(i);
			XSSFCell CELLS = row.getCell(j);
				String data = CELLS.getStringCellValue();
				System.out.println(data);
			}
		}


	
	
	
	//homework--> try this
	//WebElement user = driver.findElement(By.xpath("(//input [@class = 'input_error form_input'])[2]"));
	//user.sendKeys(username);
	
//	WebElement pass = driver.findElement(By.xpath("(//input [@class = 'input_error form_input'])[2]"));
	//pass.sendKeys(password);
	
	
}

}

