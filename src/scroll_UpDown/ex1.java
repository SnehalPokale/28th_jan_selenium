package scroll_UpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//scroll down :->  1st parameter: 0,  2nd parameter: +ve
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		
		//Scroll Up:> 1st parameter: 0, 2nd parameter :-ve 
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
		
	}

}
