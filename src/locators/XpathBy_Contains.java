package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBy_Contains {

//Using Attribute
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.manage().window().maximize();
	
	////xpath by contains= //tagname[contains(@attribute name,'attribute value')]
	//enter username
	driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("abc");
	
	//enter pwd
	driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("xyz");

	
	//click on login button
	//xpath by contains= //tagname[contains(@attribute name,'attribute value')]
	driver.findElement(By.xpath("//button[contains(@id,'loginbutton')]")).click();
	
	
	
}
}
