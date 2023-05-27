package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowSizeInASheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\selenium handling excelsheet.xlsx");
		int rowsize = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum()+1;
		
		
		System.out.println(rowsize);
		
		
		
		
		
		
		
	}
	
	
}
