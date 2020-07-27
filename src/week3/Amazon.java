package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon
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
		driver.get("https://www.amazon.com/");
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus");
		
		//To hit enter
		WebElement enter = driver.findElementById("twotabsearchtextbox");
		enter.sendKeys(Keys.ENTER);
		
		//Verify page title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com : oneplus";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title Verified");
		}
		else
		{
			System.out.println("Incorrect title...");
		}
		
		//driver.findElementByXPath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]").click();
		
		driver.findElement(By.xpath("//img[contains(@src,'https://m.media-amazon.com/images/I/61TKhxwPTWL._AC_UY218_.jpg')]")).click();
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : " + pageTitle);
		
		//navigate to back page
		driver.navigate().back();
		
		//verify that in search box oneplus is present
		WebElement textBox = driver.findElementById("twotabsearchtextbox");
		String textValue = textBox.getText();
		System.out.println("Text present in search box : " + textValue);
		
		//Clear the text in searchbox
		driver.findElementById("twotabsearchtextbox").clear();
		
		//Enter new value in search box
		driver.findElementById("twotabsearchtextbox").sendKeys("samsung");
		
		//To hit enter
		WebElement enter1 = driver.findElementById("twotabsearchtextbox");
		enter1.sendKeys(Keys.ENTER);
		
		//Sorting by price(button drop down) - frame concept
		driver.findElementById("a-autoid-0-announce").click();
		WebElement sort = driver.findElementById("s-result-sort-select_2");
		sort.click();
		
		System.out.println("Validation completed");
		
		driver.quit();
		
		
	}

}
