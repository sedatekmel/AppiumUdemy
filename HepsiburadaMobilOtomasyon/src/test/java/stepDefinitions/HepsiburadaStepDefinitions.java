package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HepsiburadaPages;
import util.DriverFactory;

public class HepsiburadaStepDefinitions
{
    HepsiburadaPages hepsiburadaPages=new HepsiburadaPages(DriverFactory.getDriver());

    @When("Click to Don't Allow Button")
    public void clickToDonTAllowButton() {
        hepsiburadaPages.clickToDontAllow();
    }

    @When("Click to MyAccount Symbol")
    public void clickToMyAccountSymbol() {
        hepsiburadaPages.clickToMyAccountSymbol();
    }

    @When("Click to SignIn Button")
    public void clickToSignInButton() {
        hepsiburadaPages.clickToSignInButton();
    }

    @Then("Check to SignIn Button is Available in Login Page")
    public void checkToSignInButtonIsAvailableInLoginPage() {
        hepsiburadaPages.checkingSignInButtonIsAvailable();
    }

    @Then("Check E-Mail Box is Available in Login Page")
    public void checkEMailBoxIsAvailableInLoginPage() {
        hepsiburadaPages.checkingEMailBoxIsAvailable();
    }

    @Then("Check Password Box is Available in Login Page")
    public void checkPasswordBoxIsAvailableInLoginPage() {
        hepsiburadaPages.checkingPasswordBoxIsAvailable();
    }

    @When("Write Wrong Email Address")
    public void writeWrongEmailAddress() {
        hepsiburadaPages.writingOfWrongEmail();
    }
    @When("Write Password")
    public void writePassword() {
        hepsiburadaPages.writingOfWrongPassword();
    }

    @Then("Check to {string} Message About E-mail")
    public void checkToMessageAboutEMail(String errorMessageEmail) {
            hepsiburadaPages.checkingErrorMessageAboutEmail(errorMessageEmail);
        }

    @When("Click to SignInWithPhoneNumber Button")
    public void clickToSignInWithPhoneNumberButton() {
        hepsiburadaPages.clickToSignInWithPhoneNumber();
    }

    @When("Write Wrong Phone Number")
    public void writeWrongPhoneNumber() {
        hepsiburadaPages.writingOfWrongPhoneNumber();
    }

    @Then("Check to {string} Message About Phone Number")
    public void checkToMessageAboutPhoneNumber(String errorMessagePhone) {
        hepsiburadaPages.checkingErrorMessageAboutPhoneNumber(errorMessagePhone);
    }

    @When("Click to SignIn Button in Login Page")
    public void clickToSignInButtonInLoginPage() {
        hepsiburadaPages.clickToSignInButtonInLoginPage();
    }

    @When("Write Correct E-mail Address")
    public void writeCorrectEMailAddress() {
        hepsiburadaPages.writingCorrectEmailAddress();
    }

    @Then("Check to {string} Message About Login")
    public void checkToMessageAboutLogin(String errorMessageUsernameOrPassword) {
        hepsiburadaPages.checkErrorMessageUsernameOrPassword(errorMessageUsernameOrPassword);
    }
}
