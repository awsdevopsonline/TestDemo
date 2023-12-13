import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeBrowser Invoke
		//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Materials\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//FireFox Launch
		//Geckodriver
		//System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Selenium Materials\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		//MSEDGE Launch msedgedriver
		System.setProperty("webdriver.edge.driver","E:\\Selenium\\Selenium Materials\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com");		
		System.out.println(driver.getTitle());		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
