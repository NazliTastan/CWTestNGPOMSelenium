package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Day01_C02_ConfigReader {
    @Test
    public void readConfig() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.closeDriver();
    }
}
