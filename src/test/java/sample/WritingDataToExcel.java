package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\E1Selenium\\TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Cart");
//		sh.createRow(1).createCell(1).setCellValue("hello");
		sh.getRow(1).createCell(1).setCellValue("hello");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\rajat burnwal\\Desktop\\E1Selenium\\TestData.xlsx");
		wb.write(fos);

	}

}
