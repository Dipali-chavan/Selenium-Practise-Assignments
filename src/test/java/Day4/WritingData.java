package Day4;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
             FileOutputStream file = new FileOutputStream("C:\\Users\\Dipali1.Chavan\\eclipse-workspace\\Assign2\\target\\book.xlsx");
             XSSFWorkbook book = new XSSFWorkbook();
             XSSFSheet sheet = book.createSheet("Data");
             
             XSSFRow row1 = sheet.createRow(1);
                row1.createCell(0).setCellValue("Dipali");
                row1.createCell(1).setCellValue("kkw");
                row1.createCell(2).setCellValue("Pune");
                
             XSSFRow row2 = sheet.createRow(2);
                row2.createCell(0).setCellValue("Sakshi");
                row2.createCell(1).setCellValue("Sinhgad");
                row2.createCell(2).setCellValue("Pune");
                
                
            XSSFRow row3 = sheet.createRow(3);
                row3.createCell(0).setCellValue("Ram");
                row3.createCell(1).setCellValue("sinhgad");
                row3.createCell(2).setCellValue("Nashik");
                
            XSSFRow row4 = sheet.createRow(4);
                row4.createCell(0).setCellValue("sita");
                row4.createCell(1).setCellValue("sinhgad");
                row4.createCell(2).setCellValue("Nashik");
                
                book.write(file);
                book.close();
                file.close();
                
                
             
	}

}
