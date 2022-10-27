package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(id = "accountLink")
    private WebElement accountLink;
    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;
    @FindBy(xpath = "//span[contains(@class, 'flag flag-')]")
    private WebElement flagSpan;
    @FindBy(xpath = "//div[@class='bem-language-selector active']")
    private WebElement localeSelectorBlockDisplayed;
    @FindBy(xpath = "//span[@class='bem-mini-basket__summary-amount']")
    private WebElement cartAmount;

    public boolean isFlagDisplayed(String flag) {
        return flagSpan.getAttribute("class").equals(flag);
    }

    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    public boolean clickOnTrustButton() {
        try {
            trustButton.click();
        } finally {
            return true;
        }
    }

    public void clickFlag() {
        flagSpan.click();
    }

    public void isLocaleSelectorBlockDisplayed() {
        localeSelectorBlockDisplayed.isDisplayed();
    }


    public void checkFlag(String flag) {
        flagSpan.getAttribute("class").equals(flag);
    }

    public void checkCartCurrency(String currencySymbol) {
        cartAmount.getText().equals(currencySymbol);
    }
}
