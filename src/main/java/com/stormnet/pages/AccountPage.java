package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class AccountPage {

    private static final By SELECTOR_DRESSES_BUTTON = By.cssSelector("a[title='Dresses']");
    private static final By SELECTOR_CASUAL_DRESSES_BUTTON = By.cssSelector("a[title='Casual Dresses']");
    private static final By SELECTOR_SUMMER_DRESSES_BUTTON = By.cssSelector("a[title='Summer Dresses']");
    private static final By SELECTOR_CATEGORY_NAME = By.cssSelector(".category-name");
    private static final By SELECTOR_ACCOUNT_BUTTON = By.cssSelector(".account");
    private static final By SELECTOR_MY_WISHLIST_BUTTON = By.cssSelector("a[title='My wishlists']");
    private static final By SELECTOR_FIRST_WISHLIST_PRODUCT = By.cssSelector("td:nth-child(1) > a");
    private static final By SELECTOR_REMOVE_WISHLIST_PRODUCT = By.cssSelector("td a .icon-remove");

    public void openCasualDresses() {
        Selenide.$$(SELECTOR_DRESSES_BUTTON).get(1).hover();
        Selenide.$$(SELECTOR_CASUAL_DRESSES_BUTTON).get(1).click();
        Selenide.$(SELECTOR_CATEGORY_NAME).shouldHave(Condition.text("Casual Dresses"));
    }

    public void openSummerDresses() {
        Selenide.$$(SELECTOR_DRESSES_BUTTON).get(1).hover();
        Selenide.$$(SELECTOR_SUMMER_DRESSES_BUTTON).get(1).click();
        Selenide.$(SELECTOR_CATEGORY_NAME).shouldHave(Condition.text("Summer Dresses"));
    }

    public void clickAccountButton() {
        Selenide.$(SELECTOR_ACCOUNT_BUTTON).click();
        Selenide.$(SELECTOR_MY_WISHLIST_BUTTON).click();
        Selenide.$(SELECTOR_FIRST_WISHLIST_PRODUCT).click();
    }

    public void removeWishList() {
        Selenide.$(SELECTOR_REMOVE_WISHLIST_PRODUCT).click();
    }
}
