package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Day01_C01_DriverExample {

   //Go to URL: https://opensource-demo.orangehrmlive.com/
   //Verify title contains OrangeHRM.
   //Use Driver Class.
   @Test
   public void test01() {
       Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
       String title=Driver.getDriver().getTitle();
       Assert.assertTrue(title.contains("OrangeHRM"));
       Driver.closeDriver();

   }

    @Test
    public void test02() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String title=driver.getTitle();
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
        Driver.closeDriver();
}

    }

