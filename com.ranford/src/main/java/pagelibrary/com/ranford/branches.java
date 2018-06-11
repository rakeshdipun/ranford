package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class branches extends Base {
	
	public static WebElement country(WebDriver driver)
	{
		return driver.findElement(getlocator("branches_cntry_slt_xpath"));
}
	public static WebElement state(WebDriver driver)
	{
		return driver.findElement(getlocator("branches_state_slt_xpath"));
	}
	public static WebElement city(WebDriver driver)
	{
		return driver.findElement(getlocator("branches_city_slt_xpath"));
	}
	public static WebElement search(WebDriver driver)
	{
		return driver.findElement(getlocator("branches_search_btm"));
	}
	public static WebElement clear(WebDriver driver)
	{
		return driver.findElement(getlocator("brnch_clrbtm"));
	}
}