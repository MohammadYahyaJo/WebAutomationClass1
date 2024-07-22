package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatById {

    @Test
    public void LocateUsingID (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String  URL = "https://demoqa.com/text-box";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).sendKeys("Mohammad Tester");

    }

}
