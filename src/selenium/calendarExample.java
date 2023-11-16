package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
        WebElement UsingSendkeys=driver.findElement(By.id("first_date_picker"));
       UsingSendkeys.sendKeys("16/11/2023");
        UsingSendkeys.click();
	
       
        WebElement NextButton=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span"));
		 NextButton.click();
	WebElement NxtButton=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
		 NxtButton.click();
	/*	WebElement clickdate=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[5]/a"));
	clickdate.click();
	*/
		 WebElement datetobegiven=driver.findElement(By.xpath("//a[contains(text(),'16')]"));
		 datetobegiven.click();
		 
	}

}
