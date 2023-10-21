package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	
	public static void main(String[] args) {
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
		 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select drop1 =new Select(source);
		 drop1.selectByValue("LEAD_CONFERENCE");
				
		 WebElement tools = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2 = new Select(tools);
		drop2.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement ownerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3 =new Select(ownerShip);	
		drop3.selectByValue("OWN_CCORP");
	}
	

}
