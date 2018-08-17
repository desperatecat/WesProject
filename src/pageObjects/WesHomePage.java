package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WesHomePage {
	
	
	@FindBy(linkText="Sign In")
		WebElement login_signinBtn;
	
	@FindBy(id="UserLoginID")
		WebElement login_username;
	
	@FindBy(id="UserPassword")
		WebElement login_pwd;
	
	@FindBy(id="btnLogin")
		WebElement login_submitBtn;



public void login(String username, String password) {
		login_signinBtn.click();
		login_username.sendKeys(username);
		login_pwd.sendKeys(password);
		login_submitBtn.click();
		
	
	}	

}