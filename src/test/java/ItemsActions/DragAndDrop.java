package ItemsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
@Test
    public void TestDragAndDrop () {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement FirstElement = driver.findElement(By.id("column-a"));
        WebElement SecondElement = driver.findElement(By.id("column-b"));
        action.dragAndDrop(FirstElement,SecondElement).build().perform();
        //Aessrtion can be done ? on what ?





    }
}
