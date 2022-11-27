package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
	@FindBy(xpath="(//div[@class=\"avatar mx-auto white\"])[1]")
    WebElement elementsButton;
	@FindBy(xpath="//span[text()=\"Text Box\"]")
	WebElement textBox;
	@FindBy(id="userName")
	WebElement username;
	@FindBy(id="userEmail")
	WebElement email;
	@FindBy(id="currentAddress")
	WebElement address1;
	@FindBy(id="permanentAddress")
	WebElement address2;
	@FindBy(id="submit")
	WebElement submitButton;

	WebDriver driver;

	public  ElementsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void openMainPage() throws Exception {
		
	}
	public void clickOnElements() {
		elementsButton.click();
	}
	public void clickonTextBox() {
		textBox.click();
	}
  public void enterName() {
	  username.sendKeys("mehmet");
  }
  public void enterEmail() {
	  email.sendKeys("mehmet@gmail.com");
  }
  public void enterCurrentAddress(String address1) {
	  this.address1.sendKeys("522 N Piedmons st");
  }
  public void enterPermanentAddress() {
	  address2.sendKeys("permanent address");
  }
  public void clickOnSubmit() {
	  submitButton.click();

  }

}
