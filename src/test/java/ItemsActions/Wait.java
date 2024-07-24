package ItemsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wait {
    @Test
    public void Implicitwait () {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.id("btn1")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("txt1")).sendKeys("NewTestOne");

}

}
