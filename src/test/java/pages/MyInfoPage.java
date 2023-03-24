package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class MyInfoPage extends Navigation {

    public MyInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "firstName")
    public WebElement firstNameInputBox;

    @FindBy(name = "lastName")
    public WebElement lastNameInputBox;

    @FindBy(name = "middleName")
    public WebElement middleNameInputBox;

    @FindBy(xpath = "//label[.='Nickname']/../following-sibling::div")
    public WebElement nickNameInputBox;

    @FindBy(css = "button[type='submit']")
    public WebElement personalDetailsSave;
}
