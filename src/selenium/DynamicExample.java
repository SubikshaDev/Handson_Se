package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicExample {
static int TotalAmount;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://testuserautomation.github.io/WebTable/");	
	
	//number of rows
	List<WebElement> rowscount=driver.findElements(By.tagName("tr"));
	int rowsize=rowscount.size();
	System.out.println("Number of rows in the table is :"+rowsize);
	
	//number of columns
	List<WebElement> columncount=driver.findElements(By.tagName("th"));
	int columnsize=columncount.size();
	System.out.println("Number of columns in the table is :"+columnsize);
	
	//Gonna get lastname of will
	List<WebElement> allfirstname=driver.findElements(By.xpath("//td[2]"));
	List<WebElement> alllastname=driver.findElements(By.xpath("//td[3]"));
	for(WebElement firstname:allfirstname)
	{
	if(firstname.getText().equals("Will"))
	{
		System.out.println("hi Will");
	WebElement willlastname=driver.findElement(By.xpath("//td[normalize-space()='Will']//following::td[1]"));	
	String willfullname=willlastname.getText();
	System.out.println("The fullname is Will "+willfullname);	
		
	}
	}
	
	//Gonna get firstname of Hardy
	for(WebElement lastname:alllastname)
	{
	if(lastname.getText().equals("Hardy"))
	{
		System.out.println("hi Hardy");
	WebElement hardyfirstname=driver.findElement(By.xpath("//td[normalize-space()='Hardy']//preceding::td[1]"));	
	String hardyfullname=hardyfirstname.getText();
	System.out.println("The fullname is "+hardyfullname+" Hardy");	
		
	}
	}
	
	//Gonna select the candidate Parker
	for(WebElement firstname:allfirstname)
	{
	if(firstname.getText().equals("Parker"))
	{
		WebElement parkerfirstname=driver.findElement(By.xpath("//td[normalize-space()='Parker']//preceding::td[1]"));	
		parkerfirstname.click();
		System.out.println("Selected Candidate whose FirstName is:Parker");	
		break;	
		}
		}
	
	for(WebElement lastname:alllastname)
	{
	if(lastname.getText().equals("Parker"))
	{
		WebElement parkerlastname=driver.findElement(By.xpath("//td[normalize-space()='Parker']//preceding::td[1]"));	
		String parkerfullname=parkerlastname.getText();
		System.out.println(parkerfullname+" Parker");
		WebElement parker=driver.findElement(By.xpath("//td[normalize-space()='Parker']//preceding::input[@name='select1']"));	
		parker.click();
		if(parker.isSelected())
			{System.out.println("Selected Candidate whose LastName is:Parker");	
			}
		}
		}
	Thread.sleep(3000);
	System.out.println("");
	System.out.println(" LetCode with Kaushik--Dynamic table practice Page");
	System.out.println("");
	WebDriver driveron=new ChromeDriver();
	driveron.get("https://letcode.in/table");
   
	//Gonna find whether Total in Bill is correct or not
	List<WebElement> pricelist=driveron.findElements(By.xpath("//table[@id='shopping']//tbody//td[2]"));
	List<Integer> numberlist=new ArrayList<Integer>();
	WebElement Totalprice=driveron.findElement(By.xpath("//table[@id='shopping']//tfoot//td[2]"));
	String Total=Totalprice.getText();
	System.out.println("Total in Bill is:"+Total);
	int TotalRs=Integer.parseInt(Total);
	System.out.println("pricelist size is:"+pricelist.size());

	for(WebElement listprice:pricelist)
	{
	String amount=listprice.getText();
	numberlist.add(Integer.parseInt(amount));
    TotalAmount+=Integer.parseInt(amount);
    }
	if(TotalRs==TotalAmount)
	{
	System.out.println("TotalAmount Calculation is correct in the Bill :"+TotalRs);
	}
	else {
	System.out.println("Correct Bill Amount is :"+TotalAmount);
	}
	
	//Gonna get the Lowprice and Highprice in the bill
	int lowprice=Collections.min(numberlist);
	System.out.println("Low Price among the bill:"+lowprice);
	int highprice=Collections.max(numberlist);
	System.out.println("High Price among the bill:"+highprice);
	
	//Gonna get item name with the lowest price in bill
	WebElement low=driveron.findElement(By.xpath("//table[@id='shopping']//tbody//td[normalize-space()="+lowprice+"]//preceding::td[1]"));
	System.out.println("Item name with lowest price among the bill is : "+low.getText()+" and price is : "+lowprice);
	
	//Gonna get item name with the highest price in bill
	WebElement high=driveron.findElement(By.xpath("//table[@id='shopping']//tbody//td[text()="+highprice+"]//preceding::td[1]"));
	System.out.println("Item name with highest price among the bill is : "+high.getText()+" and price is: "+highprice);
		
	}
	
}

