package Day4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DyanamicData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Dipali1.Chavan\\eclipse-workspace\\Assign2\\target\\Dyanamic.xlsx");
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Dyanamic");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter no of col");
		int cols = sc.nextInt();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell =row.createCell(c);
				cell.setCellValue(sc.next());
				
			}
		}
		 
		
		book.write(file);
		book.close();
		file.close();
		System.out.println("file created succesfull");
		
		
		
		
				
		

	}

}
