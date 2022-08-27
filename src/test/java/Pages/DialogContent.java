package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements (GWD.getDriver(),this);
    }



    @FindBy(linkText= "Register")
    private WebElement registerBtn;

    @FindBy(id="customer.firstName")
    private WebElement firstname;

    @FindBy(id="customer.lastName")
    private WebElement lastname;

    @FindBy(id="customer.address.street")
    private WebElement adress;

    @FindBy(id="customer.address.city")
    private WebElement city;

    @FindBy(id="customer.address.state")
    private WebElement state;

    @FindBy(id="customer.address.zipCode")
    private WebElement zipCode;

    @FindBy(id="customer.ssn")
    private WebElement ssn;

    @FindBy(id = "customer.username")
    private WebElement username;

    @FindBy(id = "customer.password")
    private WebElement pass;

    @FindBy(id = "repeatedPassword")
    private WebElement repeat;

    @FindBy(css = "[value='Register']")
    private WebElement registerButton;

    @FindBy(xpath = "//p[contains(text(),'successfully')]")
    private WebElement successText;

    @FindBy(css = "[name='username']")
    private WebElement username1;

    @FindBy(css = "[name='password']")
    private WebElement password1;

    @FindBy(css = "[value='Log In']")
    private WebElement loginBtn;

    @FindBy(css = "[class='error']")
    private WebElement errorText;

    @FindBy(xpath = "//h1[contains(text(),'Accounts Overview')]")
    private WebElement accounts;

    @FindBy(linkText = "Bill Pay")
    private WebElement billBtn;

    @FindBy(name = "payee.name")
    private WebElement payee;

    @FindBy(name = "payee.address.street")
    private WebElement street;

    @FindBy(name="payee.address.city")
    private WebElement city1;

    @FindBy(name = "payee.address.state")
    private WebElement state1;

    @FindBy(name = "payee.address.zipCode")
    private WebElement zipcode1;

    @FindBy(name = "payee.phoneNumber")
    private WebElement phonenumber1;

    @FindBy(name = "payee.accountNumber")
    private WebElement accNumber;

    @FindBy(name = "verifyAccount")
    private WebElement account1;

    @FindBy(name = "amount")
    private WebElement amount;

    @FindBy(css = "[value='Send Payment']")
    private WebElement paymentBtn;

    @FindBy(xpath = "//h1[contains(text(),'Bill Payment Complete')]")
    private WebElement paymentComplete;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "firstName": myElement = firstname;break;
            case "lastName": myElement = lastname;break;
            case "address": myElement = adress;break;
            case "city": myElement = city;break;
            case "state": myElement = state;break;
            case "zipCode": myElement = zipCode;break;
            case "ssn": myElement = ssn;break;
            case "username": myElement = username;break;
            case "password": myElement = pass;break;
            case "confirm": myElement = repeat;break;
            case "username1" : myElement = username1;break;
            case "password1" : myElement = password1;break;
            case "payee" : myElement = payee;break;
            case "street" : myElement = street;break;
            case "city1" : myElement = city1;break;
            case "state1" : myElement = state1;break;
            case "zipcode1" : myElement = zipcode1;break;
            case "phonenumber1" : myElement = phonenumber1;break;
            case "accNumber" : myElement = accNumber;break;
            case "account1" : myElement = account1;break;
            case "amount" : myElement = amount;break;


        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "register": myElement = registerBtn;break;
            case "registerButton" : myElement =registerButton; break;
            case "loginBtn" : myElement = loginBtn;break;
            case "billBtn" : myElement = billBtn;break;
            case "paymentBtn" : myElement = paymentBtn;break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "successMessage" : myElement =successText; break;
            case "errorMessage" : myElement =errorText; break;
            case "accounts" : myElement =accounts; break;
            case "paymentComplete" : myElement =paymentComplete; break;
        }
        verifyContainsText(myElement, text);
    }
}