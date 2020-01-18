package org.live;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MainExecute extends MyFirstProject {
	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\srsuresh\\eclipse-workspace\\suresh\\LogninDetails\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.newegg.com/");
	
		
	driver.findElement(By.xpath("(//div[text()='Singapore'])[1]")).click();
	
	driver.findElement(By.xpath("(//button[@class='btn btn-primary forchangecounrtypopup gotoregionbtn'])[1]")).click();
		
	WebElement btnLogin = driver.findElement(By.xpath("//a[@class='top-nav-tab-name logout']"));
	btnLogin.click();

	WebElement userEmail = driver.findElement(By.id("UserName"));
	userEmail.sendKeys(getLoginDetails(1,0));
	WebElement userPass = driver.findElement(By.id("UserPwd"));
	userPass.sendKeys(getLoginDetails(1,1));
	WebElement btnSignin = driver.findElement(By.id("submitLogin"));
	btnSignin.click();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File source=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\srsuresh\\eclipse-workspace\\suresh\\LogninDetails\\Screenshots\\DoneSignin.jpeg");
	FileHandler.copy(source, des);
	
	WebElement search = driver.findElement(By.id("haQuickSearchBox"));
	search.sendKeys("Lenovo Laptop", Keys.ENTER);
	
	driver.findElement(By.xpath("//a[@href='https://www.newegg.com/global/sg-en/platinum-grey-lenovo-ideapad-l340-81lw000dus-mainstream/p/N82E16834845072?Description=Lenovo%20Laptop&cm_re=Lenovo_Laptop-_-34-845-072-_-Product']")).click();

	WebElement addTokart = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-wide']"));
	addTokart.click();
	
	//driver.findElement(By.xpath("//a[@class='button button-primary has-icon-right']")).click();

	//WebElement firstName = driver.findElement(By.xpath("//input[@title='First Name']"));
	//firstName.sendKeys(getLoginDetails(5,0));
	
	//WebElement lastName = driver.findElement(By.xpath("//input[@title='Last Name']"));
	//lastName.sendKeys(getLoginDetails(5,1));
	
	//WebElement addressLine1 = driver.findElement(By.xpath("//input[@name='SAddress1']"));
	//addressLine1.sendKeys(getLoginDetails(6,0));
	
	//WebElement addressLine2 = driver.findElement(By.xpath("//input[@name='SAddress2']"));
	//addressLine2.sendKeys(getLoginDetails(6,1));
	
	//WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='ShippingPhone']"));
	//phoneNumber.sendKeys(getLoginDetails(7,0));
	
	//driver.findElement(By.xpath("(//a[@title='Icon button'])[1]")).click();
	
	//TakesScreenshot ts=(TakesScreenshot)driver;
	//File source1=ts.getScreenshotAs(OutputType.FILE);
	//File des1=new File("C:\\Users\\srsuresh\\eclipse-workspace\\suresh\\LogninDetails\\Screenshots\\Beforpayment.jpeg");
	//FileHandler.copy(source1, des1);
	
	//WebElement holderName = driver.findElement(By.xpath("//input[@id='Card_HolderNameNew']"));
	//holderName.sendKeys(getLoginDetails(5,0));
	
	//WebElement cardNumber = driver.findElement(By.xpath("//input[@id='Card_CCNUMBERNEW']"));
	//cardNumber.sendKeys(getLoginDetails(6,0));
	
	//WebElement m = driver.findElement(By.id("Card_exp_monthNew"));
	//selectByValue(m, 9);
	
	//WebElement y = driver.findElement(By.id("Card_exp_yearNew"));
	//selectByValue(y, 2);
	
	//WebElement cvvNumber = driver.findElement(By.xpath("//input[@id='Card_CCNUMBERNEW']"));
	//cvvNumber.sendKeys(getLoginDetails(6,0));
	
	//driver.findElement(By.xpath("(//a[@class='button button-primary button-override has-icon-right'])[1]")).click();
	
	
	
	}
	

}
