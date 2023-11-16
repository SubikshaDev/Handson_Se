package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

//Going into Dropdown Select workspace in the letcode website
driver.navigate().to("https://letcode.in/dropdowns");

//Gonna Select using VisibleText
WebElement dropdown1=driver.findElement(By.id("fruits"));
Select select=new Select(dropdown1);
select.selectByVisibleText("Orange");

//Gonna check whether the dropdown isMultiple and gonna select multiple options
WebElement multiselect=driver.findElement(By.id("superheros"));

Select multipleselect=new Select(multiselect);
Boolean multi=multipleselect.isMultiple();
System.out.println("the dropdown has multiselect options:"+multi);
multipleselect.selectByValue("bt");
multipleselect.selectByIndex(1);
multipleselect.selectByVisibleText("Spider-Man");
multipleselect.selectByIndex(25);

//Gonna Print the first selected option and all the selected options in superheros dropdown
List<WebElement> optionslist=multipleselect.getAllSelectedOptions();
WebElement lasthero=multipleselect.getFirstSelectedOption();
System.out.println("the first selected option in superheros dropdown is:"+lasthero.getText());
System.out.println("the selected options in superheros dropdown are:");
for(WebElement listofoptions:optionslist) {
	System.out.println(listofoptions.getText());
}

// Getting the last language in the option
WebElement selectlang=driver.findElement(By.id("lang"));
Select lastlang=new Select(selectlang);
lastlang.selectByIndex(4);

//Gonna Print the size of options in languages dropdown
List<WebElement> langoptions=lastlang.getOptions();
int optionssize=langoptions.size();
System.out.println("The size of options in the language dropdown is:"+optionssize);

//Gonna select using value and print that value
WebElement selectvalue=driver.findElement(By.id("country"));

//selects.selectByValue("India");
selectvalue.sendKeys("India");
Select selects=new Select(selectvalue);
WebElement selectedvalue=selects.getFirstSelectedOption();
System.out.println("The value selected is:"+selectedvalue.getText());

	}
}
