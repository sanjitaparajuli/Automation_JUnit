package test101;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JunitTest {

	WebDriver driver;
	
	@Before

	public void Login() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(" https://techfios.com/test/101/index.php");
	}
	@Test
	public void ToggleAll() {
		
		WebElement Toggle_ELement = driver.findElement(By.xpath("//input[@type='checkbox' and @name='allbox']"));
		Toggle_ELement.click();
//		Toggle_ELement.clear();
		WebElement ListItem_Element = driver.findElement(By.xpath("//*[@id=\"todos-content\"]/form/ul/li[10]"));
		ListItem_Element.click();
		WebElement RemoveButton_Element = driver.findElement(By.xpath("//input[@type='submit' and @value='Remove']"));
		RemoveButton_Element.click();
		
	}
	
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
		
		
		
		}
	
//}
