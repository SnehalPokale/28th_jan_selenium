package customized_Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Step 1:
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2:
		Actions act=new Actions(driver);
		
		//Step 3:
		act.click(month).perform();
		Thread.sleep(2000);
		
		//Navigate options to top using Arrow_Up Key
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		//Navigate options to Bottom using Arrow_Down Key
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		//Select option using ENTER Key
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}
}
