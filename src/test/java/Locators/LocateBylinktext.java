package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocateBylinktext {

    @Test
    public void LocateUsingNLinkText(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String  URL = "https://the-internet.herokuapp.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Check")).click();

    }


}
