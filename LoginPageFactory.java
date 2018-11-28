package pomexamples.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	WebDriver driver;
	@FindBy(id="txtUserName")
	@CacheLookup
	WebElement uname;
	
	@FindBy(how=How.NAME, using="txtFN")
	@CacheLookup
	WebElement fname;
	
	@FindBy(how=How.NAME, using="txtLN")
	@CacheLookup
	WebElement lname;
	
	@FindBy(how=How.ID, using="txtPassword")
	@CacheLookup
	WebElement pwd;

	@FindBy(how=How.ID, using="txtConfPassword")
	@CacheLookup
	WebElement cpwd;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typetext(String suname, String sfname, String slname, String spwd, String scpwd){
		
		uname.sendKeys(suname);
		fname.sendKeys(sfname);
		lname.sendKeys(slname);
		pwd.sendKeys(spwd);
		cpwd.sendKeys(scpwd);
		fname.click();
		driver.switchTo().alert().accept();
		
	}
	
	public void clear1(String spwd,String scpwd)
	{
		pwd.clear();
		cpwd.clear();
		pwd.sendKeys(spwd);
		cpwd.sendKeys(scpwd);
	}
	
	

}
