package Day4;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excelfile ----> workbook----> sheet ------>rows-----> cells
public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\Dipali1.Chavan\\eclipse-workspace\\Assign2\\target\\Book1.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int totalrow = sheet.getLastRowNum();
		int totalcol= sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrow);
		System.out.println(totalcol);
		
		for(int r=0;r<totalrow;r++)
		{
			
			XSSFRow currentrow = sheet.getRow(r);
			for(int c=0;c<totalcol;c++)
			{
				XSSFCell cell = currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			
			System.out.println();
		}
		
		book.close();
		file.close();

	}

}
