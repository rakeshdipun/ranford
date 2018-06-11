package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class employees extends Base {
	public static WebElement employee(WebDriver driver)
	{
		return driver.findElement(getlocator("employee_btm_xpath")); 
}
	
	public static WebElement newemployee(WebDriver driver)
	{
		return driver.findElement(getlocator("")); 
}
}