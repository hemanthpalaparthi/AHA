package TestFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebook {

	public static void main(String[] args) {
				
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		
		
driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Hey, what's up?");	

	}

}
