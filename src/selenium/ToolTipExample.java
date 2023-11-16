package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Gonna find ToolTipText
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		WebElement tooltip=driver.findElement(By.id("firstname"));
		String tooltext=tooltip.getAttribute("title");
		System.out.println("The ToolTip Text is:"+tooltext);
	}

}
