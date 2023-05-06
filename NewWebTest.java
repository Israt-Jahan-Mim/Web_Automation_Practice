package locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class NewWebTest {
	
	@Test
	public void testWebPageTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://frontend.iou.ac/");
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.id("modalBtn"));
		loginButton.click();
		
		driver.findElement(By.id("email")).sendKeys("test12345@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div/form/button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/ul/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/a[4]/div")).click();
		
		driver.findElement(By.cssSelector(".text-\\[10px\\]")).click();
		driver.findElement(By.linkText("My Course")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/a[4]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[1]/input")).sendKeys("Hey who are you??did you authorize to test this?");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[2]/div/div/div[1]/div[2]")).click();
        driver.findElement(By.id("react-select-3-option-0")).click();
        driver.findElement(By.id("custom-checkbox")).click();
        
        driver.findElement(By.cssSelector(".ql-editor > p")).click();
        {
          WebElement element = driver.findElement(By.cssSelector(".ql-editor"));
          JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'hello this is test'}", element);
        }
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[6]/div/div/div/div[1]/div[2]")).click();
        driver.findElement(By.id("react-select-2-option-0")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[7]/button")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[3]/textarea")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[3]/textarea")).sendKeys("https://www.youtube.com/watch?v=J1OPEe6wYX4");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[5]/div/button")).click();
        driver.findElement(By.id("dropzone-file")).sendKeys("C:\\Users\\MD_RAKIB_HASAN\\OneDrive\\Pictures\\images.jpg");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div/div[2]/form/div[5]/div/button")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//h1[normalize-space()='test12345@gmail.com'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[normalize-space()='My Course'])[1]")).click();
        Thread.sleep(2000);
        //Close the browser
        driver.quit();
        
        

		
		
	
}
}
