package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class HandelTables {

    WebDriver driver = new ChromeDriver();
@BeforeTest

    public  void HandelTables () {

    String URL = "https://the-internet.herokuapp.com/tables";
    driver.navigate().to(URL);
    driver.manage().window().maximize();

}
@Test
        public void PrintTheTable (){

    WebElement table = driver.findElement(By.id("table1"));
    List<WebElement> tablerows=table.findElements(By.tagName("tr"));
    //System.out.println(tablerows.get(0).getText());
    //System.out.println(table.getText());

    for (int i=0; i < tablerows.size();i++ ) {
        System.out.println(tablerows.get(i).getText());
    }
    }
@AfterTest
    public  void CloseTheBrowser (){

    driver.close();
}

  //  System.out.println(tablerows.get(0).getText());
    }

