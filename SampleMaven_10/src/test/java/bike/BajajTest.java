package bike;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BajajTest {

	@Test
	public void BajajLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.bajajauto.com/bikes");
		Reporter.log("Bajaj class executed", true);
		Reporter.log("Bajaj class not executed", true);
	}
}
