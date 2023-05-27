package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataInASheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\selenium handling excelsheet.xlsx");
	   Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
	   int LastRowIndex = sh.getLastRowNum();
	
	for(int i=0;i<=LastRowIndex;i++)
	{
		int LastCellIndex = sh.getRow(i).getLastCellNum()-1;
		
		for(int j=0;j<=LastCellIndex;j++)
		{
		String value = sh.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();
	}
	
	}
}
