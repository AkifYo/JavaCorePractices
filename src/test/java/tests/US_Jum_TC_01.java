package tests;

import org.testng.annotations.Test;
import pages.JumboTestPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_Jum_TC_01 {
    @Test
    public void test01(){
        // go to jum bo homepage
        Driver.getDriver().get(ConfigReader.getProperty("jumUrl"));
        // locate the cookies btn end click it
        ReusableMethods.bekle(2);
        JumboTestPage jumboTestPage= new JumboTestPage();
        jumboTestPage.cookiBtn.click();
        ReusableMethods.bekle(2);
    }
}
