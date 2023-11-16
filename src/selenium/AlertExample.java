package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//Going into alert workspace in the Letcode Website
driver.get("https://letcode.in/alert");

//Gonna accept in alert
WebElement acceptalert=driver.findElement(By.id("accept"));
acceptalert.click();
Alert alerts=driver.switchTo().alert();
alerts.accept();

//Gonna dismiss in alert
WebElement confirmalert=driver.findElement(By.id("confirm"));
confirmalert.click();
Alert alert=driver.switchTo().alert();
String dismistext=alert.getText();
System.out.println( dismistext);
alert.dismiss();

//Gonna prompt and accept in the alert
WebElement promptalert=driver.findElement(By.id("prompt"));
promptalert.click();
Alert alertz=driver.switchTo().alert();
alertz.sendKeys("Om");
alertz.accept();

//Gonna just click the sweetalert and print text that pops up
WebElement sweetalert=driver.findElement(By.id("modern"));
sweetalert.click();
String moderntxt=driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/div[2]/div/div/p")).getText();
System.out.println(moderntxt);
driver.navigate().back();
	}
}
