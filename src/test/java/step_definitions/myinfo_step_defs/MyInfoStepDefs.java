package step_definitions.myinfo_step_defs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.MyInfoPage;
import utils.Driver;
import utils.WaitUtils;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MyInfoStepDefs {

    @And("User enters values to corresponding fields on personal details")
    public void uerEnterValuesToCorrespondingFields(DataTable dataTable) {

        Driver.getDriver().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        //[{First Name=John, Middle Name=Harry, Last Name=Doe, Nickname=JD}]
        List<Map<String, String>> data = dataTable.asMaps();
        System.out.println(data);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.elementToBeClickable(new MyInfoPage().firstNameInputBox));

        new MyInfoPage().firstNameInputBox.click();
        new MyInfoPage().firstNameInputBox.sendKeys(Keys.chord(Keys.CONTROL + "a"));
        new MyInfoPage().firstNameInputBox.sendKeys(data.get(0).get("First Name"));

        new MyInfoPage().middleNameInputBox.click();
        new MyInfoPage().middleNameInputBox.sendKeys(Keys.chord(Keys.CONTROL + "a"));
        new MyInfoPage().middleNameInputBox.sendKeys(data.get(0).get("Middle Name"));

        new MyInfoPage().lastNameInputBox.click();
        new MyInfoPage().lastNameInputBox.sendKeys(Keys.chord(Keys.CONTROL + "a"));
        new MyInfoPage().lastNameInputBox.sendKeys(data.get(0).get("Last Name"));

        Actions actions = new Actions(Driver.getDriver());
        actions.click(new MyInfoPage().nickNameInputBox).perform();
        actions.doubleClick(new MyInfoPage().nickNameInputBox).perform();
        actions.sendKeys(Keys.BACK_SPACE).perform();
        actions.sendKeys(data.get(0).get("Nickname")).perform();
        new MyInfoPage().personalDetailsSave.click();
        Driver.getDriver().navigate().refresh();

        Assert.assertTrue(new MyInfoPage().profileName(data.get(0).get("First Name"),data.get(0).get("Last Name")).isDisplayed());

    }
}
