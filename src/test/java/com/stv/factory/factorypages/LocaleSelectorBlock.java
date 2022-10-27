package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LocaleSelectorBlock extends MainFactoryPage {
    @FindBy(xpath = "//select[@id='langId']")
    private WebElement regionAndLanguageSelect;
    @FindBy(xpath = "//select[@id='currencyId']")
    private WebElement currencySelect;
    @FindBy(xpath = "//select[@id='countryId']")
    private WebElement deliveryDestinationSelect;
    @FindBy(xpath = "//button[@class='bem-language-selector__button']")
    private WebElement updateButton;

    public void selectRegionAndLanguage(String regionAndLanguage) {
        regionAndLanguageSelect.isDisplayed();
        Select select = new Select(regionAndLanguageSelect);
        select.selectByVisibleText(regionAndLanguage);
    }

    public void selectCurrency(String currency) {
        currencySelect.isDisplayed();
        Select select = new Select(currencySelect);
        select.selectByVisibleText(currency);
    }

    public void selectDeliveryDestination(String deliveryDestination) {
        deliveryDestinationSelect.isDisplayed();
        Select select = new Select(deliveryDestinationSelect);
        select.selectByVisibleText(deliveryDestination);
    }

    public void clickUpdateButton() {
        updateButton.isDisplayed();
        updateButton.click();
    }
}
