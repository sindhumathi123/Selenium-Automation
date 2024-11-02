package TestNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobject.User_selection;

public class Selection_page_objects extends CommonFunctions {
	
	public void moveToUserPage() throws InterruptedException {
		Actions actions= new Actions(driver);
		actions.moveToElement(User_selection.Adminlink);
		actions.click().build().perform();
		Thread.sleep(2000);
		actions.moveToElement(User_selection.UserManagementlink);
		actions.click().build().perform();
		Thread.sleep(2000);
		actions.moveToElement(User_selection.Userlink);
		actions.click().build().perform();
	}
	public void selectuserRole() {
		driver.manage().timeouts().implicitlyWait(implwait, TimeUnit.SECONDS);
		Select selectRole = new Select(User_selection.UserRole);
		selectRole .selectByIndex(1);
	}
	public void selectStatus() {
		driver.manage().timeouts().implicitlyWait(implwait, TimeUnit.SECONDS);
		Select selectStatus = new Select(User_selection.UserStatus);
		selectStatus.selectByIndex(2);
	}
	@Test
	public void userRoleSelect() throws InterruptedException {
		PageFactory.initElements(driver,User_selection.class);
		Thread.sleep(2000);
		moveToUserPage();
		Thread.sleep(2000);
		selectuserRole();
		selectStatus();
		User_selection.SearchButton.click();
	}
	
}
