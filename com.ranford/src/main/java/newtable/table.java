package newtable ;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class table  {
	 static WebDriver driver;
	    
	    static boolean status=false;
	    public static void main1( String operation )
	    {
	        boolean flag=false;
	        WebElement table=driver.findElement(By.id("DG_bankdetails"));
	        
	        List<WebElement> rows=table.findElements(By.tagName("tr"));
	        
	        String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
	        
	        for(int l=1;l<pagelinks.length;l++)
	        {
	            
	            table=driver.findElement(By.id("DG_bankdetails"));
	             rows=table.findElements(By.tagName("tr"));
	             
	             for(WebElement r:rows)
	             {
	                 List<WebElement> columns= r.findElements(By.tagName("td"));
	                 for(WebElement c:columns)
	                 {
	                     if(c.getText().matches("167"))
	                     {
	                         if(operation.equalsIgnoreCase("edit"))
	                         {
	                             columns.get(columns.size()-2).findElement(By.tagName("a")).click();
	                         }
	                         else if(operation.equalsIgnoreCase("delete"))
	                         {
	                             columns.get(columns.size()-1).findElement(By.tagName("a")).click();
	                         }
	                         else
	                         {
	                             Reporter.log("operation is failed");
	                         }
	                         flag=true;
	                         break;
	                     }
	                 }
	                 if(flag==true)
	                 {
	                     break;
	                 }
	                
	             }
	             if(flag==true)
	             {
	                 break;
	             }
	             
	             if(pagelinks[l].contains("...") && status==true)
	                {
	                    
	                    driver.findElement(By.xpath("//a[text()='...'][2]")).click();
	                }
	                else
	                {
	                    table.findElement(By.linkText(pagelinks[l])).click();
	                    
	                }
	                if(pagelinks[l].contains("..."))
	                {
	                   status=true;
	                   
	                   main1(operation);
	                }
	             
	             
	             
	             
	             
	             
	             
	             
	             
	        }
	        
	        
	        
	    }
	    
	    
	        
}
