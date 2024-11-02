package screenshot;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshotproject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\banue\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Robot robot = new Robot();
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(screenSize);
		BufferedImage Source = robot.createScreenCapture(rectangle);
		File destinationfile= new File("C:\\Users\\banue\\OneDrive\\Pictures\\Screenshots\\sindhu.png");
		ImageIO.write(Source, "png", destinationfile);
		
	}
	

}
