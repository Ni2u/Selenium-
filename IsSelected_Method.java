package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driverobject=new ChromeDriver();
		driverobject.manage().window().maximize();
		
		driverobject.get("https://demo.actitime.com/login.do");
		
		WebElement checkboxvar=driverobject.findElement(By.id("keepLoggedInCheckBox"));
		
		if(checkboxvar.isSelected()) {
			System.out.println("Checkbox is selected");
			
		}
		else {
			checkboxvar.click();
		}
	}

}
