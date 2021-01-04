package chrome_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_automate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driverobject=new ChromeDriver();
		driverobject.get("https://www.facebook.com/");
		driverobject.findElement(By.name("email")).sendKeys("abcusername");
		driverobject.findElement(By.id("pass")).sendKeys("abcpassword");;
		driverobject.findElement(By.id("u_0_h")).click();
		driverobject.findElement(By.name("login")).click();
		System.out.println("Current URL is " + driverobject.getCurrentUrl());
		System.out.println("Page Title is " + driverobject.getTitle());
		
		try {
			Thread.sleep(3000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println("User Interuppted");
		}
		
		driverobject.close();
		
		
	}

}
