package com.selenium.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public void clickLogin(WebDriver driver) {
    	driver.findElement(By.xpath("//a[@id='a-autoid-0-announce']")).click();
	}

	public void userAttemptLogin(WebDriver driver) {
		String email = "email@email.com";
		String pw = "pwd";
    	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(email);
    	driver.findElement(By.xpath("//input[@id='continue']")).click(); 
    	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(pw);
    	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }

    public void loginStatus(WebDriver driver){
    	driver.findElement(By.xpath("//div[@id='auth-error-message-box']//div[@class='a-box-inner a-alert-container']"));
    	String loginMessage = driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();
    	if(loginMessage.equalsIgnoreCase("Your password is incorrect"));
	}
}