package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropDownList {
    WebDriver driver = new ChromeDriver();
    @Test
    public void DropDown() {

        WebDriver driver = new ChromeDriver();
        String URL = "https://www.saucedemo.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("input_error")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }

    @Test
    public  void SelectLowToHigh () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.saucedemo.com/";
        Thread.sleep(5000);
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("input_error")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        Select dropdownvalue= new Select(driver.findElement(By.className("product_sort_container")));
       // dropdownvalue.selectByIndex(2);
        dropdownvalue.selectByValue("lohi");

    }
}