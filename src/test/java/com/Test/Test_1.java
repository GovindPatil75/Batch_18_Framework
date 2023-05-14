package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_1 extends BaseClass{
	
	@Test
	public void verifyTest_tc001() {
		System.out.println("Test 001");
		
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		
		Library.custom_SendKeys(login.getTxt_Email(), excel.getStrinData("Sheet1", 0, 0),"Email");
		Library.custom_SendKeys(login.getTxt_password(), excel.getStrinData("Sheet1", 0, 1),"Password");
		Library.custom_click(login.getBtn_login(),"Login Button");
		
	}

}
