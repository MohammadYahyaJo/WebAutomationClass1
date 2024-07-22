package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocateByTagName {


    @Test
    public void LocateUsingTagName(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String  URL = "https://www.saucedemo.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.tagName("input")).sendKeys("standard_user");

    }
}
