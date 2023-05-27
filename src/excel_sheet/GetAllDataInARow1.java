package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataInARow1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\selenium handling excelsheet.xlsx");
        
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
	
	        int LastCellIndex = sh.getRow(0).getLastCellNum()-1;
	
	        for(int i=0; i<=LastCellIndex;i++)
	        {
	        	Cell CellInfo = sh.getRow(0).getCell(i);
	        	
	        	CellType s1 = CellInfo.getCellType();
	        	
	        	if(s1==CellType.STRING)
	        	{
	        		String value = CellInfo.getStringCellValue();
	        		System.out.print(value +" " );
	        	}
	        	if(s1==CellType.NUMERIC)
	        	{
	        		double value1 = CellInfo.getNumericCellValue();
	        		System.out.print(value1 + " ");
	        	}
	        	if(s1==CellType.BOOLEAN)
	        	{
	        		boolean value2 = CellInfo.getBooleanCellValue();
	        		System.out.print(value2 +" ");
	        	
	        	}
	        		
	        	
	        	
	        }
	
	
	
	
	}
}
