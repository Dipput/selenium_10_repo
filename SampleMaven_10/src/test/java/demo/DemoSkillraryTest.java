package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoSkillraryTest {

	@Test
	public void launch()
	{
		String url = System.getProperty("url");  // to recieve the data from cmd prompt
		String username = System.getProperty("username");
		String password = System.getProperty("password");
//		
//		Reporter.log(url,true);   
//		String email = System.getProperty("email");
//		String password = System.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("last")).click();
		
	}

	
}
