package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class users extends Base{
	public static WebElement users(WebDriver driver)
	{
		return driver.findElement(getlocator("users_btm"));
}
	public static WebElement branchslt(WebDriver driver)
	{
		return driver.findElement(getlocator("branch_sltbtm"));
	}
	public static WebElement userroles(WebDriver driver)
	{
		return driver.findElement(getlocator("roles_sltbtm"));
	}
	public static WebElement search(WebDriver driver)
	{
		return driver.findElement(getlocator("search_btm"));
	}
	public static WebElement clear(WebDriver driver)
	{
		return driver.findElement(getlocator("clear_btm"));
	}
}
