package com.stv.bdd.steps;

import com.stv.factory.factorypages.CartContainer;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartContainerSteps extends BasicFactoryTest {
    private CartContainer cartContainer = new CartContainer();

    @When("click cart")
    public void clickFlag() {
        cartContainer.click();
    }

    @Then("check that cart has opened")
    public void checkThatCartHasOpened() {
        getDriver().getCurrentUrl().contains("basket");
    }

    @And("cart is empty")
    public void cartIsEmpty() {
        cartContainer.cartIsEmpty();
    }
}
