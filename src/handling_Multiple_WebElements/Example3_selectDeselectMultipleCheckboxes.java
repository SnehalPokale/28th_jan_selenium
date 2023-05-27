package handling_Multiple_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example3_selectDeselectMultipleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\multiple checkboxes.html");
		
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allCheckboxes.size());
		
		//select checkboxes
		for(WebElement s1:allCheckboxes)
		{
			s1.click();
			Thread.sleep(2000);
			
		}
		
		//Deselect checkboxes
		for(int i=allCheckboxes.size()-1;i>=0;i--)
		{
			allCheckboxes.get(i).click();
			Thread.sleep(2000);
		}
		
	}

}
