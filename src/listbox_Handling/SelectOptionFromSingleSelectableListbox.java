package listbox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionFromSingleSelectableListbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		
		//---step1: find element for list box
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		//---step2: object of select class
		Select s=new Select(month);
		
		//---step3: 
		//s.selectByVisibleText("Aug");
		s.selectByValue("8");
		//s.selectByIndex(7);
		
		
		driver.quit();
		
		
		
	}
}
