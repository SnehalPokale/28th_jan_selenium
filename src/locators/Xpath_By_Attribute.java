package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Xpath by Attribute Name='Attribute value'
		//enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sonududhe7@gmail.com");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
		
		//click on login button
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		
		
		
		driver.quit();
		
}
}
