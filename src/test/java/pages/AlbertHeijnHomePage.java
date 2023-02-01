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
    //inloggen button
    @FindBy (className = "icon-button_root__3mAIE icon-button_hasContent__33eNC navigation-header_userButton__W0ZIP")
    public  WebElement logInBtn;
}
