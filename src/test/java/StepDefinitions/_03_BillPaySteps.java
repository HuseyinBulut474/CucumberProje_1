package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaySteps {

    DialogContent dc = new DialogContent();
    @Given("Click to Bill Pay")
    public void clickToBillPay() {
        dc.findAndClick("billBtn");
    }
    @When("Input bill payeename as {string} address as {string} city as {string} state as {string} zipcode as {string} phone as {string} account as {string} verify account as {string} amount as {string}")
    public void inputBillPayeenameAsAddressAsCityAsStateAsZipcodeAsPhoneAsAccountAsVerifyAccountAsAmountAs(String payeename, String street, String city, String state , String zipcode, String phone,String account,String verifyAccount,String amount) {

        dc.findAndSend("payee",payeename);
        dc.findAndSend("street",street);
        dc.findAndSend("city1",city);
        dc.findAndSend("state1",state);
        dc.findAndSend("zipcode1",zipcode);
        dc.findAndSend("phonenumber1",phone);
        dc.findAndSend("accNumber",account);
        dc.findAndSend("account1",verifyAccount);
        dc.findAndSend("amount",amount);
        dc.findAndClick("paymentBtn");
    }
    @Then("paid message should be displayed")
    public void paidMessageShouldBeDisplayed() {
        dc.findAndContainsText("paymentComplete","Bill Payment Complete");
    }
}
