package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class ContactUsPage {

    private static final By SELECTOR_CONTACT_US_BUTTON = By.cssSelector("#contact-link");
    private static final By SELECTOR_HEADER_CONTACT_US_PAGE = By.cssSelector(".page-heading.bottom-indent");
    private static final By SELECTOR_SUBJECT_HEADING = By.cssSelector("#id_contact");
    private static final By SELECTOR_ORDER_REFERENCE = By.name("id_order");
    private static final By SELECTOR_CHOOSE_ORDER = By.cssSelector("select[name='id_order'] option:nth-child(2)");
    private static final By SELECTOR_PRODUCT_FIELD = By.name("id_product");
    private static final By SELECTOR_CHOOSE_PRODUCT = By.cssSelector("select[name='id_product'] option:nth-child(2)");
    private static final By SELECTOR_MESSAGE_FIELD = By.cssSelector("#message");
    private static final By SELECTOR_SEND_BUTTON = By.cssSelector("#submitMessage");

    public void clickContactUsButton() {
        Selenide.$(SELECTOR_CONTACT_US_BUTTON).click();
        Selenide.$(SELECTOR_HEADER_CONTACT_US_PAGE).shouldHave(Condition.text("Customer service - Contact us"));
    }

    public void fillContactUsPage() {
        Selenide.$(SELECTOR_SUBJECT_HEADING).setValue("2");
        Selenide.$(SELECTOR_ORDER_REFERENCE).click();
        Selenide.$(SELECTOR_CHOOSE_ORDER).click();
        Selenide.$(SELECTOR_PRODUCT_FIELD).click();
        Selenide.$(SELECTOR_CHOOSE_PRODUCT).click();
        Selenide.$(SELECTOR_MESSAGE_FIELD).setValue("I have a problem with my order. Could you help me?");
    }

    public void clickSendButton() {
        Selenide.$(SELECTOR_SEND_BUTTON).click();
    }
}
