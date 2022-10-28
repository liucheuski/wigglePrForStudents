package com.stv.bdd.steps;

import com.stv.factory.factorypages.CartContainerPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartContainerPageSteps extends BasicFactoryTest {
    private CartContainerPage cartContainerPage = new CartContainerPage();

    @When("click cart")
    public void clickFlag() {
        cartContainerPage.click();
    }

    @Then("check that cart has opened")
    public void checkThatCartHasOpened() {
        getDriver().getCurrentUrl().contains("basket");
    }

    @And("cart is empty")
    public void cartIsEmpty() {
        cartContainerPage.cartIsEmpty();
    }
}
