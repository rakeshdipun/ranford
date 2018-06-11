package pagelibrary.com.ranford;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import excel.excel_class;

public class test_excute extends reposetry {
	
	@BeforeTest
	public void verify_launch()
	{
		launch();
	}

@Test(priority=1)
public void verify_login()
{
	login();
}
@Test(priority=2)
public void verify_branches()
{
	branches();
}
/*@Test(priority=3, dataProvider="newbranches")
public void verify_newbranche(String branchename,String adrs1,String adrs2,String adrs3, String  zipcode,String country,String state,String city)
{
	new_branches(branchename,adrs1, adrs2,adrs3,zipcode,country,state, city);
}*/
/*@DataProvider(name="newbranches")
public Object[][] verify_excelcontent()
{
	return excelcontent("data.xls", "Sheet1");
}*/
@Test(priority=3)
public void verify_content()
{
	excel_class.excelconnection("data.xls", "Sheet1");
	
	excel_class.outputexcelconnection("data.xls", "output.xls", "Sheet1");
	
	int j=excel_class.ccount();
	
	for(int i=1;i<excel_class.rcount();i++)
	{
		//String bname=Excel_class.readdata(0, i);
	new_branches(excel_class.readdata(0, i), excel_class.readdata(1, i), excel_class.readdata(2, i), excel_class.readdata(3, i), excel_class.readdata(4, i), excel_class.readdata(5, i),excel_class.readdata(6, i),excel_class.readdata(7, i));
		
		String txt = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		if(txt.contains("created succesufully"))
		{
			
			excel_class.writedata(j++, i, txt);
			j--;
		}
		else if(txt.contains("already Exists"))
		{
			
			excel_class.writedata(j++, i, "Test Failed");
			j--;
		}
		else
		{
			
			excel_class.writedata(j++, i, "alert is n/a");
			j--;
		}
		
		
		
	}
	excel_class.saveworkbook();
}

/*@Test
public void verify_employee()
{
	employee();
}*/
/*@Test
public void verify_new_employee()
{
	newemployee();
}*/
}
