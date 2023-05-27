package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataInACol {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\selenium handling excelsheet.xlsx");

	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
	 int LastRowIndex = sh.getLastRowNum();
	 
	 for(int i=0; i<=LastRowIndex;i++)
	 {
		String value = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
	 }
	
	
	
	
	
	
	
	
	
	}
}
