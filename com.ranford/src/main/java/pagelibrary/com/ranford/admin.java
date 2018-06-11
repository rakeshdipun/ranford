package pagelibrary.com.ranford;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class admin extends Base {
	public static WebElement branchenms(WebDriver driver)
	{
		return driver.findElement(getlocator("branch_btm"));
			}
	public static WebElement roles(WebDriver driver)
	{
		return driver.findElement(getlocator("roles_btm"));
	}
		public static WebElement users(WebDriver driver)
		{
			return driver.findElement(getlocator("users_btm"));
		}
		public static WebElement employee(WebDriver driver)
		{
			return driver.findElement(getlocator("employee_btm"));
		}
		
		public static WebElement logout(WebDriver driver)
		{
			return driver.findElement(getlocator("logfout_btm"));
		}
		public static WebElement home(WebDriver driver)
		{
			return driver.findElement(getlocator("home_btm"));
		}
	}





