package pagelibrary.com.ranford;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class genericpage {
	
	
	public static Select dropDownSelection(WebDriver driver, By prop)
	{
		Select x = new Select(driver.findElement(prop));
		return x;	
		
	}
	
	public static Select ComparedropDownValues(WebDriver driver, By prop, String expectedVal)
	{
		Select x = new Select(driver.findElement(prop));
		
		List<WebElement> allOptions = x.getOptions();
		
		for(WebElement option:allOptions)
		{
			String actualVal = option.getText();
			
			if(actualVal.contains(expectedVal))
			{
				x.selectByVisibleText(expectedVal);
				break;
			}
		}
		return x;		
		
	}
   /* 
	public static void locate(WebDriver driver){
		 
		WebElement ele= driver.findElement(getlocator(""));
		String loc= ele.getText();
		System.out.println(loc);
		
		if (loc.contains("")){
			System.out.println("text is obtained");
			
		}else{
			
			System.out.println("text not obtained");
		}
		*/
	}

