package com.stv.factory.factorypages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MainFactoryPage {
    @FindBy(xpath = "//div[@class='bem-checkout__login-container']")
    private WebElement loginContainer;

    @FindBy(xpath = "//input[@name='LogOnModel.UserName']")
    private WebElement emailAddressInput;

    @FindBy(xpath = "//span[@id='LogOnModel_UserName-error']")
    private WebElement emailAddressInputHelperText;
    @FindBy(xpath = "//div[@class='bem-checkout__container-block']")
    private WebElement signInContainer;

    @Given("sign in form is opened")
    public boolean isLoginContainerDisplayed() {
        return loginContainer.isDisplayed();
    }

    public void typeEmailAddress(String text) {
        emailAddressInput.sendKeys(text);
    }

    public String getTypedEmailAddress() {
        return emailAddressInput.getAttribute("value");
    }

    public boolean typingIsCorrect(String text) {
        return getTypedEmailAddress().equals(text);
    }

    public boolean isEmailAddressHelperTextDisplayed() {
        try {
            return emailAddressInputHelperText.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void onBlur() {
        signInContainer.click();
    }

    public void emailAddressClear() {
        emailAddressInput.clear();
    }
}
