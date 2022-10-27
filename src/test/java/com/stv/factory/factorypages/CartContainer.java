package com.stv.factory.factorypages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartContainer extends MainFactoryPage {
    @FindBy(xpath = "//li[@id='basketContainer']")
    private WebElement cartContainer;
    @FindBy(xpath = "//div[@d='basket-product-list-container']")
    private WebElement cartList;

    public void click() {
        cartContainer.click();
    }

    public boolean cartIsEmpty() {
        try {
            cartList.isDisplayed();
        } catch (NoSuchElementException exception) {
            return true;
        }
        return false;
    }
}
