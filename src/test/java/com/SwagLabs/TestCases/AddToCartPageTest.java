package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

public class AddToCartPageTest extends Baseclass
{
  @Test(priority=1)
  public void OpenAddToCartPage() 
  {
	  ap.openCartPage();
  }
  
  @Test(priority=2)
  public void verifyVhaeckoutPage() 
  {
	  ap.doCheckOut();
  }
  
  
}
