package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    DialogContent dc = new DialogContent();
    @When("Input login username as {string} password as {string}")
    public void inputLoginUsernameAsPasswordAs(String username, String password) {

        dc.findAndSend("username1",username);
        dc.findAndSend("password1",password);
        dc.findAndClick("loginBtn");

    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("accounts","Accounts");
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        dc.findAndContainsText("errorMessage","error");
    }
}
