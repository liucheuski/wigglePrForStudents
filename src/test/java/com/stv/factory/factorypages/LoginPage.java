package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    @FindBy(className = "bem-checkout__login-container")
    private WebElement loginContainer;

    @FindBy(xpath = "//input[@name='LogOnModel.UserName']")
    private WebElement emailAddressInput;

    @FindBy(xpath = "//span[@id='LogOnModel_UserName-error']")
    private WebElement emailAddressInputHelperText;
    @FindBy(xpath = "//div[@class='bem-checkout__container-block']")
    private WebElement signInContainer;

    public boolean isLoginContainerDisplayed() {
        return loginContainer.isDisplayed();
    }

    public String typeEmailAddress(String text) {
        emailAddressInput.sendKeys(text);
        return emailAddressInput.getAttribute("value");
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
