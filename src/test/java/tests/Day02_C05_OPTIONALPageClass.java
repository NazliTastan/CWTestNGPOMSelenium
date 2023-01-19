package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AmazonHomePageV1;

import java.time.Duration;

public class Day02_C05_OPTIONALPageClass {
    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");
        //Driver objemiz static degil ise KULLANILIR. bu driver objemizi page class imizda kullanmak adına con
        AmazonHomePageV1 homePage=new AmazonHomePageV1(driver);
        //homePage.searchFor("modem");
        homePage.navigateToOrders();
    }

}
