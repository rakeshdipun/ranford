package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class HomePage extends Base
{
	public static WebElement   UserName_editbox(WebDriver driver)
	{
		return driver.findElement(getlocator("username"));
	}
	public static WebElement  pass_editbox(WebDriver driver)
	{
		return driver.findElement(getlocator("password"));
	}
	public static WebElement login_btn(WebDriver driver)
	{
		return driver.findElement(getlocator("loginbtm"));
	}

		}

	
	
	


