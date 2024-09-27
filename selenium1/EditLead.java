package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.manage().window().maximize();
       driver.get("http://leaftaps.com/opentaps/.");
       driver.findElement(By.id("username")).sendKeys("demosalesmanager");
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       WebElement login = driver.findElement(By.className("decorativeSubmit"));
       	login.click();
       	WebElement crmsfa = driver.findElement(By.id("button"));
       	crmsfa.click();
       	WebElement lead = driver.findElement(By.linkText("Leads"));
       	lead.click();
       	WebElement createlead = driver.findElement(By.linkText("Create Lead"));
       	createlead.click();
       	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("kousthuOwn");
       	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("kousthuban");
       	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("parthasarathy");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("kousthu");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Edit Lead");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mkpkousthuban@gmail.com");
	WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select SP= new Select(state);
	SP.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("notes to myself");
	driver.findElement(By.name("submitButton")).click();
	 String title = driver.getTitle();
     System.out.println();
     if (title.contains("View Lead")) {
		System.out.println(title);
	} else {
System.out.println();
	}
	driver.close();
	}
	

}
