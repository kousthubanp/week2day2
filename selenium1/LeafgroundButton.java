package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().window().maximize();
      driver.get("https://leafground.com/button.xhtml");
       driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']")).click();

      String title = driver.getTitle();
      System.out.println();
      if (title.contains("Dashboard")) {
		System.out.println(title);
	} else {
System.out.println();
	}
     
      WebElement confirmDisabledButton = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']"));
      boolean isDisabled = !confirmDisabledButton.isEnabled();
      System.out.println("Button 'Confirm if the button is disabled' is disabled: " + isDisabled);

     
      WebElement submitButton = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']"));
      org.openqa.selenium.Point position = submitButton.getLocation();
      System.out.println("Position of the 'Submit' button: " + position);

      
      WebElement saveButton = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt96']"));
      String backgroundColor = saveButton.getCssValue("background-color");
      System.out.println("Background color of the 'Find the Save button color' button: " + backgroundColor);

      
      WebElement sizeButton = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']"));
      int height = sizeButton.getSize().getHeight();
      int width = sizeButton.getSize().getWidth();
      System.out.println("Height and width of the 'Find the height and width of this button' button: " + height + "x" + width);
driver.close();
	}

}
