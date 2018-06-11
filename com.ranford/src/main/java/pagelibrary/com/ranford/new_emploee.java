package pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class new_emploee extends Base
{
public static WebElement newemployer(WebDriver driver){
	return driver.findElement(getlocator("new_employee_btm"));
}
public static WebElement newemployer_name(WebDriver driver){
	return driver.findElement(getlocator("employeenme_box"));
}
public static WebElement login_pswd(WebDriver driver){
	return driver.findElement(getlocator("loginpswd_box")); 
}
public static WebElement role(WebDriver driver){
	return driver.findElement(getlocator("role_sltbtm"));
}
public static WebElement branch(WebDriver driver){
	return driver.findElement(getlocator("branch_sltbtm"));
}
public static WebElement submit(WebDriver driver){
	return driver.findElement(getlocator("sbmt_btM"));
}
public static WebElement reset(WebDriver driver){
	return driver.findElement(getlocator("reset_btm"));
}
public static WebElement cancel(WebDriver driver){
	return driver.findElement(getlocator("cancel_btm"));
}
}

