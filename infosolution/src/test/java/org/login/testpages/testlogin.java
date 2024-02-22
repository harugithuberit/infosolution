package org.login.testpages;

import org.selenium.base.baseurl;
import org.shivaminfo.pages.loginpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testlogin  extends baseurl
{
	@Test
	public void logintest()
	{
		
		 
		 loginpage  logintests = new  loginpage();
		 boolean getemail = logintests.getemail();
		 Assert.assertEquals(getemail, true);
		 boolean getpassword = logintests.getpassword();
		 Assert.assertEquals(getpassword, true);
		 
		
		
		
		
		
		new loginpage()
		.enteremailid("nivethasekar1994@gmail.com")
		.enterpassword("nivetha1994")
		.Clicklogin();
		
		
	}
	
	


}
