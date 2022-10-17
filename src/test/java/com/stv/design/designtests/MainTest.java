package com.stv.design.designtests;

import com.stv.factory.factorypages.EmailInput;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest extends BasicTest {
    private final String text = "checking!@#$%^&&*()";
    private final String correctEmailAddress = "email@email.com";

    /*@Test(description = "Assert the main page is loaded and the main logo is visible")
    public void assertWiggleIconIsDisplayed() {
        Assert.assertEquals(new MainPage().isMainLogoDisplayed(), true, "The main page isn't loaded properly");
    }*/

    @Test(description = "Assert in the email input types correct characters")
    public void assertWiggleEmailInputTypeable() {
        Assert.assertEquals(new EmailInput().type(text), text);
    }

    @Test(description = "Assert in the email input helper text will disappear, when emil address is valid")
    public void assertWiggleEmailInputHelperTextIsNotDisplayed() {
        EmailInput emailInput = new EmailInput();
        emailInput.clear();
        emailInput.type(correctEmailAddress);
        emailInput.clickNearby();
        Assert.assertFalse(emailInput.isHelperTextDisplayed());
    }

    @Test(description = "Assert in the email input helper text will appear, when emil address is invalid")
    public void assertWiggleEmailInputHelperTextIsDisplayed() {
        EmailInput emailInput = new EmailInput();
        emailInput.type(text);
        emailInput.clickNearby();
        Assert.assertTrue(emailInput.isHelperTextDisplayed());
    }
}
