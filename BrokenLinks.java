package concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\P-work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1900)", "");
		String url =driver.findElement(By.linkText("SoapUI")).getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int statusofcode=conn.getResponseCode();
		System.out.println(statusofcode);
		WebElement foot =driver.findElement(By.id("gf-BIG"));
		
		List<WebElement>urls=foot.findElements(By.tagName("a"));
		for(WebElement ulrr:urls) {
			String urlll=ulrr.getAttribute("href");
					
			HttpURLConnection connn = (HttpURLConnection)new URL(urlll).openConnection();
			connn.setRequestMethod("HEAD");
			connn.connect();
			int statusofcoden=connn.getResponseCode();
			System.out.println(statusofcoden);
			
		}

	}

}
