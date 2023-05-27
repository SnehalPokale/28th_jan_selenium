package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataByVerifyingTypeOfCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\selenium handling excelsheet.xlsx");
    
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
	Cell celllnfo = sh.getRow(0).getCell(1);
	
	CellType s1 = celllnfo.getCellType();
	
	if(s1==CellType.STRING)
	{
		String value = celllnfo.getStringCellValue();
	    System.out.println(value);
	}
	else if(s1==CellType.NUMERIC)
	{
		double value = celllnfo.getNumericCellValue();
		System.out.println(value);
	}
	else if(s1==CellType.BOOLEAN)
	{
		boolean value = celllnfo.getBooleanCellValue();	
	    System.out.println(value);
	
	}



}
}
