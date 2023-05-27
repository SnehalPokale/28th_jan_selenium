package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_ContainsUsingText {

	//Using Text()
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		//Xpath By contains Text()= //tagname[contains(text(),'textvalue')]
		//click on forgot pwd
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
		
		//Thread.sleep(2000);
		//driver.close();
		
		//click on Signup for facebook
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		

}
}