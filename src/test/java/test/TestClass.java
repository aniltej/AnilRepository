package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	@Test
	public void methodOne()
	{
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(co);
		driver.get("https://automationexercise.com/signup");
		Assert.assertTrue(true);
		driver.close();
	}

}
