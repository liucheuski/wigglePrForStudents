package com.stv.bdd.steps;

import com.stv.factory.factorypages.LocaleSelectorBlockPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LocaleSelectoPageSteps {
    private LocaleSelectorBlockPage localeSelectorBlockPage = new LocaleSelectorBlockPage();

    @Then("select regionAndLanguage {string}")
    public void selectRegionLanguage(String regionAndLanguage) {
        localeSelectorBlockPage.selectRegionAndLanguage(regionAndLanguage);
    }

    @And("select currency {string}")
    public void selectCurrency(String currency) {
        localeSelectorBlockPage.selectCurrency(currency);
    }

    @And("select delivery destination {string}")
    public void selectDeliveryDestination(String deliveryDestination) {
        localeSelectorBlockPage.selectDeliveryDestination(deliveryDestination);
    }

    @Then("click update")
    public void clickUpdate() {
        localeSelectorBlockPage.clickUpdateButton();
    }
}
