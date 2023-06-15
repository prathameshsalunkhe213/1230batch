package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/Book1.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		// Sheet sheet = workbook.getSheet("Sheet1");
		// Row row = sheet.getRow(0);
		// Cell value=row.getCell(1);
		 //System.out.println(value);
//		 String value = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
//		 System.out.println(value);
		 for(int i=0;i<=2;i++) {
			 for(int j=0;j<=2;j++) {
		 String value = workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
        System.out.print(value+"          ");
		 
	}
  System.out.println();
}
}
}