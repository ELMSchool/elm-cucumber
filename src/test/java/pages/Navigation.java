package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public abstract class Navigation {

    public Navigation(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='oxd-main-menu']//span")
    public List<WebElement> menuOptionElementsList;

    public WebElement getMenuOptionElement(String menuOption){

        String xpath = "//span[.='"+ menuOption+"']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement profileName(String firstName, String lastName){

        return Driver.getDriver().findElement(By.xpath("//p[text()='"+firstName+" "+lastName+"']"));
    }
}
