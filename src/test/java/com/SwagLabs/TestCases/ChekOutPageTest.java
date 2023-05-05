package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

public class ChekOutPageTest extends Baseclass
{
  @Test
  public void verifyCheckout()
  {
	  cp.doContinue("Priyanka", "Nigade", "411014");
  }
}
