package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage
{
	private WebDriver driver;
	
	public OrderSummaryPage(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	//locator
	private By summary=By.xpath("//div[@id='checkout_summary_container']");
	private By finishbtn=By.id("finish");
	private By msg=By.xpath("//h2[contains(text(),'order')]");
	 	
	
	
	//Actions
	public void getSummary()
	{
		System.out.println("***********Product Summary********");
		System.out.println(driver.findElement(summary).getText());
	}
	
	public void completeProcess()
	{
		driver.findElement(finishbtn).click();
		String cmsg=driver.findElement(msg).getText();
		System.out.println(cmsg);
	}

}
