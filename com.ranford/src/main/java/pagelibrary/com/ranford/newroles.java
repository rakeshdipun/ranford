package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class newroles extends Base {
	public static WebElement newroles(WebDriver driver)
	{
		return driver.findElement(getlocator("rolename_box"));
	}
	public static WebElement roledesc(WebDriver driver)
			{
	return driver.findElement(getlocator("roledesc_box"));
		}
	public static WebElement rolename(WebDriver driver)
	{
		return driver.findElement(getlocator("roletype_slt_btm"));
}
	public static WebElement roletype(WebDriver driver)
	{
		return driver.findElement(getlocator("roletype_slt_btm"));
	}
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(getlocator("smbt_btm"));
	}
	public static WebElement reset(WebDriver driver)
	{
		return driver.findElement(getlocator("reset_btm"));
	}
	public static WebElement cancel(WebDriver driver)
	{
		return driver.findElement(getlocator("cancel_btm"));
	}
}