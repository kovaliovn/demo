package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ContactUsPage {

    private static final SelenideElement SELECTOR_CONTACT_US_BUTTON = Selenide.$("#contact-link");
    private static final SelenideElement SELECTOR_HEADER_CONTACT_US_PAGE = Selenide.$(".page-heading.bottom-indent");
    private static final SelenideElement SELECTOR_SUBJECT_HEADING = Selenide.$("#id_contact");
    private static final SelenideElement SELECTOR_ORDER_REFERENCE = Selenide.$(By.name("id_order"));
    private static final SelenideElement SELECTOR_CHOOSE_ORDER = Selenide.$("select[name='id_order'] option:nth-child(2)");
    private static final SelenideElement SELECTOR_PRODUCT_FIELD = Selenide.$(By.name("id_product"));
    private static final SelenideElement SELECTOR_CHOOSE_PRODUCT = Selenide.$("select[name='id_product'] option:nth-child(2)");
    private static final SelenideElement SELECTOR_MESSAGE_FIELD = Selenide.$("#message");
    private static final SelenideElement SELECTOR_SEND_BUTTON = Selenide.$("#submitMessage");

    public void clickContactUsButton() {
        SELECTOR_CONTACT_US_BUTTON.click();
        SELECTOR_HEADER_CONTACT_US_PAGE.shouldHave(Condition.text("Customer service - Contact us"));
    }

    public void fillContactUsPage() {
        SELECTOR_SUBJECT_HEADING.setValue("2");
        SELECTOR_ORDER_REFERENCE.click();
        SELECTOR_CHOOSE_ORDER.click();
        SELECTOR_PRODUCT_FIELD.click();
        SELECTOR_CHOOSE_PRODUCT.click();
        SELECTOR_MESSAGE_FIELD.setValue("I have a problem with my order. Could you help me?");
    }

    public void clickSendButton() {
        SELECTOR_SEND_BUTTON.click();
    }
}
