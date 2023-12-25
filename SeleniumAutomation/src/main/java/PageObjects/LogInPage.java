package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	
	public WebDriver driver;
	
	
By name=	By.id("username");
By pass=By.id("password");

public LogInPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
this.driver=driver;
}

public WebElement username() {
	return driver.findElement(name);
	
	}

public WebElement password() {
	return driver.findElement(pass);

}
}

