package concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RaulChallanges {

	 WebDriver driver;	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\P-work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement op1=driver.findElement(By.cssSelector("label[for='bmw']"));
		WebElement toclick=driver.findElement(By.id("checkBoxOption1"));
		toclick.click();
		String option1=op1.getText();
		System.out.println(option1);
		WebElement drop=driver.findElement(By.id("dropdown-class-example"));
		Select options=new Select(drop);
		options.selectByVisibleText(option1);
		driver.findElement(By.id("name")).sendKeys(option1);
		Thread.sleep(5000);
		driver.findElement(By.id("alertbtn")).click();
		String wt=driver.switchTo().alert().getText();
		String tofetch=wt.split(",")[0].split("Hello")[1].trim();
		if(tofetch.contains(option1)) {
			System.out.println("everthing is ok");
			driver.switchTo().alert().accept();
		}
		else {
			System.out.println("not ok ");
		}
		
		
		
		
		
		
	
	
	
	

}
}