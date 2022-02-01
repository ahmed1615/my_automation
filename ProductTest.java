package concepts;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductTest {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\P-work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().to("https://www.rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();		
		WebDriverWait w=new WebDriverWait(driver,5);
		WebElement link=driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));		
		Actions act=new Actions(driver);
		link.click();		
		Set<String>windows=driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String>ir= windows.iterator();
		String first=ir.next();
		String child=ir.next();
		driver.switchTo().window(child);		
		String email=driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1]
				.trim().split("with")[0].trim();
		driver.switchTo().window(first);
		driver.findElement(By.id("username")).sendKeys(email);
		driver.switchTo().window(child);
		driver.close();
		String [] productsweneed= {"Brocolli","Cucumber","Beetroot"};
		List list=Arrays.asList(productsweneed);		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size();i++) {		
			String[] nameofpro=products.get(i).getText().split("-");			
			int j=0;			
			if(list.contains(nameofpro[0].trim())){			
				j++;			
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();			
				if(j==productsweneed.length) {
					break;
			}
			}
			
		}
	}

	}
