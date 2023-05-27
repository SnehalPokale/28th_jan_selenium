package dynamic_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getRatingsFromFlipkartApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on close btn
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//Enter Mob Name
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 12 pro");
		Thread.sleep(2000);
		
		//click on search icon
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//Get ratings
		String ratings = driver.findElement(By.xpath("(((//a[@class='_1fQZEK'])[1])//span)[6]")).getText();
		System.out.println(ratings);
		Thread.sleep(2000);
		
		driver.close();
	}
}
