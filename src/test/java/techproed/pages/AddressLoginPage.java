package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AddressLoginPage {

    public AddressLoginPage(){
        //pagefactory is used to initialize the page object
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //locating username
    @FindBy(id="session_email")
    public WebElement  username;
    @FindBy(id="session_password")
    public WebElement  password;
    @FindBy(name="commit")
    public WebElement loginButton;
}
