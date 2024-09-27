package selenium1;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.manage().window().maximize();
       driver.get("https://leafground.com/checkbox.xhtml");
       driver.findElement(By.id("j_idt87:j_idt89")).click();

     
      driver.findElement(By.id("j_idt87:j_idt91")).click();

      
     String text3 = driver.findElement(By.id("j_idt87:msg_container")).getText();
       if (text3.contains("Checked")) {
           System.out.println("Notification Checkbox is checked.");
       }

  
       driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div")).click();

      
       driver.findElement(By.id("j_idt87:ajaxTriState")).click();

     
       String text2 = driver.findElement(By.className("card")).getText();
       System.out.println("Tri-State Checkbox status: " + text2);

      driver.findElement(By.id("j_idt87:j_idt100")).click();

      
       
 WebElement display = driver.findElement(By.xpath("(//div[@class='card']/following-sibling::div)[2]"));
boolean enabled = display.isEnabled();
System.out.println(enabled);
       

       List<WebElement> multipleOptions = driver.findElements(By.xpath("//h5[text()='Select Multiple']"));
       for (WebElement option : multipleOptions) {
           option.click();
	}
	driver.close();
}
}