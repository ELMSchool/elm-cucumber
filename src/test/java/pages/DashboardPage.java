package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class DashboardPage extends Navigation {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h6[.='Dashboard']")
    public WebElement dashboardPageHeader;

}
