package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestBase.Base;

/**
 * Hello world!
 *
 */
public class App extends Base
{
    public static void main(WebDriver driver)
    {
       HomePage.UserName_editbox(driver).sendKeys(config(""));
    }
}
