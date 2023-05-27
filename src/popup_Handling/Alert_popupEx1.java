package popup_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popupEx1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch focus on alert popup page   driver.switchto().alert()
		//1. Get Text from popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		//2.click on cancle button from alert popup
		//driver.switchTo().alert().dismiss();
		
		//3.click on OK button on 1st alert popup
		driver.switchTo().alert().accept();
		
		//4. click on OK button on 2nd alert popup
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
