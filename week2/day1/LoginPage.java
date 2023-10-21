package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println("title");
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		String leadpage = driver.getTitle();
		
		System.out.println("leadpage");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhanasekaran");
		driver.findElement(By.name("submitButton")).click();
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		
		if(firstName.contains("Divya")) {
			System.out.println("The Lead is created");
		}
		else {
			System.out.println("The Lead is not created");
		}
		
	}

}
