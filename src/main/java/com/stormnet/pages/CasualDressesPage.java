package com.stormnet.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class CasualDressesPage {

    private static final SelenideElement SELECTOR_PRINTED_DRESS = Selenide.$("ul.product_list.grid > li.first-in-line");
    private static final SelenideElement SELECTOR_ADD_TO_CARD_BUTTON =
            Selenide.$(".button.ajax_add_to_cart_button.btn.btn-default");
    private static final SelenideElement SELECTOR_PROCEED_TO_CHECKOUT_BUTTON = Selenide.$(
            "a.btn.btn-default.button.button-medium");
    private static final SelenideElement SELECTOR_SUMMARY_PROCEED_TO_CHECKOUT_BUTTON =
            Selenide.$(".button.btn.btn-default.standard-checkout.button-medium");
    private static final SelenideElement SELECTOR_ADDRESS_PROCEED_TO_CHECKOUT_BUTTON =
            Selenide.$("button.button.btn.btn-default.button-medium");
    private static final SelenideElement SELECTOR_AGREE_CHECKBOX = Selenide.$("#cgv");
    private static final SelenideElement SELECTOR_SHIPPING_PROCEED_TO_CHECKOUT_BUTTON =
            Selenide.$("button[name='processCarrier']");
    private static final SelenideElement SELECTOR_BANK_WIRE_BUTTON = Selenide.$(".bankwire");
    private static final SelenideElement SELECTOR_CONFIRM_BUTTON = Selenide.$(
            "button.button.btn.btn-default.button-medium");

    public void addToCardProductAndConfirmOrder() {
        SELECTOR_PRINTED_DRESS.hover();
        SELECTOR_ADD_TO_CARD_BUTTON.click();
        SELECTOR_PROCEED_TO_CHECKOUT_BUTTON.click();
        SELECTOR_SUMMARY_PROCEED_TO_CHECKOUT_BUTTON.click();
        SELECTOR_ADDRESS_PROCEED_TO_CHECKOUT_BUTTON.click();
        SELECTOR_AGREE_CHECKBOX.click();
        SELECTOR_SHIPPING_PROCEED_TO_CHECKOUT_BUTTON.click();
        SELECTOR_BANK_WIRE_BUTTON.click();
        SELECTOR_CONFIRM_BUTTON.click();
    }
}
