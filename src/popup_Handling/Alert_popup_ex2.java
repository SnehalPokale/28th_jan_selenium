package popup_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_ex2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch focus on alert popup page   driver.switchto().alert()
		
		Alert alt = driver.switchTo().alert();
		
		//1.get text from alert popup
		String text = alt.getText();
		System.out.println(text);
		
		//2.click on cancle btn from alert popup
		alt.dismiss();
		
		//3.click on OK button on 1st alert popup
	    alt.accept();
		
		//4. click on OK button on 2nd alert popup
		alt.accept();
		
	}
}
