package mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex6_Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(2000);

		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		Actions act=new Actions(driver);

		act.dragAndDrop(src, dest).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
