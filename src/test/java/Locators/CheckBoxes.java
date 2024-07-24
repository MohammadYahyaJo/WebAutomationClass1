package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxes {

    @Test
    public  void CheckBoxesHandel(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");

        System.out.println(driver.findElement(By.cssSelector("input:nth-child(1)")).isSelected());

    }


}
