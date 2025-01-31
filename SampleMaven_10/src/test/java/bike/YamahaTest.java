package bike;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class YamahaTest {
	@Test	
	public void Yamaha()
{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bikewale.com/yamaha-bikes/");
		Reporter.log("Yamaha class executed" ,true);
    	 
	}
}


