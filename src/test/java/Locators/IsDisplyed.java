package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsDisplyed {

    WebDriver driver = new ChromeDriver();
@Test
    public void Isdisplayed() {

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Form Authentication")).click();
        WebElement element = driver.findElement(By.id("username"));

        Assert.assertEquals(element.isDisplayed(), true);

//        if (element.isDisplayed()) {
//            System.out.println(element);
//        } else {
//            System.out.println("Element is not displayed on the web page.");
//        }

    }
}
