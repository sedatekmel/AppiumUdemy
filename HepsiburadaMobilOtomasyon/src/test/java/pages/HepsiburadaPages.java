package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class HepsiburadaPages {
    //Elemanlar gelecek
    By myAccountSymbol = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/nav_graph_account_menu\")");
    By signInButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Giriş yap\")");
    By signInButtonInLoginPage = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"loginButton\")");
    By emailBoxInLoginPage = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"emailInput\")");
    By passwordBoxInLoginPage = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"passwordInput\")");
    By editTextInLoginPage = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\")");
    By errorMessageAboutEmailAddress = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Geçerli bir e-posta adresi girmelisin.\")");
    By errorMessageAboutPhoneNumber = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Geçerli bir telefon numarası girmelisin.\")");
    By signInWithPhoneButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"loginWithPhoneButton\")");
    By editPhoneInLoginPage = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"countryPicker\")");
    By errorMessageAboutLoginPage=MobileBy.AndroidUIAutomator("new UiSelector().text(\"E-posta adresi veya şifre hatalı.\")");

    AppiumDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    //driver çağrıldı.
    public HepsiburadaPages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickToDontAllow() {
        //Not found on UI
    }

    public void clickToMyAccountSymbol() {
        driver.findElement(myAccountSymbol).click();
    }

    public void clickToSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void checkingSignInButtonIsAvailable() {

        elementHelper.checkVisible(signInButtonInLoginPage);
    }

    public void checkingEMailBoxIsAvailable() {
        elementHelper.checkVisible(emailBoxInLoginPage);
    }

    public void checkingPasswordBoxIsAvailable() {
        elementHelper.checkVisible(passwordBoxInLoginPage);
    }

    public void writingOfWrongEmail() {
        driver.findElement(emailBoxInLoginPage).click();
        List<WebElement> ListOfElement = driver.findElements(editTextInLoginPage);
        MobileElement emailField = (MobileElement) ListOfElement.get(0); //WebElement emailField = listOfElements.get(0); şeklinde de olabilir. WebElement seleniumdan yararlanmaktır.
        emailField.sendKeys("abcdehotmailcom");

    }

    public void writingOfWrongPassword() {
        driver.findElement(passwordBoxInLoginPage).click();
        List<WebElement> ListOfElement = driver.findElements(editTextInLoginPage);
        MobileElement passwordField = (MobileElement) ListOfElement.get(1);
        passwordField.sendKeys("1234567");
    }

    public void checkingErrorMessageAboutEmail(String errorMessageEmail) {
        //elementHelper.checkVisible(errorMessageAboutEmailAddress);
        WebElement errorElement=driver.findElement(errorMessageAboutEmailAddress);
        if(errorElement.isDisplayed()) {
            String actualErrorMessageEmail=errorElement.getText();
            if(actualErrorMessageEmail.equals(errorMessageEmail)) {
                System.out.println("E-mail address error message is true :" + actualErrorMessageEmail);
            } else {
                throw new AssertionError("E-mail address error message is wrong! Expected: "+errorMessageEmail);
            }
        }else{
            throw new AssertionError("E-mail address error message is not displayed!");
        }
    }

    public void clickToSignInWithPhoneNumber() {
        driver.findElement(signInWithPhoneButton).click();
    }

    public void writingOfWrongPhoneNumber() {
        driver.findElement(editPhoneInLoginPage).click();
        elementHelper.sendKeys(editPhoneInLoginPage, "545450");
    }

    public void clickToSignInButtonInLoginPage() {
        driver.findElement(signInButtonInLoginPage).click();
    }

    public void checkingErrorMessageAboutPhoneNumber(String errorMessagePhone) {
        WebElement errorElement = driver.findElement(errorMessageAboutPhoneNumber);
        if (errorElement.isDisplayed()) {
            String actualErrorMessagePhone = errorElement.getText();
            if (actualErrorMessagePhone.equals(errorMessagePhone)) {
                System.out.println("Phone number error message is true :" + actualErrorMessagePhone);
            } else {
                throw new AssertionError("Phone number error message is wrong! Expected : " + errorMessagePhone);
            }
        } else {
            throw new AssertionError("Phone number error message is not displayed!");
        }
    }

    public void writingCorrectEmailAddress() {
        driver.findElement(emailBoxInLoginPage).click();
        List<WebElement> ListOfElement = driver.findElements(editTextInLoginPage);
        MobileElement emailField = (MobileElement) ListOfElement.get(0); //WebElement emailField = listOfElements.get(0); şeklinde de olabilir. WebElement seleniumdan yararlanmaktır.
        emailField.sendKeys("sedatekmel1@gmail.com");
    }

    public void checkErrorMessageUsernameOrPassword(String errorMessageUsernameOrPassword) {
            MobileElement errorElement= (MobileElement) driver.findElement(errorMessageAboutLoginPage);
            if(errorElement.isDisplayed()){
                String actualErrorMessage=errorElement.getText();
                if(actualErrorMessage.equals(errorMessageUsernameOrPassword)){
                    System.out.println("Username or password error message is true! Actual : "+actualErrorMessage);
                }
                else {
                    throw new AssertionError("Username or password error message is wrong! Expected: "+errorMessageUsernameOrPassword);
                }
            }
            else{throw new AssertionError("Username or password error message is not displayed");}




    }
}



