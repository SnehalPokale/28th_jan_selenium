package listbox_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSizeOfAlltSelectedOptionFrom_MultiSelectableListbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/Study/MultiSelectableListbox.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(selectcountry);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		
		List<WebElement> allselectedoptions = s.getAllSelectedOptions();
         int size = allselectedoptions.size();
         System.out.println(size);
         
	}       
}
