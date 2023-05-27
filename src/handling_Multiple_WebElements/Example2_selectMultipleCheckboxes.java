package handling_Multiple_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_selectMultipleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\ankus\\OneDrive\\Desktop\\Study\\multiple checkboxes.html");
		
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allCheckboxes.size());
		
		//click on all checkboxes
		//using for each loop
	//	for(WebElement s1:allCheckboxes)
	//	{
	//		s1.click();
	//		Thread.sleep(2000);
			
	//	}
		
		//using for loop
		for(int i=0;i<=allCheckboxes.size()-1;i++)
		{
			allCheckboxes.get(i).click();
			Thread.sleep(2000);
		}
		
		
		
		driver.close();
		
		
		
		
	}
}
