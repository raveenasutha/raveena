import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class url {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.sprint.com/");
Actions acc= new Actions(driver);
WebElement tst23 = driver.findElement(By.xpath("(//span[text()='Shop Plans'])[2]"));
acc.moveToElement(tst23).perform();


WebElement tst2 = driver.findElement(By.xpath("(//a[@class='js-nav-link'])[60]"));
acc.moveToElement(tst2).perform();



	
	}

}
