package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.RandomStringUtils;

public class SignInPage {

    private static final SelenideElement SELECTOR_SIGN_BUTTON = Selenide.$(".login");
    private static final SelenideElement SELECTOR_EMAIL_FIELD = Selenide.$("#email");
    private static final SelenideElement SELECTOR_PASSWORD_FIELD = Selenide.$("#passwd");
    private static final SelenideElement SELECTOR_SUBMIT_BUTTON = Selenide.$("#SubmitLogin");
    private static final SelenideElement SELECTOR_ACCOUNT_INTO = Selenide.$(".info-account");
    private static final SelenideElement SELECTOR_CREATE_ACCOUNT_FIELD = Selenide.$("#email_create");
    private static final SelenideElement SELECTOR_CREATE_ACCOUNT_BUTTON = Selenide.$("#SubmitCreate");
    private static final SelenideElement SELECTOR_MR_GENDER_RADIO_BUTTON = Selenide.$("#id_gender1");
    private static final SelenideElement SELECTOR_FIRST_NAME_FIELD = Selenide.$("#customer_firstname");
    private static final SelenideElement SELECTOR_LAST_NAME_FIELD = Selenide.$("#customer_lastname");
    private static final SelenideElement SELECTOR_BIRTH_DAYS_FIELD = Selenide.$("#days");
    private static final SelenideElement SELECTOR_BIRTH_MONTHS_FIELD = Selenide.$("#months");
    private static final SelenideElement SELECTOR_BIRTH_YEARS_FIELD = Selenide.$("#years");
    private static final SelenideElement SELECTOR_NEWSLETTER_CHECKBOX = Selenide.$("#newsletter");
    private static final SelenideElement SELECTOR_OFFERS_CHECKBOX = Selenide.$("#optin");
    private static final SelenideElement SELECTOR_COMPANY_FIELD = Selenide.$("#company");
    private static final SelenideElement SELECTOR_ADDRESS_FIELD = Selenide.$("#address1");
    private static final SelenideElement SELECTOR_CITY_FIELD = Selenide.$("#city");
    private static final SelenideElement SELECTOR_STATE_DROPDOWN = Selenide.$("#id_state");
    private static final SelenideElement SELECTOR_POSTCODE_FIELD = Selenide.$("#postcode");
    private static final SelenideElement SELECTOR_OTHER_FIELD = Selenide.$("#other");
    private static final SelenideElement SELECTOR_HOME_PHONE_FIELD = Selenide.$("#phone");
    private static final SelenideElement SELECTOR_MOBILE_PHONE_FIELD = Selenide.$("#phone_mobile");
    private static final SelenideElement SELECTOR_ALIAS_FIELD = Selenide.$("#alias");
    private static final SelenideElement SELECTOR_REGISTER_BUTTON = Selenide.$("#submitAccount");

    public void clickSignInButton() {
        SELECTOR_SIGN_BUTTON.click();
    }

    public void signIn(String email, String password) {
        SELECTOR_EMAIL_FIELD.sendKeys(email);
        SELECTOR_PASSWORD_FIELD.sendKeys(password);
        SELECTOR_SUBMIT_BUTTON.click();
        SELECTOR_ACCOUNT_INTO.shouldHave(Condition.text(
                "Welcome to your account. Here you can manage all of your personal information and orders."));
    }

    public void createAccount() {
        SELECTOR_CREATE_ACCOUNT_FIELD.setValue(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
        SELECTOR_CREATE_ACCOUNT_BUTTON.click();
    }

    public void fillYourPersonalInfo() {
        SELECTOR_MR_GENDER_RADIO_BUTTON.click();
        SELECTOR_FIRST_NAME_FIELD.setValue("Ivan");
        SELECTOR_LAST_NAME_FIELD.setValue("Ivanov");
        SELECTOR_PASSWORD_FIELD.setValue("12345");
        SELECTOR_BIRTH_DAYS_FIELD.setValue("1");
        SELECTOR_BIRTH_MONTHS_FIELD.setValue("1");
        SELECTOR_BIRTH_YEARS_FIELD.setValue("2020");
        SELECTOR_NEWSLETTER_CHECKBOX.click();
        SELECTOR_OFFERS_CHECKBOX.click();
        SELECTOR_COMPANY_FIELD.setValue("Kaseya");
        SELECTOR_ADDRESS_FIELD.setValue("701 Brickell Avenue");
        SELECTOR_CITY_FIELD.setValue("Miami");
        SELECTOR_STATE_DROPDOWN.setValue("9");
        SELECTOR_POSTCODE_FIELD.setValue("33131");
        SELECTOR_OTHER_FIELD.setValue("Additional information");
        SELECTOR_HOME_PHONE_FIELD.setValue("+375292929297");
        SELECTOR_MOBILE_PHONE_FIELD.setValue("+375333333333");
        SELECTOR_ALIAS_FIELD.setValue("18, Baker street");
        SELECTOR_REGISTER_BUTTON.click();
    }
}
