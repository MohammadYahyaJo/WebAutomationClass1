package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class LocateByCss {

    @Test
    public void Handeltable() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tablerows=table.findElements(By.tagName("tr"));
        System.out.println(tablerows.get(1).getText());
    }

}
