package Basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class OrganizationTest {

	@Test
	public void CreateOrganizationTest() throws IOException {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("http://localhost:8888/");
		    //login to application
		    driver.findElement(By.name("user_name")).sendKeys("admin");
		    driver.findElement(By.name("user_password")).sendKeys("admin");
		    driver.findElement(By.id("submitButton")).click();
		    	
	}
}

