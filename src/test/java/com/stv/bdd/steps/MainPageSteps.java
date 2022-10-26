package com.stv.bdd.steps;

import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MainPageSteps extends BasicFactoryTest {
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
}
