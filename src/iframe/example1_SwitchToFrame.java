package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_SwitchToFrame {

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

	
	
	//Switch to frame
	//driver.switchTo().frame("iframeResult");    //string frameID
	//driver.switchTo().frame("iframeResult")    //String frame name
	driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@id='iframeResult'])")));
	
	
	//click on click me button
	driver.findElement(By.xpath("//button[contains(text(), 'Click me to display Date and Time.')]")).click();
	
	
	
	
}
}
