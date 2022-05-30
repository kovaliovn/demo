package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class AccountPage {

    private static final SelenideElement SELECTOR_DRESSES_BUTTON = Selenide.$$("a[title='Dresses']").get(1);
    private static final SelenideElement SELECTOR_CASUAL_DRESSES_BUTTON =
            Selenide.$$("a[title='Casual Dresses']").get(1);
    private static final SelenideElement SELECTOR_SUMMER_DRESSES_BUTTON =
            Selenide.$$("a[title='Summer Dresses']").get(1);
    private static final SelenideElement SELECTOR_CATEGORY_NAME = Selenide.$(".category-name");
    private static final SelenideElement SELECTOR_ACCOUNT_BUTTON = Selenide.$(".account");
    private static final SelenideElement SELECTOR_MY_WISHLIST_BUTTON = Selenide.$("a[title='My wishlists']");
    private static final SelenideElement SELECTOR_FIRST_WISHLIST_PRODUCT = Selenide.$("td:nth-child(1) > a");
    private static final SelenideElement SELECTOR_REMOVE_WISHLIST_PRODUCT = Selenide.$("td a .icon-remove");

    @Step("Open casual dresses page")
    public void openCasualDresses() {
        SELECTOR_DRESSES_BUTTON.hover();
        SELECTOR_CASUAL_DRESSES_BUTTON.click();
        SELECTOR_CATEGORY_NAME.shouldHave(Condition.text("Casual Dresses"));
    }

    @Step("Open summer dresses page")
    public void openSummerDresses() {
        SELECTOR_DRESSES_BUTTON.hover();
        SELECTOR_SUMMER_DRESSES_BUTTON.click();
        SELECTOR_CATEGORY_NAME.shouldHave(Condition.text("Summer Dresses"));
    }

    @Step("Click on account button")
    public void clickAccountButton() {
        SELECTOR_ACCOUNT_BUTTON.click();
        SELECTOR_MY_WISHLIST_BUTTON.click();
        SELECTOR_FIRST_WISHLIST_PRODUCT.click();
    }

    public void removeWishList() {
        SELECTOR_REMOVE_WISHLIST_PRODUCT.click();
    }
}
