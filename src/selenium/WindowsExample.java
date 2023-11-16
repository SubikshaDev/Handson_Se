package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//Going into window workspace in the Letcode Website
//driver.get("https://letcode.in/windows");
driver.navigate().to("https://letcode.in/windows");

String parentwindow=driver.getWindowHandle();
//1.click on home button and 2. going to newly opened tab
WebElement home=driver.findElement(By.id("home"));
home.click();
//3.Gonna get title of new tab
Set<String> newwindow=driver.getWindowHandles();
for(String allwindows:newwindow)
{
	if(!allwindows.equals(parentwindow)) {
System.out.println(driver.switchTo().window(allwindows).getTitle());
	}
	
	//4.Gonna close ParentWindow and 5.Gonna close ChildWindow
	driver.switchTo().window(allwindows);
	Thread.sleep(5000);
	driver.close();
}

//6.clicking multiple button
WebDriver drivers=new ChromeDriver();
drivers.get("https://letcode.in/windows");
WebElement multi=drivers.findElement(By.id("multi"));
multi.click();
//7.Printing all the windows
Set<String> multiwindow=drivers.getWindowHandles();
for(String multiplewindows:multiwindow)
{
System.out.println(drivers.switchTo().window(multiplewindows).getTitle());
}
Thread.sleep(5000);
//7.closing all the windows
drivers.quit();
}
}