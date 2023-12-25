package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	
	public WebDriver driver;
		
		By submit= By.id("submit");
		By home= By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong");
		


public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
	
	this.driver=driver;
		}



public WebElement login() {
	
	return  driver.findElement(submit);
	
	
	
}
public WebElement homepage() {
	
	return  driver.findElement(home);
	
	
	
}

}
