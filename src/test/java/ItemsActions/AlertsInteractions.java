package ItemsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsInteractions {
    WebDriver driver = new ChromeDriver();
    @Test
    public void Alerts(){


        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        String TheText = driver.switchTo().alert().getText();
        String ExpectedText= "I am a JS Alert";
        Assert.assertEquals(TheText, ExpectedText);
        driver.switchTo().alert().accept(); // Assert That the Text "You successfully clicked an alert is displayed after Accept.

    }
    @Test
    public void DismissAlert () {
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();
       String ActualResult =  driver.findElement(By.id("result")).getText();
       String Expected = "You clicked: Cancel";
       Assert.assertEquals(ActualResult, Expected);

    }
    @Test
    public void AlretWithText () {
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("Mohammad");
        driver.switchTo().alert().accept();


    }
}
