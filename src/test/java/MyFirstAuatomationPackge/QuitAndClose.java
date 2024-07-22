package MyFirstAuatomationPackge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class QuitAndClose {
@Test
    public void QuitAndCloseDiff (){
    // Create a new instance of the ChromeDriver
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://demoqa.com/browser-windows");
    driver.findElement(By.id("tabButton")).click();
  // driver.close();
  //  driver.quit();
}


    // driver.close();  close one window at te time
  // driver.quit();   close all the session and windows of the webdriver
}


