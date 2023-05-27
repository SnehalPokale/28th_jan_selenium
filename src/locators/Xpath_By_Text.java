package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php/");
		
		//Xpath by Text
		//click on forgot pwd
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		Thread.sleep(2000);
		
		
	}
}
