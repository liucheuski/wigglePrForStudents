package com.stv.bdd.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BasicFactoryTest {
    LoginPage loginPage = new LoginPage();

    @When("click login link")
    public void clickLoginPage() {
        loginPage.isAccountLinkDisplayed();
        loginPage.clickOnTrustButton();
        loginPage.clickOnAccountLink();
    }

    @Then("login page is opened")
    public void isLoginPageOpened() {
        loginPage.isLoginContainerDisplayed();
    }

    @When("type email address {string}")
    public void typeEmailAddress(String email) {
        loginPage.typeEmailAddress(email);
    }

    @Then("characters types correct {string}")
    public void isLoginPageOpened(String email) {
        loginPage.typingIsCorrect(email);
    }

    @Then("clear email input")
    public void clearInput() {
        loginPage.emailAddressClear();
    }

    @Then("is helper text")
    public void isHelperText() {
        loginPage.isEmailAddressHelperTextDisplayed();
    }

    @When("click to login form")
    public void clickToLoginForm() {
        loginPage.onBlur();
    }
}
