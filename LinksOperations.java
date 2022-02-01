package concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOperations {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\P-work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
		driver.get("https://www.fiverr.com/?source=top_nav");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7500)", "");
		WebElement footer=driver.findElement(By.cssSelector("div[class='footer-collapsibles grid-15']"));
		List<WebElement>links=footer.findElements(By.tagName("a"));
		for(WebElement link :links) {
			String url =link.getAttribute("href");
			HttpURLConnection connection = (HttpURLConnection) new URL (url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int codeoflink=connection.getResponseCode();
			if(codeoflink<400  ) {
				System.out.println(link.getText()+" >>>>>>>>>>>>this is link does not broken");
			}
			else if(codeoflink>400) {
				System.out.println(link.getText()+" >>>>>>>>>>>>Server Error");
			}
			else {
				System.out.println(link.getText()+" >>>>>>>>>>>>this link in the next sprint");
			}
		}
		

	}

}
