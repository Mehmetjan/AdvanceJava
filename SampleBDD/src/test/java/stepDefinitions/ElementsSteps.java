package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ElementsPage;

public class ElementsSteps {
	WebDriver driver;
	ElementsPage lp;
	
	

	@Given("user on main page")
	public void user_on_main_page() throws Exception {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);


	}

	@When("user click on Elements menu")
	public void user_click_on_elements_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user click on text box menu")
	public void user_click_on_text_box_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter {string}")
	public void user_enter(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter permanent {string}")
	public void user_enter_permanent(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
