package MyFirstAuatomationPackge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWebsiteURL {

    @Test
    public void ChecktheCurrentURL () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL= "https://bonigarcia.dev/webdrivermanager/";
        String ExpetcedPageTitle= "WebDriverManager";
        driver.manage().window().maximize();
        driver.navigate().to(URL);
        String ActualPageTitle= driver.getTitle();
       // System.out.println(PageTitle);
        Assert.assertEquals(ActualPageTitle,ExpetcedPageTitle);
        Thread.sleep(5000);

        driver.quit();
    }
}
