package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		//finding web element and interacting with them
		driver.switchTo().frame(0);
		//driver.findElement(By.id("tags")).sendKeys("j");
		driver.findElement(By.id("tags")).sendKeys("a");
		Thread.sleep(3000);
	 List<WebElement> autoselect=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
	int size=autoselect.size();
	System.out.println("list size:"+size);
	 for(WebElement autoselection:autoselect)
	{
		if(autoselection.getText().equals("Java"))
		{
			System.out.println("AutoSelected Text is:"+autoselection.getText());
			autoselection.click();	
		   break;
		}
	}	driver.close();

}
}