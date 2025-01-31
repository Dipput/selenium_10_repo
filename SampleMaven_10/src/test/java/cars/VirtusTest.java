package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VirtusTest {

	@Test
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.volkswagen.co.in/en/models/virtus.html");
		Reporter.log("Virtus class Executed",true);
	}
}
