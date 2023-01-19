package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SauceDemoHomePage;
import pages.SauceDemoLoginPage;
import utilities.Driver;

public class Day02_C02_PageClass {
    @Test
    public void pageClassTest() {
        //Navigate to https://www.saucedemo.com/
        Driver.getDriver().get("https://www.saucedemo.com/");
        //LOGİN SAYFASINDA YAPILAN AKSİYONLAR
        SauceDemoLoginPage loginpage=new SauceDemoLoginPage();
        loginpage.txtUsername.sendKeys("standart_user");
        loginpage.txtPassword.sendKeys("secret_sauce");
        loginpage.btnLogin.click();

        //Burada homepage e gecis yaptigimizdan dolayi homepage classimizdan bir obje uretiriz
        SauceDemoHomePage homePage = new SauceDemoHomePage();

        Select select = new Select(homePage.filterDropdown);
        select.selectByValue("lohi");

        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("low to high"));


        Driver.closeDriver();


    }

}
