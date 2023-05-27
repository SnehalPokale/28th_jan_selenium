package Handling_Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String ExpText="redmi 10";
		
		for(WebElement s1:allOptions)
		{
			String ActText = s1.getText();
			if(ActText.equals(ExpText))
			{
				s1.click();
				break;
			}
		}
		
		
	}
}
