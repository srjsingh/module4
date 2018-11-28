package pomexamples.test;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pomexamples.pages.LoginPageFactory;

public class TestLoginPageFactory {
	
	@Test
	public void function(){
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/selenium/WorkingWithForms.html");
		LoginPageFactory lp=PageFactory.initElements(driver, LoginPageFactory.class);
		lp.typetext("srj_singh", "Suraj", "Singh", "s123", "s1234");
		lp.clear1("s123", "s123");
		driver.close();
	}

}
