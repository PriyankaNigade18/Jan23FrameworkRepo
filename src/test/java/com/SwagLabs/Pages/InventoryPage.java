package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage 
{

	private WebDriver driver;
	//initialize driver
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locator
	private By allProduct=By.xpath("//div[@class='inventory_list']//div//div[@class='inventory_item_name']");
	
	private By addToCart=By.xpath("//button[text()='Add to cart']");
	
	
	//Actions
	
	public int getProductCount()
	{
		System.out.println("******Product Count******");
		List<WebElement> list=driver.findElements(allProduct);
		return list.size();
	}
	
	public void getProductNames()
	{
		System.out.println("******Product Name List******");

		List<WebElement> list=driver.findElements(allProduct);
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
	}
	
	
	public void addProductToCart(String pname) 
	{
		List<WebElement> list=driver.findElements(allProduct);
		
		for(WebElement i:list)
		{
			try {
			if(i.getText().contains(pname))
			{
				i.click();
				driver.findElement(addToCart).click();
				System.out.println("Product will added to the cart!");
			}
			}catch(StaleElementReferenceException s)
			{
				List<WebElement> list1=driver.findElements(allProduct);
				
				for(WebElement i1:list1)
				{
					if(i1.getText().contains(pname))
					{
						i1.click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						driver.findElement(addToCart).click();
						System.out.println("Product will added to the cart!");
						
					}
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
