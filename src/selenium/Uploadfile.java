package selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		WebElement fileup=driver.findElement(By.xpath("//*[@id='basicDetails']/div[1]/div[4]/div[1]/div"));
		fileup.click();
		
	Thread.sleep(3000);
	String locationoffile="C:\\Users\\Admin\\Downloads\\sample.pdf";
	StringSelection upload=new StringSelection(locationoffile);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload,null);
	Thread.sleep(3000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			}

}
