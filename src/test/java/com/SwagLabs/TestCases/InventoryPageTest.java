package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends Baseclass
{
  @Test(priority=1)
  public void verifyProductCount()
  {
	  int count=ip.getProductCount();
	  Assert.assertEquals(count, 6);
	  System.out.println("Total Products are: "+count);
//	  if(count==6)
//	  {
//		  System.out.println("Total Products are: "+count);
//	  }
  }
  
  @Test(priority=2)
  public void verifyProductName()
  {
	  ip.getProductNames();
  }

  @Test(priority=3)
  public void verifyAddToCart()
  {
	  ip.addProductToCart("Sauce Labs Fleece Jacket");
  }
  
}
