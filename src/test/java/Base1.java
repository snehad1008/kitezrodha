import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	public WebDriver driver;
	public void initilizeBrowser() {
	//	WebDriver driver=WebDriverManager.chromedriver().create();//how to open browser without upcasting
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
}
