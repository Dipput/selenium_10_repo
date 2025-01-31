package company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WiproTest {

	@Test
	public void launch()
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.wipro.com/en-IN/");
		Reporter.log("Wipro class executed",true);
	}
}
