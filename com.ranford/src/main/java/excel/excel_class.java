package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;

import TestBase.Base;
import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class excel_class extends Base{
	public static String folderpath=config("excelfolderpath");
	static Sheet sh;
	static Workbook wb;
	static WritableWorkbook wwb;
	 static WritableSheet wsh;
	public static void excelconnection(String filename,String sheetname)
	{
		File f=new File(folderpath+filename);
		try {
			wb=Workbook.getWorkbook(f);
			sh=wb.getSheet(sheetname);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		}

	public static int rcount()
	{
		int i=sh.getRows();
		return i;
	}
	public static int ccount()
	{
	int i=sh.getColumns();
	return i;
	}
	public static String readdata(int col,int row)
	{
		String x=sh.getCell(col, row).getContents();
		return x;
	}
		public static void outputexcelconnection(String ifilename,String ofilename,String sheetname)
		{
			
			try {
				FileInputStream fis=new FileInputStream(folderpath+ifilename);
				
				 wb=Workbook.getWorkbook(fis);
					
				 sh=wb.getSheet(sheetname);
				 
				 FileOutputStream fos=new FileOutputStream(folderpath+ofilename);
				 
				wwb=Workbook.createWorkbook(fos, wb);
				 
				 wsh=wwb.getSheet(sheetname);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
		public static void writedata(int col,int row,String data)
		{
			try {
				Label l=new Label(col, row, data);
				wsh.addCell(l);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		public static void saveworkbook()
		{
			try {
				wwb.write();
				
				wwb.close();
				wb.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}




