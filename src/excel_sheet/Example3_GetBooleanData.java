package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_GetBooleanData {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\ankus\\\\OneDrive\\\\Desktop\\\\Study\\\\selenium handling excelsheet.xlsx");
		
	
		 boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(3).getBooleanCellValue();
		
		System.out.println(value);
		
}

}
