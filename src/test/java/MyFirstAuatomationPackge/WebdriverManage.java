package MyFirstAuatomationPackge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebdriverManage {

@Test
    public void ChecktheCurrentURL () throws InterruptedException {

Thread.sleep(3000);
        WebDriver driver = new ChromeDriver();
        String URL= "https://www.google.com";
        String secondURL= "https://bonigarcia.dev/webdrivermanager/";
        driver.manage().window().maximize();
        //driver.get(URL);
        driver.navigate().to(URL);
        driver.navigate().to(secondURL);
        driver.navigate().back();
        driver.navigate().refresh();

    }
}
