package excel_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class example3_getColSizeInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\selenium handling excelsheet.xlsx");
		short colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();

		System.out.println(colSize);
	}
}