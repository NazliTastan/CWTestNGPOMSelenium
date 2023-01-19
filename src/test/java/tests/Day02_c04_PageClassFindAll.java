package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SauceDemoLoginPage;
import utilities.Driver;

public class Day02_c04_PageClassFindAll {
    @Test

    public void test(){

        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage lp = new SauceDemoLoginPage();

        Assert.assertEquals(3, lp.inputElements.size());
        Driver.closeDriver();
    }


    }

