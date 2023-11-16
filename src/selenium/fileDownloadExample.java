package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileDownloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/file");
		
		/* WebElement downloadexcel=driver.findElement(By.id("xls"));
		downloadexcel.click();
		
		WebElement downloadpdf=driver.findElement(By.id("pdf"));
		downloadpdf.click();
		
		WebElement downloadtext=driver.findElement(By.id("txt"));
		downloadtext.click();
	*/	
		File downloadfile=new File("C:\\Users\\Admin\\Downloads\\EbayBug");
		File[] filesarray=downloadfile.listFiles();
		int filesize=filesarray.length;
		System.out.println(filesize);
		for(File checkfile:filesarray)
		{
			if(checkfile.getName().equals("sample.txt"))
			{
			System.out.println("downloaded text file-->sample.txt");}
			
		}
		
	}	
	

}
