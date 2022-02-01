package concepts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\P-work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,600)", "");
		js.executeScript("document.querySelector('.tableFixHead').scroll(0,500)");
		List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
			int j=0;
			int sizeofvalues=values.size();
			for(int i=0;i<sizeofvalues;i++) {
				String numberswitstring=values.get(i).getText();
				int finalnumbers=Integer.parseInt(numberswitstring);
				System.out.println(finalnumbers);
				j=j+finalnumbers;
				
			}
			System.out.println(j);
		String amount=driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
		String finalamount=amount.split(":")[1].trim();
		int finalone=Integer.parseInt(finalamount);
		if(j==finalone) {
			System.out.println("it is very nice one");
		}
		WebElement maintable=driver.findElement(By.cssSelector("table[id='product']"));
		List<WebElement>numberofrow=maintable.findElements(By.tagName("tr"));
		System.out.println(numberofrow.size());
		int numberofcol=numberofrow.get(0).findElements(By.tagName("th")).size();
		System.out.println(numberofcol);
		List<WebElement>textesnumer2=numberofrow.get(2).findElements(By.tagName("td"));
		for(WebElement tt:textesnumer2) {
			System.out.println(tt.getText());
		}
		WebElement country=driver.findElement(By.id("autocomplete"));
		country.sendKeys("unit");
		WebElement countrylist=driver.findElement(By.id("ui-id-1"));
		List<WebElement>ultimalist=countrylist.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(int i=0;i<ultimalist.size();i++) {
		String thecountry=ultimalist.get(i).getText();
		if(thecountry.equalsIgnoreCase("United Kingdom (UK)")) {
			ultimalist.get(i).click();
		}
		
		}
		
		///html[1]/body[1]/div[3]/div[1]/fieldset[1]/
		//table[id='product']/tbody/tr[1]
	}
}
