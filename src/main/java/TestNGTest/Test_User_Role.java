package TestNGTest;




import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject.User_Role_Page_Objects;

public  class Test_User_Role extends CommonFunctions{
	@Test
	public void userRole() {
		
		PageFactory.initElements(driver, User_Role_Page_Objects.class);
		User_Role_Page_Objects.username.sendKeys(properties.getProperty("username"));
		User_Role_Page_Objects.Password.sendKeys(properties.getProperty("password"));
		User_Role_Page_Objects.logginButton.click();
		
				
	}
}
