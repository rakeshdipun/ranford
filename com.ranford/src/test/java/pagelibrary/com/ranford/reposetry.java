package pagelibrary.com.ranford;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


import TestBase.Base;
import Utility.Library;
import Utility.Validation;
import excel.excel_class;

public class reposetry extends Base {

	WebDriver driver;
	
	public void launch(String brow)
	{
		if(brow.contains("firefox"))
		{
			System.setProperty(config("firefoxname"),config("firefoxpath"));
			driver=new FirefoxDriver();
		}
		else if(brow.contains("chrome"))
		{
			System.setProperty(config("chromename"),config("chromepath"));
			driver=new ChromeDriver();
		}
		
		driver.get(config("bankurl"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		if(Validation.IsTextPresent(driver, "XIM Bank dates back"))
		{
			Reporter.log("Test is passed");
		}
		else
		{
			Reporter.log("Test is failed");
			
			Library.attachement("launch");
			
		}
	}
	public void login()
	{
		HomePage.UserName_editbox(driver).sendKeys(config("username"));
		HomePage.pass_editbox(driver).sendKeys(config("password"));
		HomePage.login_btn(driver).click();
		if(Validation.Istitlepresnt(driver, "Welcome to Admin"))
		{
			Reporter.log("Test is passed");
		}
		else{
			Reporter.log("Test is failed");
			Library.screenshort("login");
		}
	}
	public void branches(){

		admin.branchenms(driver).click();
		genericpage.dropDownSelection(driver,getlocator("branches_cntry_btm")).selectByVisibleText("INDIA");
		genericpage.ComparedropDownValues(driver, getlocator("branches_state_slt"),("GOA"));
		genericpage.ComparedropDownValues(driver, getlocator("branches_city_slt"),("GOA"));
		branches.search(driver).click();
		//branches.clear(driver).click();
		
	}
	
	
	public void new_branches(String branchename,String adrs1,String adrs2,String adrs3,String  zipcode,String country,String state,String city ){
		new_branche.newbranche(driver).click();
		new_branche.brnchnme(driver).sendKeys(branchename);
		new_branche.adrs1(driver).sendKeys(adrs1);
		new_branche.adrs2(driver).sendKeys(adrs2);
		new_branche.adrs3(driver).sendKeys(adrs3);
		new_branche.zipcode(driver).sendKeys(zipcode);
		genericpage.ComparedropDownValues(driver, getlocator("newbranch_slt_country"),(country));
		genericpage.ComparedropDownValues(driver, getlocator("newbrnch_slt_state"),(state));
		genericpage.ComparedropDownValues(driver, getlocator("newbranch_slt_city"), (city));
		
		new_branche.submit(driver).click();
		
		
	}
	public Object[][] excelcontent(String filename,String sheetname)
	{
		excel_class.excelconnection(filename, sheetname);
		int rc=excel_class.rcount();
		int cc=excel_class.ccount();
		String[][] data=new String[rc-1][cc];
		for(int r=1;r<rc;r++)
		{
			for(int c=0;c<cc;c++)
			{
				data[r-1][c]=excel_class.readdata(c, r);
			}
		}
		return data;
	}
	
	
	public void employee(){
		admin.employee(driver).click();
	}
	public void newemployee(){
		new_emploee.newemployer(driver).click();
		new_emploee.newemployer_name(driver).sendKeys("Rakesh");
		new_emploee.login_pswd(driver).sendKeys("dipun");
		genericpage.ComparedropDownValues(driver,getlocator("role_sltbtm"),"manager" );
		genericpage.ComparedropDownValues(driver, getlocator("branch_sltbtm"),"12345");
	
		
	}
}
