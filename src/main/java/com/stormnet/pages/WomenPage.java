package com.stormnet.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class WomenPage {

    private static final By SELECTOR_WOMEN_BUTTON = By.cssSelector("a[title='Women']");
    private static final By SELECTOR_BLOUSES_BUTTON = By.cssSelector("a[title='Blouses']");
    private static final By SELECTOR_BLOUSES_IMAGE = By.cssSelector("img[title='Blouse']");
    private static final By SELECTOR_MORE_BUTTON = By.cssSelector("a[title='View']");
    private static final By SELECTOR_WISHLIST_BUTTON = By.cssSelector("#wishlist_button");
    private static final By SELECTOR_CLOSE_WISHLIST_MODAL_WINDOW = By.cssSelector("a[title='Close']");

    public void clickWomen() {
        Selenide.$(SELECTOR_WOMEN_BUTTON).hover();
        Selenide.$(SELECTOR_BLOUSES_BUTTON).click();
    }

    public void clickMoreButton() {
        Selenide.$(SELECTOR_BLOUSES_IMAGE).hover();
        Selenide.$(SELECTOR_MORE_BUTTON).click();
    }

    public void clickWishListButton() {
        Selenide.$(SELECTOR_WISHLIST_BUTTON).click();
        Selenide.$(SELECTOR_CLOSE_WISHLIST_MODAL_WINDOW).click();
    }
}
