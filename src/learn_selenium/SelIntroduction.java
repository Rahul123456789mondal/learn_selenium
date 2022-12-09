package learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		// chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C://Users//Arka_007//Desktop//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
		Thread.sleep(2000);
		String invalidPass = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]")).getText();
		System.out.println(invalidPass);

		// Open Hyperlink we used the LinkText.
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		//driver.close();


	}

}
