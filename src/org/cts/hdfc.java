package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class hdfc {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        Thread.sleep(3000);
        
        List<WebElement> frames= driver.findElements(By.tagName("iframe"));
        int siz=frames.size();
        
        System.out.println(siz);
        driver.switchTo().frame(0);
        
        WebElement user_ID= driver.findElement(By.name("fldLoginUserId"));
        user_ID.sendKeys("123456");
        
                
        WebElement cont= driver.findElement(By.xpath("//img[@alt='continue']"));
        cont.click();

}
}

