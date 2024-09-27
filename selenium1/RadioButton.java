package selenium1;

import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.leafground.com/radio.xhtml");
Thread.sleep(4000);
driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
	        
driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
WebElement element = driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']"));
if (element.isSelected()) {
	System.out.println("enabled");
}else {
	System.out.println("not enabled");
}


	        
 WebElement defaultSelected = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]"));
 boolean s= defaultSelected.isEnabled();
 System.out.println(s);
	        
WebElement ageGroup = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[5]"));
	   if (ageGroup.isEnabled()) {
System.out.println("selected");
	        }
	driver.close();
	}
	
}