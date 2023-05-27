package popup_Handling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainPageFrom_ChildWindow {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on new tab on main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window id
				Set<String> allIDs = driver.getWindowHandles();
				ArrayList<String> a1=new ArrayList<String>(allIDs);
				
				
				
				//switch to child windowID
				driver.switchTo().window(a1.get(1));
				
				
				
				//click on training tab on child page
				driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
				
			Thread.sleep(3000);	
				
				//switch to main page from child page
			driver.switchTo().window(a1.get(0));
			
			Thread.sleep(2000);
			
			//click on "NewWindow" from main page
			driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
				
				
}				
				
}
