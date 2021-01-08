package loginAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCartWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driverobject=new ChromeDriver();
		driverobject.get("http://automationpractice.com/index.php");
		driverobject.manage().window().maximize();
		
		driverobject.findElement(By.id("search_query_top")).sendKeys("Dress");
		
		driverobject.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driverobject.findElement(By.name("submit_search")).click();
		
		WebDriverWait waitobject=new WebDriverWait(driverobject,3);
		waitobject.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Printed Summer Dress"))).click();
		
		waitobject.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@name, 'Submit')]"))).click();
		
		waitobject.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Proceed to checkout']"))).click();
		
		
		
		waitobject.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Delete']"))).click();
		
String TitleResult=driverobject.getTitle();
		
		System.out.println(TitleResult);
		
		if(TitleResult.equals("Order - My Store"))
		{
			System.out.println("Product is added & removed from cart");
		}
		else {
			System.out.println("Test failed");
		}
		
	}

}
