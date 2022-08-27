package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class _01_RegisterSteps {
    DialogContent dc =new DialogContent();


    @Given("Navigate to ParaBank")
    public void navigateToParaBank(){

        GWD.getDriver().get("https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();

    }
    @When("Input register data")
    public void InputRegisterData() {

        dc.findAndClick("register");
        dc.findAndSend("firstName","techno");
        dc.findAndSend("lastName","study");
        dc.findAndSend("address","Java");
        dc.findAndSend("city","Selenium");
        dc.findAndSend("state","Maven");
        dc.findAndSend("zipCode","12345");
        dc.findAndSend("ssn","111111111");
        dc.findAndSend ("username","grup2245");
        dc.findAndSend ("password","123456");
        dc.findAndSend ("confirm","123456");
        dc.findAndClick("registerButton");
    }
    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        dc.findAndContainsText("successMessage","success");
    }
}
