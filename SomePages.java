package concepts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SomePages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\P-work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
		/*driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().to("https://www.rahulshettyacademy.com/loginpagePractise/#");
		driver.navigate().to("https://www.bbc.com/news");*/
		driver.navigate().to("https://www.google.com/search?q=translate&rlz=1C1GCEA_enAR940AR940&oq=&aqs=chrome.0.69i59i450l8.85647737j0j15&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.name("q")).sendKeys("alm");
		WebElement listaofgoogle=driver.findElement(By.xpath("//div[@class='OBMEnb']"));
		List<WebElement>values=listaofgoogle.findElements(By.tagName("span"));
		int size=values.size();
		System.out.println(size);
		String kaka=values.get(0).getText();
		System.out.println(kaka);
		for(int i=0;i<values.size();i++) {
			String hola=values.get(i).getText();
			System.out.println(hola);
		}
		
		/*
		WebElement elfoot= driver.findElement(By.id("orb-aside"));
		int size =elfoot.findElements(By.tagName("a")).size();
		List<WebElement>links=elfoot.findElements(By.tagName("a"));
		System.out.println(size);
		for(int i=1;i<size;i++) {
			String openinanewwinodwo=Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(openinanewwinodwo);
		}
		Set<String>windowzat=driver.getWindowHandles();
		Iterator<String>itro=windowzat.iterator();
		while(itro.hasNext()) {
			String currntpage=itro.next();
			driver.switchTo().window(currntpage);
			
			String thetitle=driver.getTitle();
			System.out.println(thetitle);
			
		}*/
		
	}
	

}
