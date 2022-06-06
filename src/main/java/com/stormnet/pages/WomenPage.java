package com.stormnet.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class WomenPage {

    private static final SelenideElement SELECTOR_WOMEN_BUTTON = Selenide.$("a[title='Women']");
    private static final SelenideElement SELECTOR_BLOUSES_BUTTON = Selenide.$("a[title='Blouses']");
    private static final SelenideElement SELECTOR_BLOUSES_IMAGE = Selenide.$("img[title='Blouse']");
    private static final SelenideElement SELECTOR_MORE_BUTTON = Selenide.$("a[title='View']");
    private static final SelenideElement SELECTOR_WISHLIST_BUTTON = Selenide.$("#wishlist_button");
    private static final SelenideElement SELECTOR_CLOSE_WISHLIST_MODAL_WINDOW = Selenide.$("a[title='Close']");

    public void clickWomen() {
        SELECTOR_WOMEN_BUTTON.hover();
        SELECTOR_BLOUSES_BUTTON.click();
    }

    public void clickMoreButton() {
        SELECTOR_BLOUSES_IMAGE.hover();
        SELECTOR_MORE_BUTTON.click();
    }

    public void clickWishListButton() {
        SELECTOR_WISHLIST_BUTTON.click();
        SELECTOR_CLOSE_WISHLIST_MODAL_WINDOW.click();
    }
}
