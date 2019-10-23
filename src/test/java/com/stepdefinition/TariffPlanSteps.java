package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TariffPlanSteps {
	static WebDriver driver;
	@Given("user should be in telecom home page")
	public void user_should_be_in_telecom_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh Kumar\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@Given("user need to click on add tariff plan button")
	public void user_need_to_click_on_add_tariff_plan_button() {
	    driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])")).click();
	}

	@When("user need to fill all the fields")
	public void user_need_to_fill_all_the_fields() {
		driver.manage().window().maximize();
		driver.findElement(By.name("rental")).sendKeys("9000");
		driver.findElement(By.name("local_minutes")).sendKeys("300");
		driver.findElement(By.name("sms_pack")).sendKeys("87");
		driver.findElement(By.name("inter_minutes")).sendKeys("2000");
		driver.findElement(By.name("minutes_charges")).sendKeys("20");
		driver.findElement(By.name("inter_charges")).sendKeys("560");
		driver.findElement(By.name("sms_charges")).sendKeys("20");

	}

	@When("user should click on submit button")
	public void user_should_click_on_submit_button() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should be displayed tariff plan")
	public void user_should_be_displayed_tariff_plan() {
	    Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='Home'])[1]")).isDisplayed());
	    		
	}
	@When("user need to fill all the fields by oneDim list")
	public void user_need_to_fill_all_the_fields_by_oneDim_list(DataTable datas) {
List<String> data = datas.asList(String.class);
driver.manage().window().maximize();
driver.findElement(By.name("rental")).sendKeys(data.get(0));
driver.findElement(By.name("local_minutes")).sendKeys(data.get(1));
driver.findElement(By.name("sms_pack")).sendKeys(data.get(2));
driver.findElement(By.name("inter_minutes")).sendKeys(data.get(3));
driver.findElement(By.name("minutes_charges")).sendKeys(data.get(4));
driver.findElement(By.name("inter_charges")).sendKeys(data.get(5));
driver.findElement(By.name("sms_charges")).sendKeys(data.get(6));
	

	}
	@When("user need to fill all the fields by oneDim map")
	public void user_need_to_fill_all_the_fields_by_oneDim_map(DataTable datas) {
		Map<String, String> data = datas.asMap(String.class, String.class);
		driver.manage().window().maximize();
		driver.findElement(By.name("rental")).sendKeys(data.get("mr"));
		driver.findElement(By.name("local_minutes")).sendKeys(data.get("flc"));
		driver.findElement(By.name("sms_pack")).sendKeys(data.get("fim"));
		driver.findElement(By.name("inter_minutes")).sendKeys(data.get("fsp"));
		driver.findElement(By.name("minutes_charges")).sendKeys(data.get("lpmc"));
		driver.findElement(By.name("inter_charges")).sendKeys(data.get("ipmc"));
		driver.findElement(By.name("sms_charges")).sendKeys(data.get("spc"));
			
		
	}
	}
