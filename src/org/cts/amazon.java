package org.cts;

import org.apache.commons.net.nntp.Threader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");
        
        Thread.sleep(3000);
               
        WebElement search= driver.findElement(By.name("field-keywords"));
        search.sendKeys("iphone x");
        
        WebElement btn2= driver.findElement(By.xpath("//input[@value='Go']"));
        btn2.click();
        
        Thread.sleep(3000);
        
        String ParentID=driver.getWindowHandle();
        
        WebElement btn3= driver.findElement(By.xpath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']"));
        btn3.click();
        
        
        
        
        Thread.sleep(3000);
       // java.util.Set<String> allWindows = driver.getWindowHandles(); 
        
       /* for(String X:allWindows)
         {
        if(!ParentID.equals(X))
        {
        	driver.switchTo().window(X);
        	System.out.println(X);
        }
         }*/
        
       // Thread.sleep(3000);
        
        WebElement btn4=driver.findElement(By.name("submit.add-to-cart-ubb"));
        btn4.click();
        
        Thread.sleep(3000);
        
        
        WebElement btn5=driver.findElement(By.xpath("//a[@class='a-button-text a-text-center']"));
        btn5.click();
       
        //String pr = price.getText();
       // System.out.println(pr);
        
           
        
        }
        
		

	}



