package com.stormnet.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class CasualDressesPage {

    private static final By SELECTOR_PRINTED_DRESS = By.cssSelector("ul.product_list.grid > li.first-in-line");
    private static final By SELECTOR_ADD_TO_CARD_BUTTON =
            By.cssSelector(".button.ajax_add_to_cart_button.btn.btn-default");
    private static final By SELECTOR_PROCEED_TO_CHECKOUT_BUTTON = By.cssSelector(
            "a.btn.btn-default.button.button-medium");
    private static final By SELECTOR_SUMMARY_PROCEED_TO_CHECKOUT_BUTTON =
            By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium");
    private static final By SELECTOR_ADDRESS_PROCEED_TO_CHECKOUT_BUTTON =
            By.cssSelector("button.button.btn.btn-default.button-medium");
    private static final By SELECTOR_AGREE_CHECKBOX = By.cssSelector("#cgv");
    private static final By SELECTOR_SHIPPING_PROCEED_TO_CHECKOUT_BUTTON =
            By.cssSelector("button[name='processCarrier']");
    private static final By SELECTOR_BANK_WIRE_BUTTON = By.cssSelector(".bankwire");
    private static final By SELECTOR_CONFIRM_BUTTON = By.cssSelector("button.button.btn.btn-default.button-medium");

    public void addToCardProductAndConfirmOrder() {
        Selenide.$(SELECTOR_PRINTED_DRESS).hover();
        Selenide.$(SELECTOR_ADD_TO_CARD_BUTTON).click();
        Selenide.$(SELECTOR_PROCEED_TO_CHECKOUT_BUTTON).click();
        Selenide.$(SELECTOR_SUMMARY_PROCEED_TO_CHECKOUT_BUTTON).click();
        Selenide.$(SELECTOR_ADDRESS_PROCEED_TO_CHECKOUT_BUTTON).click();
        Selenide.$(SELECTOR_AGREE_CHECKBOX).click();
        Selenide.$(SELECTOR_SHIPPING_PROCEED_TO_CHECKOUT_BUTTON).click();
        Selenide.$(SELECTOR_BANK_WIRE_BUTTON).click();
        Selenide.$(SELECTOR_CONFIRM_BUTTON).click();
    }
}
