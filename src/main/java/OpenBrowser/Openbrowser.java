package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openbrowser {

	public static void main(String[] args) {
		
		  // Automatically setup WebDriver
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.amazon.in/");
        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();  
        searchBox.sendKeys("iphone", Keys.ENTER);
        
        //test jenkinsdd
		
		
	}

}
