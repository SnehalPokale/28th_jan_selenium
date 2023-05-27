package listbox_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectOptionFrom_MultiSelectableListbox {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/Study/MultiSelectableListbox.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
        
		Select s=new Select(selectcountry);
		
		s.selectByVisibleText("IND");
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		s.deselectAll();
		
		
	}

}
