package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
	    
		//Sending first name
	    driver.switchTo().frame(0);
		WebElement firstname=driver.findElement(By.name("fname"));
		firstname.sendKeys("Subiksha");
		
	//Sending Last name	
		WebElement Surname=driver.findElement(By.name("lname"));
		Surname.sendKeys("Dev");
		
	//Sending email
     	driver.switchTo().frame(1);
		WebElement mail=driver.findElement(By.name("email"));
		mail.sendKeys("Subi@gmail.com");
		
	//Printing the number of frames
		driver.switchTo().defaultContent();
	List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
	int framessize=totalframes.size();
	System.out.println("No.of frames is:"+framessize);
		
	}

}
