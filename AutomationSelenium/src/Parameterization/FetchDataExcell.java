package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataExcell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\supek\\OneDrive\\Desktop\\VelocitySonali.xlsx");

		//double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
	//	System.out.println(data);
		
		

	  // String value = WorkbookFactory.create(data).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		//System.out.println(value);
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");// sheet read
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(1);
		String username = cell.getStringCellValue();
		System.out.println(username); // username1


		
		// boolean value1
		// =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		// System.out.println(value1);

		// boolean value2
		// =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
		// System.out.println(value2);
		
		
		for(int i = 0; i<=1; i++){ 
				for(int j=0; j<=1; j++){
					System.out.println();
				}
			}
			

	}
}


