package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep {
	WebDriver driver;
	
	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NEW\\eclipse-workspace\\cucumber1project\\driver\\chromedriver.exe" );
	 driver = new ChromeDriver();
	 driver.get("http://adactinhotelapp.com/");
	 driver.manage().window().maximize();
	   
	}

	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("GV");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("smile");
		
	    	}

	@Then("User Should Click the login button")
	public void user_Should_Click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	   
	}

}
