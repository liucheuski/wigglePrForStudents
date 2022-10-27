package com.stv.bdd.steps;

import com.stv.factory.factorypages.LocaleSelectorBlock;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LocaleSelectorBlockSteps {
    private LocaleSelectorBlock localeSelectorBlock = new LocaleSelectorBlock();

    @Then("select regionAndLanguage {string}")
    public void selectRegionLanguage(String regionAndLanguage) {
        localeSelectorBlock.selectRegionAndLanguage(regionAndLanguage);
    }

    @And("select currency {string}")
    public void selectCurrency(String currency) {
        localeSelectorBlock.selectCurrency(currency);
    }

    @And("select delivery destination {string}")
    public void selectDeliveryDestination(String deliveryDestination) {
        localeSelectorBlock.selectDeliveryDestination(deliveryDestination);
    }

    @Then("click update")
    public void clickUpdate() {
        localeSelectorBlock.clickUpdateButton();
    }
}
