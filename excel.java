package final_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	
	public int count() throws IOException
	{
	    File f =new File("C:\\Users\\Samii\\Downloads\\Compressed\\New folder\\test.xlsx");
	    FileInputStream fis =new FileInputStream(f);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sh = wb.getSheet("Sheet1");
	    
	    int count =sh.getPhysicalNumberOfRows();
	    return count;
	}
	
	public String getdata(int x , int y ) throws IOException
	{
	    File f =new File("C:\\Users\\Samii\\Downloads\\Compressed\\New folder\\test.xlsx");
	    FileInputStream fis =new FileInputStream(f);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sh = wb.getSheet("Sheet1");

	    String testdata=sh.getRow(x).getCell(y).getStringCellValue();
	    return testdata;

	}
	
}
