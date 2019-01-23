package base.start1;
import Datas.*;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base11 {
	public static WebDriver driver;
	Actions as=new Actions(driver);
	FileDatas fs=new FileDatas();
	Browsers bs=new Browsers();
	Elements ele=new Elements();
	
	@BeforeTest
	public void vuu() throws InterruptedException
	{
		bs.browsers(driver,"chrome");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
	}
@Test
public void config() throws InterruptedException, Throwable
{
	
	driver.findElement(ele.yourorders(driver));
	driver.findElement(ele.Signin(driver));
	Thread.sleep(2000);
	driver.findElement(ele.Username(driver)).sendKeys(fs.getDatas("Sheet2", 1, 0));;
	driver.findElement(ele.Continuee(driver));
	Thread.sleep(2000);
	driver.findElement(ele.Password(driver)).sendKeys(fs.getDatas("Sheet2", 1, 2));;
	driver.findElement(ele.Logins(driver));
	Thread.sleep(2000);
}
}
