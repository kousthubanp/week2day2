package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Tuna@321");
	WebElement webElement = driver.findElement(By.xpath("//button[text()='Log in']"));
	webElement.click();


	}

}
