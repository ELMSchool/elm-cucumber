package step_definitions.login_step_defs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginStepDefs {

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //    @When("User enters valid credentials")
//    public void user_enters_valid_credentials() {
//        new LoginPage().usernameInputBox.sendKeys(ConfigReader.getPropertyValue("username"));
//        new LoginPage().passwordInputBox.sendKeys(ConfigReader.getPropertyValue("password"));
//    }
    @When("Clicks on login")
    public void clicks_on_login_button() {
        new LoginPage().loginButton.click();
    }

    @Then("User should see the dashboard page")
    public void user_should_see_the_dashboard_page() {
        Assert.assertTrue(new DashboardPage().dashboardPageHeader.isDisplayed());
    }

    @And("User closes the driver")
    public void userClosesTheDriver() {
        Driver.closeDriver();
    }

//    @When("User enters invalid credentials")
//    public void userEntersInvalidCredentials() {
//        new LoginPage().usernameInputBox.sendKeys("invalid");
//        new LoginPage().passwordInputBox.sendKeys("invalid");
//    }

    @Then("User should see the error message")
    public void userShouldSeeTheErrorMessage() {
        String actualErrorMessage = new LoginPage().loginErrorMessage.getText();
        String expectedErrorMessage = "Invalid credentials";

        Assert.assertEquals("FAILED", expectedErrorMessage, actualErrorMessage);
    }


    @When("User enters valid credentials")
    public void userEntersValidCredentials() {

        new LoginPage().usernameInputBox.sendKeys(ConfigReader.getPropertyValue("username"));
        new LoginPage().passwordInputBox.sendKeys(ConfigReader.getPropertyValue("password"));
    }

    @When("User enters invalid credentials")
    public void userEntersInvalidCredentials() {

        new LoginPage().usernameInputBox.sendKeys("invalid");
        new LoginPage().passwordInputBox.sendKeys("invalid");
    }

    @When("User enters {string} and {string} as credentials")
    public void userEntersAndAsCredentials(String username, String password) {

        new LoginPage().usernameInputBox.sendKeys(username);
        new LoginPage().passwordInputBox.sendKeys(password);
    }


}
