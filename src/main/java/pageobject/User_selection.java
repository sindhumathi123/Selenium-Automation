package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_selection {

	@FindBy(linkText = "Admin")
	public static WebElement Adminlink;
	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")
	public static WebElement UserManagementlink;
	@FindBy(linkText = "Users")
	public static WebElement Userlink;
	@FindBy(className = "oxd-select-text oxd-select-text--active")
	public static WebElement UserRole;
	@FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
	public static WebElement UserStatus;
	@FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	public static WebElement SearchButton;
}

