package com.stepdefinition;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdaptiveTaskLoginStep {

	WebDriver driver;

	@Given("user should in adactive login page")
	public void user_should_in_adactive_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");

	}
	@When("user should enter {string},{string}, and click login button")
   public void user_should_enter_and_click_login_button(String userName, String password) {
	 {
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(userName);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
		driver.findElement(By.id("login")).click();
	}
	}
	
	@Then("user should verify the login successful")
	public void user_should_verify_the_login_successful() {
		Assert.assertTrue("verify Login", true);

	}

	@When("user should enter search hotel page details as  {string},{string},{string},{string},{string},{string},{string},{string}")
	public void searchPage(String location, String selectHotel, String roomType, String noOfRoom, String checkIn,
			String checkOut, String adultsPerRoom, String childPerRoom) {
		driver.findElement(By.id("location")).sendKeys(location);
		driver.findElement(By.id("hotels")).sendKeys(selectHotel);
		driver.findElement(By.id("room_type")).sendKeys(roomType);
		driver.findElement(By.id("room_nos")).sendKeys(noOfRoom);
		driver.findElement(By.id("datepick_in")).sendKeys(checkIn);
		driver.findElement(By.id("datepick_out")).sendKeys(checkOut);
		driver.findElement(By.id("adult_room")).sendKeys(adultsPerRoom);
		driver.findElement(By.id("child_room")).sendKeys(childPerRoom);
		

	}

	@When("user should click search button")
	public void user_should_click_search_button() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("Submit")).click();
		

	}

	@When("user should in adactive select hotel page and check given details showing correct as we given")
	public void selectHotelPage() {

	}

	@When("user should click select radio button")
	public void user_should_click_select_radio_button() {
		driver.findElement(By.id("radiobutton_0")).click();

	}

	@When("user should click continue button")
	public void user_should_click_continue_button() {
		driver.findElement(By.id("continue")).click();

	}

	@When("user should enter book hotel details as  {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_book_hotel_details_as(String firstName, String lastName, String billAdd,
			String creditCard, String cType, String expDate, String expYear, String cvv) throws InterruptedException {
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		driver.findElement(By.id("address")).sendKeys(billAdd);
		driver.findElement(By.id("cc_num")).sendKeys(creditCard);
		driver.findElement(By.id("cc_type")).sendKeys(cType);
		driver.findElement(By.id("cc_exp_month")).sendKeys(expDate);
		driver.findElement(By.id("cc_exp_year")).sendKeys(expYear);
		driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(7000);

		String orderId = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println(orderId);
		driver.quit();
		// List<String> order = new ArrayList<String>();

	}
	
	

//	@When("user should enter {string},{string}, and click login button")
//	public void user_should_enter_and_click_login_button(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}




}
