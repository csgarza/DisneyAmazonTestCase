package com.selenium.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	String searchText;

	public void setSearchText(String text)
	{
		this.searchText = searchText;
	}

	public String getSearchText()
	{
		return this.searchText;
	}

	public void searchItem(WebDriver driver) {
    	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(this.searchText);
    	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    	String searchResultText = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
    	if(searchResultText.equalsIgnoreCase(this.searchText))
	}

	public void clickItem(WebDriver driver, String item) {
        driver.findElement(By.xpath('//span[normalize-space()="'+item+'"]')).click();      
	}

}