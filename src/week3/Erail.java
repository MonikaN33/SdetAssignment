package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Erail 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		//Launch chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		//one time declaration
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		//select DLI as starting point
		driver.findElementById("txtStationFrom").sendKeys("DLI");
		WebElement from = driver.findElementById("txtStationFrom");
		from.sendKeys(Keys.TAB);
		
		//select BLR for destination
		driver.findElementById("txtStationTo").sendKeys("BLR");
		WebElement to = driver.findElementById("txtStationTo");
		to.sendKeys(Keys.TAB);

	}

}
