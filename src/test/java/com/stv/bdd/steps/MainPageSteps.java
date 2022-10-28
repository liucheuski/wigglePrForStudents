package com.stv.bdd.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPageSteps extends BasicFactoryTest {

    private MainFactoryPage mainPage = new MainFactoryPage();

    @Given("main page is opened")
    @Override
    public void setUp() {
        super.setUp();
    }

    @Then("close browser")
    @Override
    public void afterClass() throws Exception {
        super.afterClass();
    }

    @When("flag is displayed {string}")
    public void flagIsDisplayed(String flag) {
        mainPage.isFlagDisplayed(flag);
    }

    @Then("click flag")
    public void clickFlag() {
        mainPage.clickFlag();
    }

    @When("locale selector block is displayed")
    public void localeSelectorBlockIsDisplayed() {
        mainPage.isLocaleSelectorBlockDisplayed();
    }

    @Then("check that flag has changed {string}")
    public void checkThatFlagHasChanged(String flag) {
        mainPage.checkFlag(flag);
    }

    @And("check that currency has changed {string}")
    public void checkThatCurrencyHasChanged(String currencySymbol) {
        mainPage.checkCartCurrency(currencySymbol);
    }

    @Then("accept cookies")
    public void acceptCookies() {
        mainPage.clickOnTrustButton();
    }
}
