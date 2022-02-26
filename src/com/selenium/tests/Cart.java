package com.selenium.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	
	public void addToCart(WebDriver driver){
    	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    }

    public void validateAddedItem(WebDriver driver, String item){
    	driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));

    	/* case if user is logged in /*
    	// driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
    	// String cartItemCheck = driver.findElement(By.xpath("//span[@class='a-truncate a-size-medium']")).getText();
    	// if(cartItemCheck.equalsIgnoreCase(item));
    }
}