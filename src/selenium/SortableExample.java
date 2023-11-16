package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/sortable/connect-lists.html");
		//Gonna get the lists of two sortables
		List<WebElement> sortable1=driver.findElements(By.xpath("//*[@id=\'sortable1\']/li"));
		int size1=sortable1.size();
		System.out.println("sortable1 size:"+size1);
		List<WebElement> sortable2=driver.findElements(By.xpath("//*[@id=\'sortable2\']/li"));
		int size2=sortable2.size();
		System.out.println("sortable2 size:"+size2);
		
		//Gonna sort from(item2 of sortable1) to(item4 of sortable2)
		System.out.println(sortable1.get(0));
		WebElement fromelement=sortable1.get(1);
		WebElement toelement=sortable1.get(3);
		
		Actions action=new Actions(driver);
     	action.clickAndHold(fromelement);
		action.moveToElement(toelement);
		action.release(fromelement);
		action.build().perform();
		//Thread.sleep(2000);
		
	}

}
