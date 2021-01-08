package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driverobject=new ChromeDriver();
		driverobject.manage().window().maximize();
		driverobject.get("https://www.w3schools.com/html/html_quiz.asp");
		driverobject.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	WebElement	buttonvariable=driverobject.findElement(By.cssSelector("div[id='accept-choices']"));
	
	if (buttonvariable.isEnabled()) {
		
		System.out.println("Accept Choices button is enabled " + buttonvariable.getAttribute("id"));
		
		buttonvariable.click();
		
	}
		
	else 
	{
		System.out.println("Attribute ID is not enabled " );
	}
	
	WebElement HTMLbutton=driverobject.findElement(By.partialLinkText("Start the HTML Quiz"));
	
	if (HTMLbutton.isEnabled()) {
		
		System.out.println("HTMLbutton is enabled " );
		HTMLbutton.click();
	}
		
	else {
		System.out.println("HTMLbutton is not enabled " );
		
	}
	
WebElement	radiobutton=driverobject.findElement(By.xpath("(//input[@type='radio'])[3]"));

if (radiobutton.isEnabled())

{
	System.out.println("Radio button is enabled " );
	radiobutton.click();
	
}
else {
	System.out.println("Radio button is disabled" );

}
	
//driverobject.close();
	
	}
	
	
	

	}


