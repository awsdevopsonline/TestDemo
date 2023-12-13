import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Materials\\chromedriver.exe");		
		WebDriver driver= new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		/* System.out.println(driver.getTitle()); */
		/* System.out.println(driver.getCurrentUrl()); */
		
		driver.findElement(By.id("inputUsername")).sendKeys("Punnam");
		driver.findElement(By.name("inputPassword")).sendKeys("Punnam@123");
		driver.findElement(By.className("signInBtn")).click();
		//driver.close();
		
	}

}
