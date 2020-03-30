package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider="testqdata")
	public void test1(String userName, String password) {
		System.out.println(userName+" | "+password);
		
	}
	
	
	
	
	
	
	@DataProvider(name="testqdata")
		public Object getData() {
		String path="/Users/MuthuChrish/eclipse-workspace/seleniumframework/excel/data.xlsx";
		Object data[][]=testData(path,"Sheet1");
		return data;
	}
	
	public static Object[][] testData(String path,String sheetName) {
		ExcelUtils excel = new ExcelUtils(path, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object[][] data=new Object[rowCount-1][colCount];
		for (int i=1;i<rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				String cellData= excel.getCellData(i,j);
				System.out.print(cellData+ " | ");
				data[i-1][j]=cellData;
				
			}
			System.out.println();
		} 
		return data;
	}
	

}
 /*1. How to get test data from excel
2. How to create excel data provider function
3. How to use testNG @DataProvider
4. How to refer test data from DataProvider
5. Run a sample data driven Selenium Test

helpful tips

Prerequisite

Add excel reading libraries (Apache POI)
Create functions to read data from excel
Watch the video - https://www.youtube.com/watch?v=CV3SO...*/