package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlbertHeijnHomePage {
    public AlbertHeijnHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "decline-cookies")
    public WebElement cookiesButon;
}
