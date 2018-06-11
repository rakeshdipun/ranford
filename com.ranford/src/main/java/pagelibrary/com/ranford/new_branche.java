package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class new_branche extends Base 
{
	public static WebElement newbranche(WebDriver driver)
	{
return driver.findElement(getlocator("newbranches_btm"));
}
	public static WebElement brnchnme(WebDriver driver)
	{
return driver.findElement(getlocator( "newbrnch_textbox"));
}
	public static WebElement adrs1(WebDriver driver)
	{
return driver.findElement(getlocator( "newbrnch_adrs1"));
}
	public static WebElement adrs2(WebDriver driver)
	{
return driver.findElement(getlocator( "newbrnch_adrs2"));
}
	public static WebElement adrs3(WebDriver driver)
	{
return driver.findElement(getlocator( "newbrnch_adrs3"));
}
	public static WebElement country(WebDriver driver)
	{
return driver.findElement(getlocator( "newbranch_slt_country	"));
}
	public static WebElement state(WebDriver driver)
	{
return driver.findElement(getlocator( "newbrnch_slt_state"));
}
	public static WebElement city(WebDriver driver)
	{
return driver.findElement(getlocator( "newbranch_slt_city"));
}
	public static WebElement zipcode(WebDriver driver)
	{
return driver.findElement(getlocator( "newbrnch_zipcode"));
}
	public static WebElement submit(WebDriver driver)
	{
return driver.findElement(getlocator( "newbranch_smt_btm"));
}
	public static WebElement reset(WebDriver driver)
	{
return driver.findElement(getlocator( "newbranch_reset_btm"));
}
	public static WebElement cancel(WebDriver driver)
	{
return driver.findElement(getlocator( "newbranch_cncl_btm"));
}
}