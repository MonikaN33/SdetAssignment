package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\ChromeDriver_83\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		//Launch chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		//one time declaration
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.findElementByName("userName").sendKeys("abc@we");
		driver.findElementByName("password").sendKeys("password");
		driver.findElementByName("login").click();
		
		driver.findElementByXPath("//input[@name='tripType' and @value='oneway']").click();
		
		//driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
		
		
		WebElement passenger = driver.findElementByName("passCount");
		Select count = new Select(passenger);
		count.selectByIndex(2);
		
		WebElement depart = driver.findElementByName("fromPort");
		Select port = new Select(depart);
		port.selectByValue("London");
		
		WebElement on = driver.findElementByName("fromMonth");
		Select month = new Select(on);
		month.selectByIndex(4);
		
		WebElement on1 = driver.findElementByName("fromDay");
		Select day = new Select(on1);
		day.selectByValue("30");
		
		WebElement arrive = driver.findElementByName("toPort");
		Select toport = new Select(arrive);
		toport.selectByValue("Acapulco");
		
		WebElement dept = driver.findElementByName("toMonth");
		Select tomonth = new Select(dept);
		tomonth.selectByIndex(5);
		
		WebElement on2 = driver.findElementByName("toDay");
		Select day2 = new Select(on2);
		day2.selectByValue("5");
		
		driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']")).click();
		
		WebElement airline = driver.findElementByName("airline");
		Select line = new Select(airline);
		line.selectByVisibleText("Unified Airlines");
		
		driver.findElementByName("findFlights").click();
		
		driver.findElementByName("reserveFlights").click();
		
		driver.findElementByName("passFirst0").sendKeys("Monika");
		driver.findElementByName("passLast0").sendKeys("Gupta");
		driver.findElementByName("creditnumber").sendKeys("123567890");
		driver.findElementByName("buyFlights").click();
				
		driver.findElement(By.xpath("//img[contains(@src,'/images/forms/Logout.gif')]")).click();
		//close browser
		driver.quit();
		


	
	}

	

}
