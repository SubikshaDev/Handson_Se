package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

//Going into edit workspace in the Letcode Website 
driver.get("https://letcode.in/edit");

//Gonna send text(enter)
driver.findElement(By.id("fullName")).sendKeys("Subiksha");

//Gonna Append text
driver.findElement(By.id("join")).sendKeys(" in testing "+Keys.TAB);

//Gonna Get text
WebElement Getbox=driver.findElement(By.id("getMe"));
String getthetext=Getbox.getAttribute("value");
System.out.println("The value is "+getthetext);

//Gonna clear the text
WebElement clearbox=driver.findElement(By.id("clearMe"));
clearbox.clear();

// Gonna confirm it is disabled
WebElement disabledbox=driver.findElement(By.id("noEdit"));
Boolean checkdisabledbox=disabledbox.isEnabled();
System.out.println("Box is enabled: "+checkdisabledbox+",that is disabled");


//Gonna confirm it is enabled
WebElement enabledbox=driver.findElement(By.id("dontwrite"));
Boolean checkenabledbox=enabledbox.isEnabled();
System.out.println("Box is enabled: "+checkenabledbox);






	}
	

}
