package customized_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_select_Oct_OptionUsing_EndKey {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//step1: 
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));

		//step2:
		Actions act=new Actions(driver);
		
		//step3:
		act.click(month).perform();
		Thread.sleep(2000);
		
		//navigate to last option using END Key
		act.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		//step to navigate oct using ARROWUp key
		for(int i=1;i<=2;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(2000);
		}
		
		//Click on Oct Option using ENTER key
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
