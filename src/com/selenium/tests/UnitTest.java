package com.selenium.tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.selenium.tests*;

public class UnitTest {

	static WebDriver driver;
	static String defaultSearchText = "mickey mouse stuffed toy";
	static String itemToSelect = "Mickey Mouse Plush - Medium - 17''";
	
	public void openbrowser(String url){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");        
		driver = new ChromeDriver();

		//set some driver settings
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		driver.get(url);
 	}
 
	public static void main(String[] args){

		UnitTest test = new UnitTest();
		test.openbrowser("https://www.amazon.com/");

		Search search = new Search();  
		search.setSearchText(this.defaultSearchText);  			
		search.searchItem(driver);
		search.clickItem(driver, this.itemToSelect);
     	
		Cart cart = new Cart();	
		cart.addToCart(driver);
    	cart.validateAddedItem(driver, this.itemToSelect);

    	Login login = new Login();
    	login.clickLogin(driver);
		login.userAttemptLogin(driver);
		login.loginStatus(driver);

		UnitTest.driver.quit();
	}
}