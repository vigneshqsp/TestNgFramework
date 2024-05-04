package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static String getCellData() throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelUtility.xlsx");

		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Register");

		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);

		String CellValue = cell.getStringCellValue();
		System.out.println(CellValue);
		return CellValue;
	}
	
	
	public static void main(String[] args) throws IOException {
		getCellData();
	}

}