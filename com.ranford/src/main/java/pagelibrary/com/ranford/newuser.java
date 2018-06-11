package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class newuser extends Base 
{
public static WebElement newusers(WebDriver driver)
{
	return driver.findElement(getlocator(""));
}
public static WebElement role(WebDriver driver)
{
	return driver.findElement(getlocator("role_slt"));
}
public static WebElement branch(WebDriver driver)
{
	return driver.findElement(getlocator("branch_slt"));
}
	public static WebElement customerid(WebDriver driver)
	{
		return driver.findElement(getlocator("cstmr_id_slt"));
	}
	public static WebElement customername(WebDriver driver)
	{
		return driver.findElement(getlocator("cstmr_name_box"));
	}
	public static WebElement userename(WebDriver driver)
	{
		return driver.findElement(getlocator("user_name_box"));
	}
	public static WebElement loginpswd(WebDriver driver)
	{
		return driver.findElement(getlocator("login_pswd"));
	}
	public static WebElement transationpswd(WebDriver driver)
	{
		return driver.findElement(getlocator("transtion_id"));
	}
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(getlocator("sumbit_btm"));
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
		