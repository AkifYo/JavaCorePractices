package tests;

import org.testng.annotations.Test;
import pages.AlbertHeijnHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_TC_01 {
    AlbertHeijnHomePage albertHeijnHomePage= new AlbertHeijnHomePage();
    @Test
    public void testCase01(){
        //1 go to home page
        Driver.getDriver().get(ConfigReader.getProperty("ahUrl"));
        albertHeijnHomePage.cookiesButon.click();
    }
}
