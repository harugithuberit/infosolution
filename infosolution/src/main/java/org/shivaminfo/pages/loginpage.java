package org.shivaminfo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.selenium.base.baseurl;

public class loginpage extends baseurl
{
	//RemoteWebDriver driver = null;
    //locators
	
	public boolean getemail()
	{
		driver.switchTo().frame(0);
		ChromeDriver driver = new  ChromeDriver();
		
   boolean getemail = driver.findElement(By.xpath("//div[@_ngcontent-serverapp-c55]//label[@class='label']\r\n"
    		+ "")).isDisplayed();
return getemail;	
	}
	public boolean getpassword()
	{
		boolean getpassword = driver.findElement(By.xpath("//label[@_ngcontent-serverapp-c55 and @class='label' and text()='Password']\r\n"
				+ "")).isDisplayed();
		return getpassword;
		
	}
	
	
	
	
	//actions
	public loginpage enteremailid(String emailid)
	{
	WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("nivethasekar1994@gmail.com");
	return this;
}
	
	public loginpage enterpassword(String pasword)
	{
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("nivetha1994");
		return this;
	}
	public dashboardpage Clicklogin()
	{
		WebElement login = driver.findElement(By.xpath("//button[@class='button is-primary' and text()='LOGIN']\r\n"
				+ ""));
		login.click();
		return new dashboardpage();
	}
	public forgotpasswordpage forgotpassword()
	{
		WebElement forgotpasswords = driver.findElement(By.xpath("//button[@_ngcontent-serverapp-c55 and @class='button is-link is-light' and text()='Forgotten password?']\r\n"
				+ ""));
		forgotpasswords.click();
		return new forgotpasswordpage();
	}
	public void login(String emailid ,String pasword)
	{
		enteremailid(emailid);
		enterpassword(pasword);
		Clicklogin();
		
		
	}
	
}