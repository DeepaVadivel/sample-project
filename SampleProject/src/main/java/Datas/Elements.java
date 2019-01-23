package Datas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements {
   //your order xpath
	By yourorder=By.xpath("//span[@class='nav-line-2'][text()='Your Orders']");
	By signin=By.xpath("//div[@id='nav-flyout-ya-signin']/a/span[@class='nav-action-inner'][text()='Sign in']");
	By username=By.cssSelector("input#ap_email");
	By continuee=By.cssSelector("input#continue");
	By password=By.cssSelector("input#ap_password");
	By login=By.cssSelector("span.a-button-text");
	//your order 
	public By yourorders(WebDriver driver)
	{
		return yourorder;
	}
	//sign in button in home page
	public By Signin(WebDriver driver)
	{
		return signin;
	}
	//Username and Password
	public By Username(WebDriver driver)
	{
		return username;
	}
	public By Continuee(WebDriver driver)
	{
		return continuee;
	}
	public By Password(WebDriver driver)
	{
		return password;
	}
	public By Logins(WebDriver driver)
	{
		return login;
	}
	
}
