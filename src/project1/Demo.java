package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	// public static void main(String[] args)
	@Test
	public void testOne(){
	    int value=0;
		System.setProperty("webdriver.chrome.driver", "src/project1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        WebElement options= driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
       Select dropdown=new Select(options);
       dropdown.selectByValue("4");
       assert value>=18:" Not valid";  
      Assert.assertEquals(true, true);
     
      
 List<WebElement> values=driver.findElements(By.xpath("//select[@id=\"ctl00_mainContent_ddl_Adult\"]/option"));
   
        for(int i=0;i<=values.size();i++)
        {  
        	if(values.get(i).getText().equalsIgnoreCase("4"))
       	{
        		values.get(i).click();
        		break;
        	}
        }
	
      }
}
