package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
	
	private Driver() {}
	private static WebDriver driver;
	

	
	public static WebDriver getDriver() {

		if (driver == null) {

			String browser = ConfigReader.getPropertyValue("browser");
			System.out.println("Browser = " + browser);

			switch (browser) {

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "chromeHeadless":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
				driver.manage().window().maximize();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case "firefoxHeadless":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
				driver.manage().window().maximize();
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				break;

			case "safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				driver.manage().window().maximize();
				break;
			}

		}

		return driver;

	}

	public static void closeDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}

}