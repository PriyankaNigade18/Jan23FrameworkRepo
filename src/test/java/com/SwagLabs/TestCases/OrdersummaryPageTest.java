package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OrdersummaryPageTest extends Baseclass
 {
  @Test(priority=1)
  public void verifySummary()
  {
	  os.getSummary();
  }
  
  @Test(priority=2)
  public void verifyOrder()
  {
	  os.completeProcess();
  }
}
