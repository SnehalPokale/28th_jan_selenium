package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_logo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in");
		
		driver.findElement(By.className("default-ltr-cache-1qwdmuy")).click();
		
		driver.close();
		
		
		
		
	}

}
