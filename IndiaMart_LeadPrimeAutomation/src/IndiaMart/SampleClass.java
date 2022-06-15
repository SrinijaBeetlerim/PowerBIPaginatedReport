package IndiaMart;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browser Drivers\\chromedriver_100.exe");
		ChromeDriver driver = new ChromeDriver();
		//js = (JavascriptExecutor)driver;
		//actions = new Actions(driver);
		//wait = new WebDriverWait(driver,100);
		//driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}

}
