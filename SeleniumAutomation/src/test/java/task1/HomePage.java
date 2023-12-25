package task1;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LogInPage;

public class HomePage  extends base {

	@Test
	
	public void basePageNavigation() throws IOException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		LogInPage l=new LogInPage(driver);
		l.username().sendKeys("student");
		l.password().sendKeys("Password123");
		
		LandingPage L=new LandingPage(driver);
		L.login().click();
	System.out.println(L.homepage().getText());    
	}
	
	
	
	
}
