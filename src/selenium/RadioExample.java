package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Going into radio & checkbox workspace in the Letcode Website
		driver.get("https://letcode.in/radio");
		
		//1.Going to click one
		driver.findElement(By.xpath("//*[@id=\'yes\']")).click();
		
		//2.Gonna verify that only one is selected
WebElement onlyoneyes=driver.findElement(By.xpath("//*[@id=\'one\']"));
WebElement onlyoneno=driver.findElement(By.xpath("//*[@id=\'two\']"));
onlyoneyes.click();
//onlyoneno.click();
Boolean selectyes=onlyoneyes.isSelected();
Boolean selectno=onlyoneno.isSelected();
System.out.println("Yes button is selected:"+selectyes);
System.out.println("No button is selected:"+selectno);
if(selectyes==true&&selectno==true) {
	System.out.println("Both the yes and no buttons under the find the bug label ,are been selected");
}
else if(selectyes==false&&selectno==false) {
	System.out.println("Both the yes and no buttons ,are not been selected");
	}
else {
	System.out.println("only one button is been selected");
	}



//3.Find the bug
WebElement bugyesbutton=driver.findElement(By.id("nobug"));
WebElement bugnobutton=driver.findElement(By.id("bug"));
bugyesbutton.click();
bugnobutton.click();
Boolean bugyes=bugyesbutton.isSelected();
Boolean bugno=bugnobutton.isSelected();
System.out.println("In find the bug,Yes button is selected:"+bugyes);
System.out.println("In find the bug,No button is selected:"+bugno);
if(bugyes==true&&bugno==true) {
	System.out.println("Both the yes and no buttons under the find the bug label ,are been selected,(Through Radio Button,we should be able to select only onebutton) ");
}
else if(bugyes==false&&bugno==false) {
	System.out.println("Both the yes and no buttons under the find the bug label ,are not been selected");
	}
else {
	System.out.println("Only one button under the find the bug label is been selected");
	}


//4.Gonna find which one is selected
WebElement foo=driver.findElement(By.id("foo"));
Boolean fooselect=foo.isSelected();
WebElement bar=driver.findElement(By.id("notfoo"));
Boolean barselect=bar.isSelected();
System.out.println("Foo is selected:"+fooselect+" "+"Bar is Selected:"+barselect);

//5.Gonna find maybe radiobutton is disabled or not
WebElement maybe=driver.findElement(By.id("maybe"));
Boolean mayberadio=maybe.isEnabled();
System.out.println("The third radiobutton maybe is enabled:"+mayberadio);

//6.Gonna find checkBox is selected or not
WebElement checkselect=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
Boolean selectcheckbox=checkselect.isSelected();
System.out.println("Remember me checkbox is selected:"+selectcheckbox);
	
//7.Gonna accept t&c checkbox
WebElement accept=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input"));
accept.click();
		
	}
}