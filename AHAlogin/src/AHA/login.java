package AHA;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://dev.precision.heart.org/wordpress/#");
		
		
		
		
System.out.println("Test #1");
		
				
		driver.findElement(By.xpath(".//*[@id='register_form']/div[10]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		String firstname_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[1]/div[2]/span")).getText();
		System.out.println(firstname_error);
		
		String lastname_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[2]/div[2]/span")).getText();
		System.out.println(lastname_error);

		String email_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[3]/div[2]/span")).getText();
		System.out.println(email_error);
		
		String organization_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[4]/div[2]/span")).getText();
		System.out.println(organization_error);
		
		String password_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[5]/div[2]/span")).getText();
		System.out.println(password_error);
		
		String reenter_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[6]/div[2]/span")).getText();
		System.out.println(reenter_error);
		
		String captcha_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[8]/div[2]/span")).getText();
		System.out.println(captcha_error);
	

		
System.out.println("Test #1 Complete");
System.out.println();
		
		//Thread.sleep(1000);
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
		//Thread.sleep(3000);

		

		
		
		
		
		
System.out.println("Test #2 - Verify email");
		
		
		
		driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("qwerty");
		
	
		driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("ytrewq");
		
		
		driver.findElement(By.xpath(".//*[@id='email' and @value='']")).sendKeys("qwerty.ytrewq@gmail");
		
		
		driver.findElement(By.xpath(".//*[@id='organization_name']")).sendKeys("XYZ");
		
		
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div/div[2]/form/div[5]/div[2]/input")).sendKeys("Asdfgh12"); 
		
		driver.findElement(By.xpath(".//*[@id='re_password']")).sendKeys("Asdfgh12");
		
		Select obj=new Select(driver.findElement(By.xpath(".//*[@id='user_type']")));
		obj.selectByIndex(1);
		
		//driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		
		driver.findElement(By.xpath(".//*[@id='register_form']/div[10]/div[2]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Thread.sleep(4000);
		
		
		String email1_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[3]/div[2]/span")).getText();
		System.out.println(email1_error);
		
		
System.out.println("Test #2 Complete");
System.out.println();
		
		
		
		
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		
System.out.println("Test #3 - Verify Same password");


		driver.findElement(By.xpath(".//*[@id='first_name']")).clear();
		
		driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("qwerty");
		
		 driver.findElement(By.xpath(".//*[@id='last_name']")).clear();
		
	    driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("ytrewq");
		
	    
	    driver.findElement(By.xpath(".//*[@id='email' and @value='']")).clear();
		
		driver.findElement(By.xpath(".//*[@id='email' and @value='']")).sendKeys("qwerty.ytrewq@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='organization_name']")).clear();
		driver.findElement(By.xpath(".//*[@id='organization_name']")).sendKeys("XYZ");
		
		
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div/div[2]/form/div[5]/div[2]/input")).sendKeys("Asdfgh12");
		
		driver.findElement(By.xpath(".//*[@id='re_password']")).sendKeys("Qsdfgh12");
		
		Select obj1=new Select(driver.findElement(By.xpath(".//*[@id='user_type']")));
		obj1.selectByIndex(1);
		
		//driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		
		driver.findElement(By.xpath(".//*[@id='register_form']/div[10]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Thread.sleep(4000);
		
		String reenter1_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[6]/div[2]/span")).getText();
		System.out.println(reenter1_error);
	
System.out.println("Test #3 Complete");
System.out.println();




driver.navigate().back();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//Thread.sleep(3000);

		
		
System.out.println("Test #4 - Verify password");	


		
driver.findElement(By.xpath(".//*[@id='first_name']")).clear();
driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("qwerty");

driver.findElement(By.xpath(".//*[@id='last_name']")).clear();
driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("ytrewq");


driver.findElement(By.xpath(".//*[@id='email' and @value='']")).clear();
driver.findElement(By.xpath(".//*[@id='email' and @value='']")).sendKeys("qwerty.ytrewq@gmail.com");

driver.findElement(By.xpath(".//*[@id='organization_name']")).clear();
driver.findElement(By.xpath(".//*[@id='organization_name']")).sendKeys("XYZ");


driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div/div[2]/form/div[5]/div[2]/input")).sendKeys("asdfgh12");

driver.findElement(By.xpath(".//*[@id='re_password']")).sendKeys("asdfgh12");

Select obj2=new Select(driver.findElement(By.xpath(".//*[@id='user_type']")));
obj2.selectByIndex(1);

//driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

driver.findElement(By.xpath(".//*[@id='register_form']/div[10]/div[2]/button")).click();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//Thread.sleep(4000);

String password1_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[5]/div[2]/span")).getText();
System.out.println(password1_error);


System.out.println("Test #4 Complete");
System.out.println();


driver.navigate().back();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


System.out.println("Test #5 - Verify password same as username");	



driver.findElement(By.xpath(".//*[@id='first_name']")).clear();
driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("qwerty");

driver.findElement(By.xpath(".//*[@id='last_name']")).clear();
driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("ytrewq");


driver.findElement(By.xpath(".//*[@id='email' and @value='']")).clear();
driver.findElement(By.xpath(".//*[@id='email' and @value='']")).sendKeys("qwerty.ytrewq@gmail.com");

driver.findElement(By.xpath(".//*[@id='organization_name']")).clear();
driver.findElement(By.xpath(".//*[@id='organization_name']")).sendKeys("XYZ");


driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div/div[2]/form/div[5]/div[2]/input")).sendKeys("Qwerty12");

driver.findElement(By.xpath(".//*[@id='re_password']")).sendKeys("Qwerty12");

Select obj3=new Select(driver.findElement(By.xpath(".//*[@id='user_type']")));
obj3.selectByIndex(1);

//driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

driver.findElement(By.xpath(".//*[@id='register_form']/div[10]/div[2]/button")).click();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//Thread.sleep(4000);

String password2_error= driver.findElement(By.xpath(".//*[@id='register_form']/div[5]/div[2]/span")).getText();
System.out.println(password2_error);


System.out.println("Test #5 Complete");
System.out.println();
	}

}
