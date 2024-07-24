package ItemsActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

public class ExplicatWAit {


    public class ExplicitWaitExample {
         WebDriver driver = new ChromeDriver();
        public  void MyTest () {
            WebDriverManager.chromedriver().setup();


            driver.get("https://www.saucedemo.com/");
            WebElement LoginButton = driver.findElement(By.id("login-button"));
            driver.manage().window().maximize();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            LoginButton.click();

            driver.findElement(By.id("react-burger-menu-btn")).click();
         WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
          // Set an implicit wait of 5 seconds
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("logout_sidebar_link")));
            driver.findElement(By.id("logout_sidebar_link")).click();

        }
        public void LogOutTest () {

        }

    }
}

