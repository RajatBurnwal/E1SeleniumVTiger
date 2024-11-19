package sample;

import genericUtility.ExcelUtility;

public class DataDrivenFromExcel {

	public static void main(String[] args) throws Exception {
		
//		FileInputStream fis=new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\E1Selenium\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Cell c=wb.getSheet("Admin").getRow(1).getCell(0);
//		DataFormatter df=new DataFormatter();
//		String value=df.formatCellValue(c);
//		System.out.println(value);
		
		ExcelUtility eu=new ExcelUtility();
		String value1=eu.getDataFromExcel("Admin", 2, 2);
		String value2=eu.getDataFromExcel("Cart", 3, 2);
		System.out.println(value1);
		System.out.println(value2);

	}

}
