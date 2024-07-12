package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelData {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getStringData(int a, int b) throws IOException
	{
		//opens file
		f=new FileInputStream("C:\\Users\\hp\\git\\ProjectJava\\firstmaven\\src\\main\\resources\\testdata.xlsx");
		w=new XSSFWorkbook(f); //opens workbook
		s=w.getSheet("Sheet1");  
		Row r=s.getRow(a);
		Cell cell=r.getCell(b);
		return cell.getStringCellValue();
	}
	
	public static String getIntegerData(int a, int b) throws IOException
	{
		//opens file
		f=new FileInputStream("C:\\Users\\hp\\git\\ProjectJava\\firstmaven\\src\\main\\resources\\testdata.xlsx");
		w=new XSSFWorkbook(f); //opens workbook
		s=w.getSheet("Sheet1");  //selects
		Row r=s.getRow(a);
		Cell cell=r.getCell(b);
		int x=(int) cell.getNumericCellValue();
		return String.valueOf(x);
	}

}
