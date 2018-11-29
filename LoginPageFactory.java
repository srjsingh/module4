package application.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPageFactory {
 WebDriver driver;
 @FindBy(xpath="html/body/div[2]/table/tbody/tr/th/a")
 @CacheLookup
	WebElement admin_login;
 
 @FindBy(how=How.NAME, using="uname")
 @CacheLookup
	WebElement uname;
 
 @FindBy(how=How.NAME, using="pass")
 @CacheLookup
	WebElement pwd;
 
 @FindBy(xpath="html/body/div/div[2]/form/table/tbody/tr[3]/td[2]/input")
 @CacheLookup
	WebElement login;
 
 @FindBy(xpath="//*[@id='header']/h3[2]/a[1]")
 @CacheLookup
	WebElement add_new;
 
 @FindBy(xpath="//*[@id='customer.customerName']")
 @CacheLookup
	WebElement cname;
 
 
 @FindBy(xpath="//*[@id='customer.customerAddress']")
 @CacheLookup
	WebElement caddress;
 
 @FindBy(xpath="//*[@id='customer.customerPancard']")
 @CacheLookup
	WebElement cpan;
 
 @FindBy(xpath="//*[@id='customer.customerEmail']")
 @CacheLookup
	WebElement cemail;
 
/* @FindBy(xpath="//*[@id='account.accountType']")
 @CacheLookup
	WebElement ctype;
 public void setCtype() {
		Select drptype=new Select(ctype);
		drptype.selectByIndex(1);
	}*/

 
 
 
 @FindBy(xpath="//*[@id='account.accountBalance']")
 @CacheLookup
	WebElement cobal;
 
 /*@FindBy(xpath="//*[@id='account.accountOpenDate']")
 @CacheLookup
	WebElement cdate;*/
 
 @FindBy(xpath="//*[@id='user.userSecretQuestion']")
 @CacheLookup
	WebElement cqstn;
 
 @FindBy(xpath="//*[@id='user.userTransPassword']")
 @CacheLookup
	WebElement cans;
 
 @FindBy(xpath="//*[@id='admin']/table/tbody/tr[10]/td/input[1]")
 @CacheLookup
	WebElement cregister;
 
 
    public LoginPageFactory(WebDriver driver) 
    {
	this.driver = driver;
    }


	

	public void typetext(String suname, String spwd, String scname, String scaddress, String scpan, String scemail, String scobal, String scans )
    {
    	admin_login.click();
    	uname.sendKeys(suname);
    	pwd.sendKeys(spwd);
    	login.click();
    	add_new.click();
    	cname.sendKeys(scname);
    	caddress.sendKeys(scaddress);
    	cpan.sendKeys(scpan);
    	cemail.sendKeys(scemail);
    	Select drptype=new Select(driver.findElement(By.xpath("//*[@id='account.accountType']")));
    	drptype.selectByVisibleText("Savings");
    	cobal.sendKeys(scobal);
    	//driver.findElements(By.xpath("//*[@id='user.userSecretQuestion']")).get(2).click();
    	Select drptype2=new Select(driver.findElement(By.xpath("//*[@id='user.userSecretQuestion']")));
    	drptype2.selectByVisibleText("What is your birth place?");
    	cans.sendKeys(scans);
    	cregister.click();
    }
	
 
}
