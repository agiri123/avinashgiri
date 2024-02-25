package Basic;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cdef.Test1;

public class test {
	WebDriver driver;
	WebElement email,pass,signin,logout;
	Properties prop;
	Test1 test2 = new Test1();
	
	@BeforeSuite
	public void suit() throws IOException {
		prop = test2.readprop();
		if(prop.get("browser").equals("chrome")){
			driver =new ChromeDriver();
		}else if(prop.get("browser").equals("edge")) {
			driver=new EdgeDriver();
		}else {
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("siturl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterSuite
	public void close(){
		driver.close();
		
	}
	
	

	
	

}
