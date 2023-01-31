package pages;

import org.openqa.selenium.support.PageFactory;

public class AlbertHeijnHomePage {
    public AlbertHeijnHomePage() {
        PageFactory.initElements(Driver.getDriver,this);
    }
}
