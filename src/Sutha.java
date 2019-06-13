import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sutha {
public static void main(String[] args) throws AWTException, InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		 WebElement txt = driver.findElement(By.xpath("//label[text()='Selenium Commands']"));
		 Select s= new Select(txt);
		 List<WebElement> emp = s.getOptions();
		 for (int i = 0; i < emp.size(); i++) {
			WebElement t = emp.get(i);
		String r = t.getText();
		System.out.println(r);
		}
			
		}
		
				
			
				 
				
			}
			

	
		
		
		
		
		







                                                       