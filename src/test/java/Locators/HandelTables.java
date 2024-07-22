package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandelTables {
@Test
    public  void HandelTables () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String  URL = "https://the-internet.herokuapp.com/tables";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
      //  WebElement TableOne = driver.findElement(By.id("table1"));
       // driver.findElements(By.tagName("tr")).get(0);
    //System.out.println(driver.findElements(By.tagName("tr")).get(0));




    }
}
