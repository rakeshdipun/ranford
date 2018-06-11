package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class roles extends Base {
	public static WebElement roles(WebDriver driver)
	{
		return driver.findElement(getlocator(""));
	}
	public static WebElement newroles(WebDriver driver)
	{
		return driver.findElement(getlocator(""));
	}
}
