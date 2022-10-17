package com.stv.factory.factorypages;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailInput extends FactoryPage {

    @FindBy(xpath = "//input[@class='bem-forms__form-control js-username']")
    private WebElement emailInput;

    @FindBy(xpath = "//span[@id='LogOnModel_UserName-error']")
    private WebElement emailInputHelperText;

    @FindBy(xpath = "//div[@class='col-sm-6 bem-checkout__returning-customer']")
    private WebElement signInDiv;

    public String type(String text) {
        emailInput.sendKeys(text);
        return emailInput.getAttribute("value");
    }

    public boolean isHelperTextDisplayed() throws WebDriverException {
        try {
            return emailInputHelperText.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickNearby() {
        signInDiv.click();
    }

    public void clear() {
        emailInput.clear();
    }
}
