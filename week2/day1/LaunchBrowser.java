package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("divyabharathi902@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Div1994");
		driver.findElement(By.name("login")).click();
		
	}
}
