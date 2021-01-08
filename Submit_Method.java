package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driverobject=new ChromeDriver();

		driverobject.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement	usernamevariable = driverobject.findElement(By.name("username"));
		usernamevariable.clear();
		
		
		WebElement passwordvariable=driverobject.findElement(By.id("password"));
		passwordvariable.clear();
		
		usernamevariable.sendKeys("admin");
		passwordvariable.sendKeys("admin");
		
		driverobject.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
		
	}

}
