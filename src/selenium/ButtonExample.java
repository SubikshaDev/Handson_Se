package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Going into button workspace in the Letcode Website
System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://letcode.in/buttons");

//Going to the homepage and come back
driver.findElement(By.id("home")).click();
driver.navigate().back();


//Gonna find location
WebElement buttonlocation=driver.findElement(By.id("position"));
Point position=buttonlocation.getLocation();
int positionofX=position.getX();
int positionofY=position.getY();
System.out.println("Location of Button, x and y coordinates are ;"+positionofX+" , "+positionofY);

//Gonna find the Height and Width
WebElement buttonsize=driver.findElement(By.id("property"));
int buttonheight=buttonsize.getSize().getHeight();
int buttonwidth=buttonsize.getSize().getWidth();
System.out.println("Button Height and weight is:"+buttonheight+" , "+buttonwidth);

//Gonna find the Color of button
WebElement buttoncolor=driver.findElement(By.id("color"));
String colorofbutton=buttoncolor.getCssValue("background-color");
System.out.println("color of button :"+colorofbutton);

//Gonna find button is disabled(not enabled)
WebElement disabledbutton=driver.findElement(By.xpath("//*[@id=\'isDisabled\']"));
Boolean notenabledbutton=disabledbutton.isEnabled();
System.out.println("Button is enabled:"+notenabledbutton);

//Gonna click and Hold Button with help of ACTIONS
WebElement clickholdbutton=driver.findElement(By.xpath("//*[@id=\'isDisabled\']/div/h2"));
Actions act=new Actions(driver);
act.clickAndHold(clickholdbutton).build().perform();


	}

}
