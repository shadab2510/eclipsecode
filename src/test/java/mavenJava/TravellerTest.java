package mavenJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TravellerTest {
	
	@Test public void TravellerTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://traveltriangle.com");
		driver.manage().window().maximize();
		

		
		driver.findElement(By.xpath("//input[@placeholder='Type a Destination']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type a Destination']")).sendKeys("Himachal");
		//String keys=Keys.chord(Keys.DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Type a Destination']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Type a Destination']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Select duration']")).click();
		
		driver.findElement(By.xpath("//ul[@class='css-15fg7w5']/li[3]")).click();
	driver.findElement(By.xpath("//input[@value='Select month']")).click();
	driver.findElement(By.xpath("//div[@class='css-lhutij months-list']/ul/li[2]")).click();
	driver.findElement(By.xpath("//div[@class='flex-form flexFull']")).click();
	
	System.out.println(driver.getCurrentUrl());
	

		
		
		
		//driver.quit();
		
		
		
		
	}

}
