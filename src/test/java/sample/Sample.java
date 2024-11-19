package sample;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.IPathConstant;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		Sample s=new Sample();
		List<String> a1 = s.getMultipleDataFromExcel("Leads", 2, 0);
		System.out.println(a1);

	}
	
	public List<String> getMultipleDataFromExcel(String sheetName, int startRowIndex, int startCellIndex) throws Exception
	{
		ArrayList<String> a1=new ArrayList<String>();
		FileInputStream fis=new FileInputStream(IPathConstant.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		System.out.println(sh.getLastRowNum());
		DataFormatter df=new DataFormatter();
		for(int i=startRowIndex;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=startCellIndex;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				String value=df.formatCellValue(c);
				a1.add(value);			}
		}
		
		return a1;
	}

}
