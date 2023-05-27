package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_GetNumericData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\ankus\\\\OneDrive\\\\Desktop\\\\Study\\\\selenium handling excelsheet.xlsx");
		
	//	Workbook book = WorkbookFactory.create(file);
		
		double value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
		
		System.out.println(value);
		
		
		
		
	}
}
