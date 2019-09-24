package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelExample {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\downloadfiles\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
driver.get("https://connect.maveric-systems.com/index.php/site/login");
driver.findElement(By.name("LoginForm[username]")).sendKeys("aishwaryarn");
String test=driver.findElement(By.name("yt0")).getText( );
System.out.println("test");

Thread.sleep(2000);
driver.get("https://prism.precisionit.co.in/Pages/SignIn.aspx");
Thread.sleep(4000);
driver.quit();

	}

}
