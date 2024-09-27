package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().window().maximize();
      driver.get("http://leaftaps.com/opentaps/.");
      driver.findElement(By.id("username")).sendKeys("demosalesmanager");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
      	 driver.findElement(By.id("button")).click();
      	 driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.name("phoneNumber")).sendKeys("8015911645");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
System.out.println(text);
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
driver.findElement(By.linkText("Delete")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.name("id")).sendKeys(text);
driver.findElement(By.linkText("Find Leads")).click();
String message = driver.findElement(By.className("x-paging-info")).getText();
if (message.equals("No records to display")) {
    System.out.println("Lead deletion confirmed.");
} 
driver.close();
	}
}