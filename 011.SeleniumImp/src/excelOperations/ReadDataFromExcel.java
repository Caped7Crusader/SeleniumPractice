package excelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C://Users//dines//Downloads//20230625_115614_db710ec3-cda6-4477-b835-63324d0822e7.xlsx/");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		for(int r = 0; r < sh.getLastRowNum(); r++) {
			XSSFRow row = sh.getRow(r);
			for(int c = 0; c < row.getLastCellNum(); c++) {
				XSSFCell cell = row.getCell(c);
				switch(cell.getCellType()){
					case STRING: System.out.println(cell.getStringCellValue());break;
					case NUMERIC: System.out.println(cell.getNumericCellValue());break;
					default: break;		
				}
			}
		}
		
		wb.close();
		
	}

}
