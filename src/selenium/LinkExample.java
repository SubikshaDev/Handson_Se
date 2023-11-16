package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

//Practicing using Only Testing Blog website
driver.navigate().to("http://only-testing-blog.blogspot.com/2014/05/login.html");

//finding by link text
WebElement findthroughlink=driver.findElement(By.linkText("Home"));
findthroughlink.click();
driver.navigate().back();

//finding by partial link text
//driver.findElement(By.partialLinkText("Text File")).click();

//Gonna find where we are supposed to go without clicking link
WebElement whereitgoes=driver.findElement(By.linkText("Newer Post"));
String where=whereitgoes.getAttribute("href");
System.out.println("the Newer Post link goes to "+where);

//Gonna find whether the link is broken or not
WebElement brokenlink=driver.findElement(By.linkText("Older Post"));
brokenlink.click();
String title=driver.getTitle();
if(title.contains("404")) {
	System.out.println("Older Post link broken"); 
}
else {
	System.out.println("Older Post link not broken");
}
driver.navigate().back();

//Verifing whether StaleElementRefrenceException occuring or not,if it occurs then identify the webelement and proceed with process
findthroughlink.click();
driver.navigate().back();

//Gonna find the number of links
List<WebElement> linkscount=driver.findElements(By.tagName("a"));
int numberoflinks=linkscount.size();
System.out.println("Number of Links "+numberoflinks);

}
}
