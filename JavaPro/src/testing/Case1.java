package testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Case1 {
	
	@Test
	public void case1() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("internet explorer");
		cap.setVersion("8.x");
	    RemoteWebDriver d=  new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
	    System.out.println("CASE1"); 
	    d.get("https://www.naukri.com");
	    Thread.sleep(30000);
	    d.findElementByLinkText("Login").click();
	    
	    d.switchTo().defaultContent();
	    d.findElementById("emailTxt").sendKeys("localhosssst");
	    d.findElementById("pwd1").sendKeys("localhost");
	    d.quit();
	    }

}
