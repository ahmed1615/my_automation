package first_one;


import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dmo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hi");
		String stg="this is a test string";
		char[] charr=stg.toCharArray();
		System.out.println(charr[1]);
		for(int i=stg.length()-1;i>=0;i--)
		{
			System.out.print(charr[i]);
		}
		
		String a[]=stg.split(" ");
		System.out.println(a);
		for(int b=a.length-1;b>=0;b--) {
			System.out.print(a[b]+" ");
		}
		
		
		System.setProperty("webdriver.chrome.driver","C:\\P-work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement serch=driver.findElement(By.name("q"));
		System.out.println(serch.getText());
		serch.sendKeys("amaza");
		WebElement main=driver.findElement(By.xpath("//ul[@role='listbox']"));
		List <WebElement> lista=main.findElements(By.tagName("span"));
		//System.out.println(lista.get(1).getText());
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).getText());
		}
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,2000)", "");
		//String [] lisaB= {"CetapHil","Colgate","Siempre Libre"};
	
		/*driver.get("https://www.youtube.com/");
		 String titile= driver.getTitle();
		 System.out.println(titile);
		 driver.get("https://www.oracle.com/index.html");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.get("https://login.salesforce.com/?locale=mx");
		 driver.findElement(By.id("username")).sendKeys("test_1");
		 driver.findElement(By.id("password")).sendKeys("thisispassword");
		 driver.findElement(By.id("Login")).click();
		String error= driver.findElement(By.id("error")).getText();
		String error_writing="Compruebe su nombre de usuario y contraseña. Si sigue sin poder iniciar sesión, haga contacto con su administrador de Salesforce.";
		if(error==error_writing) {
			System.out.println("it is the same message");
		} 
		else {
			System.out.println("this is not the same message");
		}
		//driver.close();
		 System.out.println("i start java learning");
		 int a=22;
		 String hola="hi";
		 int b=29;
		 int sum=a+b;
		 System.out.println(sum);
		 Basic2 test=new Basic2();
		 test.tagroba();
		String h= test.is_return();
		System.out.println(h);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select option=new Select(staticdropdown);
		option.selectByValue("INR");
		System.out.println("the option which i select is "+ option.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=0;i<3;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		Assert.assertFalse(false);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DED']")).click();
		//driver.findElement(By.id("ctl00_mainContent_group_details1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='COK'])[2]")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("eg");
		List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement choess:options) {
			if (choess.getText().equalsIgnoreCase("EGYPT")) {
				choess.click();
				break;
			}
		}*/
		System.out.println("done :)");
	}

}
