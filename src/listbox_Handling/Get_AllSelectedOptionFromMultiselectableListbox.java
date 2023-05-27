package listbox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_AllSelectedOptionFromMultiselectableListbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/Study/MultiSelectableListbox.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(selectcountry);
		
		s.selectByIndex(1);
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		List<WebElement> allselectedoptions = s.getAllSelectedOptions();
		System.out.println(allselectedoptions.size());
		
		for(WebElement s1:allselectedoptions)
		{
			System.out.println(s1.getText());
		}
		
		
	}
}
