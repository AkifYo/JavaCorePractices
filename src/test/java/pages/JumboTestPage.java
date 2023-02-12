package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JumboTestPage {
    public JumboTestPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id ="onetrust-reject-all-handler" )
    public WebElement cookiBtn;
}
