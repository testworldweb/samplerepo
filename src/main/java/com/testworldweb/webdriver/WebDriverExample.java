package com.testworldweb.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebDriverExample {
	
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver = new HtmlUnitDriver();
		//   WebDriver driver = new FirefoxDriver();

	        // And now use this to visit Google
	        driver.get("http://www.google.com");

	        // Find the text input element by its name
	        WebElement element = driver.findElement(By.name("q"));
	        

	        // Check the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        
	     // Enter something to search for
	        element.sendKeys("Cheese!");

	        // Now submit the form. WebDriver will find the form for us from the element
	        element.submit();
	        Thread.sleep(3000);
	     // Check the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	       
	        Thread.sleep(8000);
	        driver.quit();
	    }
	

}
