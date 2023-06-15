package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimePage {
	public ActitimePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(id="logoutLink")
	private WebElement logout;

}
