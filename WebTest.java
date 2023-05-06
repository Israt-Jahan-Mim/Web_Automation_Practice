package locator1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTest {
	
	@Test
	public void testWebPageTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationpanda.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), "Automation Panda | A blog for software development and testing");
		Thread.sleep(3000);
		WebElement entryTitle = driver.findElement(By.className("wp-block-heading"));
		assertEquals(entryTitle.getText(), "Choosing a web app to test");
		Thread.sleep(3000);
		driver.quit();
	}
	

	@Test
	public void testDescriptionByClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationpanda.com/");
		driver.manage().window().maximize();
		WebElement entryTitle = driver.findElement(By.className("search-field"));
		entryTitle.click();
		entryTitle.sendKeys("api");
		Thread.sleep(2000);
		entryTitle.submit();
		System.out.println(entryTitle.getText());
		Thread.sleep(10000);
		driver.quit();
	}
	
}
 