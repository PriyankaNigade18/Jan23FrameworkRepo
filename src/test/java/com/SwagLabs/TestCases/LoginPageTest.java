package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends Baseclass
{
  @Test(priority=1)
  public void verifyTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.equals("Swag Labs"),"Title is not matched!...Test Fail");
	  System.out.println("Title is matched!...Test Pass!");
//	  if(actTitle.equals("Swag Labs"))
//	  {
//		  System.out.println("Title is matched!...Test Pass!");
//	  }else
//	  {
//		  System.out.println("Title is not matched!...Test Fail");
//	  }
  }
  
  @Test(priority=2)
  public void verifyCurrentUrl() 
  {
	  System.out.println(lp.getAppUrl());
  }
  
  @Test(priority=3)
  public void verifyLogin() 
  {
	  lp.doLogin("standard_user", "secret_sauce");
  }
}
