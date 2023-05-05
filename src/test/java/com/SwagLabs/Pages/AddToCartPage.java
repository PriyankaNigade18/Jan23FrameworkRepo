package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{
	private WebDriver driver;
	
	//initialize driver
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//locator
	private By cartOption=By.xpath("//a[@class='shopping_cart_link']");
	private By removebtn=By.xpath("//button[text()='Remove']");
	private By continuebtn=By.xpath("//button[text()='Continue Shopping']");
	private By checkoutbtn=By.xpath("//button[text()='Checkout']");
	
	
	//actions
	public void openCartPage()
	{
		driver.findElement(cartOption).click();
	}
	
	public void doRemove()
	{
		driver.findElement(removebtn).click();
	}
	
	public void doContinue()
	{
		driver.findElement(continuebtn).click();
	}
	
	
	public void doCheckOut()
	{
		driver.findElement(checkoutbtn).click();
		System.out.println("Checout page will open!");
	}
	
	
	
}
