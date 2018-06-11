package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class logout extends Base {
	public static WebElement logout(WebDriver driver)
	{
		return driver.findElement(getlocator("logout_btm"));
	}
}
