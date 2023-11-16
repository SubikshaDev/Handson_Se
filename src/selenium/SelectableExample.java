package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		
		List<WebElement> selectlist =driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
	Actions act=new Actions(driver)	;
	//keyboard Actions
	for(i=0;i<7;i++) {
		act.keyDown(Keys.CONTROL).click(selectlist.get(i));
		act.build().perform();
	}
	
	//act.keyDown(Keys.CONTROL).click(selectlist.get(0)).click(selectlist.get(1)).click(selectlist.get(2)).click(selectlist.get(3)).click(selectlist.get(4)).click(selectlist.get(5)).click(selectlist.get(6)).build().perform();
	//Mouse Actions
	/*for(i=0;i<7;i++) {
		act.clickAndHold(selectlist.get(i));
	}
	act.build().perform();*/
	/*
   act.clickAndHold(selectlist.get(0));
	act.clickAndHold(selectlist.get(1));
	act.clickAndHold(selectlist.get(2));
	act.clickAndHold(selectlist.get(3));
	act.clickAndHold(selectlist.get(4));
	act.clickAndHold(selectlist.get(5));
	act.clickAndHold(selectlist.get(6));
    act.build().perform();*/
}
}