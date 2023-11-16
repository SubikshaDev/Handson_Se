package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/broken_images");
	
			WebElement imagebroken2=driver.findElement(By.xpath("//*[@id=\'content\']/div/img[2]"));
		
			if(imagebroken2.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image2 is broken");
		}
		else
		{
			System.out.println("Image2 is not broken");
		}
	WebElement imagecheck3=driver.findElement(By.xpath("/html/body/div[2]/a/img"));		
	if(imagecheck3.getAttribute("naturalWidth").equals("0"))
	{
		System.out.println("Image3 is broken");
	}
	else
	{
		System.out.println("Image3 is not broken");
	}		
	WebElement imagecheck1=driver.findElement(By.xpath("//*[@id=\'content\']/div/img[1]"));		
	if(imagecheck1.getAttribute("naturalWidth").equals("0"))
	{
		System.out.println("Image1 is broken");
	}
	else
	{
		System.out.println("Image1 is not broken");
	}		
		
	
	}
	

}
