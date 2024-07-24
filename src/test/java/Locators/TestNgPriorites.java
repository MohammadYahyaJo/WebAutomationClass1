package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPriorites {

    WebDriver driver = new ChromeDriver();
    private String AddItemToCart;

    @AfterTest
    public  void CloseBroswer (){
        driver.close();
    }

    @Test(priority = 1)

    public  void LoginTest (){

    String  URL = "https://www.saucedemo.com/";
    driver.navigate().to(URL);
    driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
    }
    @Test(priority =2, enabled = false , description = "This test add item to the cart", groups = "SmokeTest")
    public void AddItemToCart (){
        String  URL = "https://www.saucedemo.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }


}
