package Handling_Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("room");

		Thread.sleep(2000);
		List<WebElement> AllOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e']/li"));

		String ExpText="room temperature";

		for(WebElement s1:AllOptions)
		{
			String ActText =s1.getText();

			if(ActText.equals(ExpText))
			{
				s1.click();
				break;
			}

		}

	}
}
