package pomexamples.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrWorkingwithforms {
	@Test
	public void f()throws Exception{
		File src=new File("./Config/workingwithforms.xml");
		FileInputStream fis=new FileInputStream(src);
		//Properties pro=new Properties();//.property
		SAXReader saxReader=new SAXReader();
		//pro.load(fis);//.property
		Document document=saxReader.read(fis);
		
		WebDriver driver=new FirefoxDriver();
		//driver.get(pro.getProperty("url"));//.property
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/selenium/WorkingWithForms.html");
		
		/*driver.findElement(By.id(pro.getProperty("username"))).sendKeys("srj_singh");
		driver.findElement(By.id(pro.getProperty("password"))).sendKeys("srj_singh");
		driver.findElement(By.xpath(pro.getProperty("submit"))).click();*/ //.property
		
		
		driver.findElement(By.id(document.selectSingleNode("//WorkWithForm_detail/pro_username").getText())).sendKeys("srj_singh");
		driver.findElement(By.id(document.selectSingleNode("//WorkWithForm_detail/pro_password").getText())).sendKeys("srj123");
		driver.findElement(By.name(document.selectSingleNode("//WorkWithForm_detail/pro_submit").getText())).click();
	}

}
