package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotstar_logo {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in/home?is_paywall_onboarding=true&ref=%2Fin");
		
		driver.findElement(By.className("hvof4qxPgmCyNR1iCvFLa")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}	

}
