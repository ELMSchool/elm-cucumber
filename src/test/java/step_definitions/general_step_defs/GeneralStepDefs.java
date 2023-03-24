package step_definitions.general_step_defs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneralStepDefs {

    @And("User should see all menu options")
    public void userShouldSeeAllMenuOptions(List<String> expectedMenuOptionsTexts) {

        //List<String> expectedMenuOptionsTexts = dataTable.asList();
        List<String> actualMenuOptionsTexts = new ArrayList<>();

        for (WebElement menuOptionElement : new DashboardPage().menuOptionElementsList) {

            actualMenuOptionsTexts.add(menuOptionElement.getText());
        }
        System.out.println("Expected => " + expectedMenuOptionsTexts);
        System.out.println("Actual => " + actualMenuOptionsTexts);
        Assert.assertEquals(expectedMenuOptionsTexts, actualMenuOptionsTexts);
    }

    @And("Clicks on {string}")
    public void clicksOn(String itemName) {
        switch (itemName) {

            case "login":
                new LoginPage().loginButton.click();
                break;
            case "My Info":
                new DashboardPage().getMenuOptionElement(itemName).click();
                break;
        }
    }



}
