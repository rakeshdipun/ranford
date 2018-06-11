package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation {
	
	public static  boolean   IsTextPresent(WebDriver driver,String exp)
	{
	boolean b=driver.findElement(By.tagName("tbody")).getText().contains(exp);
	return b;
		
	}
	public static boolean Isalertpresent(WebDriver driver,String exp)
	{
		boolean alrt=driver.switchTo().alert().getText().contains(exp);
				return alrt;
	}
	public static boolean Istitlepresnt(WebDriver driver,String exp)
	{
		boolean titl=driver.getTitle().contains(exp);
				return titl;
	}

}
