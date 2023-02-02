package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.AlbertHeijnHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US01_TC_01 {

    Actions actions= new Actions(Driver.getDriver());

    @Test
    public void testCase01(){

        //1 go to home page
        Driver.getDriver().get(ConfigReader.getProperty("ahUrl"));
       WebElement cookiesBtn=Driver.getDriver().findElement(By.id("decline-cookies"));
       cookiesBtn.click();

        //2 move to log in button
       // albertHeijnHomePage.logInBtn.click();


         WebElement logInBtn= Driver.getDriver().findElement(By.xpath("//a[@aria-owns='menu_mijn']"));
        // logInBtn.click();
        //inloggen button

        actions.moveToElement(logInBtn).perform();
        // click the log in button to reach the login page
        WebElement logInBtn2= Driver.getDriver().findElement(By.xpath("//span[@class='f-menu-item__text']"));
        logInBtn2.click();



    }
}
