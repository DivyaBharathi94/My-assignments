package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Divya");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Dhanasekaran");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("8328640497");
		
		// Step 10: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("Password@123");
		
		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.id("day"));
		Select dayDD = new Select(day);
		dayDD.selectByIndex(5);
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthDD = new Select(month);
		monthDD.selectByIndex(8);
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearDD = new Select(year);
		yearDD.selectByIndex(1);
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//input[@value='1']")).click();
		

	}

}
