package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainFactoryTest extends BasicFactoryTest {
    private final String incorrectEmailAddress = "checking!@#$%^&&*()";
    private final String correctEmailAddress = "email@email.com";
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test(description = "Assert the main page is loaded and account icon is visible",
            groups = "LoginPage")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Test(description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed",
            groups = "LoginPage")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(new LoginPage().isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }

    @Test(description = "Assert in the email input types characters", groups = "EmailAddress",
            dependsOnGroups = "LoginPage")
    public void assertEmailAddressLoginPageAcceptCharacters() {
        LoginPage loginPage = new LoginPage();
        loginPage.emailAddressClear();
        loginPage.typeEmailAddress(incorrectEmailAddress);
        Assert.assertTrue(loginPage.getTypedEmailAddress() != null);
    }

    @Test(description = "Assert in the email input types correct characters", groups = "EmailAddress",
            dependsOnGroups = "LoginPage")
    public void assertEmailAddressLoginPageAcceptCorrectCharacters() {
        LoginPage loginPage = new LoginPage();
        loginPage.emailAddressClear();
        loginPage.typeEmailAddress(incorrectEmailAddress);
        Assert.assertTrue(loginPage.typingIsCorrect(incorrectEmailAddress));
    }

    @Test(description = "Assert in the email input helper text will not appear, when email address is valid",
            groups = "EmailAddress", dependsOnGroups = "LoginPage")
    public void assertEmailAddressHelperTextWiggleLoginPageIsNotDisplayed() {
        LoginPage loginPage = new LoginPage();
        loginPage.emailAddressClear();
        loginPage.typeEmailAddress(correctEmailAddress);
        loginPage.onBlur();
        Assert.assertFalse(loginPage.isEmailAddressHelperTextDisplayed());
    }

    @Test(description = "Assert in the email input helper text will appear, when email address is invalid",
            groups = "EmailAddress", dependsOnGroups = "LoginPage")
    public void assertWiggleLoginPageHelperTextIsDisplayed() {
        LoginPage loginPage = new LoginPage();
        loginPage.typeEmailAddress(incorrectEmailAddress);
        loginPage.onBlur();
        Assert.assertTrue(loginPage.isEmailAddressHelperTextDisplayed());
    }

    @BeforeClass(description = "Start browser")
    @Override
    public void setUp() {
        super.setUp();
    }
}
