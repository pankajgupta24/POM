package come.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testbase.Base;

public class LoginPage extends Base{
	
	@FindBy(id="user")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="login_button")
	WebElement login;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
 public  void login (String un, String pwd){
	 username.sendKeys(un);
	 password.sendKeys(pwd);
	 login.click();
	 
	
 }
	
}
