package Selenium_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class primera_prueba {
	
	public static void main (String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C://Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//inserta tu c�digo aqu�
		Thread.sleep(5000);
		driver.quit();
	}
}