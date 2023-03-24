package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage extends Navigation{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "username")
    public WebElement usernameInputBox;

    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[.='Invalid credentials']")
    public WebElement loginErrorMessage;
}
