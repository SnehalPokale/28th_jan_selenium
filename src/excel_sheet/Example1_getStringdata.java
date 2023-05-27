package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\selenium handling excelsheet.xlsx");
	
		Cell value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1);
		System.out.println(value);
		
//		Workbook book = WorkbookFactory.create(file);
//		Sheet sh = book.getSheet("sheet1");
//		
//		Row rw = sh.getRow(0);
//		Cell c1 = rw.getCell(0);
//		String value = c1.getStringCellValue();
//		
		//System.out.println(value);
		
	}
}
