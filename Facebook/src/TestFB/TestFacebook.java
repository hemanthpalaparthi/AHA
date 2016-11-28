package TestFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebook {

	public static void main(String[] args) {
				
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Test Selenium");	

	}

}
