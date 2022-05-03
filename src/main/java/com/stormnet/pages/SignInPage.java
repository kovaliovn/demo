package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class SignInPage {

    private static final By SELECTOR_SIGN_BUTTON = By.cssSelector(".login");
    private static final By SELECTOR_EMAIL_FIELD = By.cssSelector("#email");
    private static final By SELECTOR_PASSWORD_FIELD = By.cssSelector("#passwd");
    private static final By SELECTOR_SUBMIT_BUTTON = By.cssSelector("#SubmitLogin");
    private static final By SELECTOR_ACCOUNT_INTO = By.cssSelector(".info-account");
    private static final By SELECTOR_CREATE_ACCOUNT_FIELD = By.cssSelector("#email_create");
    private static final By SELECTOR_CREATE_ACCOUNT_BUTTON = By.cssSelector("#SubmitCreate");
    private static final By SELECTOR_MR_GENDER_RADIO_BUTTON = By.cssSelector("#id_gender1");
    private static final By SELECTOR_FIRST_NAME_FIELD = By.cssSelector("#customer_firstname");
    private static final By SELECTOR_LAST_NAME_FIELD = By.cssSelector("#customer_lastname");
    private static final By SELECTOR_BIRTH_DAYS_FIELD = By.cssSelector("#days");
    private static final By SELECTOR_BIRTH_MONTHS_FIELD = By.cssSelector("#months");
    private static final By SELECTOR_BIRTH_YEARS_FIELD = By.cssSelector("#years");
    private static final By SELECTOR_NEWSLETTER_CHECKBOX = By.cssSelector("#newsletter");
    private static final By SELECTOR_OFFERS_CHECKBOX = By.cssSelector("#optin");
    private static final By SELECTOR_COMPANY_FIELD = By.cssSelector("#company");
    private static final By SELECTOR_ADDRESS_FIELD = By.cssSelector("#address1");
    private static final By SELECTOR_CITY_FIELD = By.cssSelector("#city");
    private static final By SELECTOR_STATE_DROPDOWN = By.cssSelector("#id_state");
    private static final By SELECTOR_POSTCODE_FIELD = By.cssSelector("#postcode");
    private static final By SELECTOR_OTHER_FIELD = By.cssSelector("#other");
    private static final By SELECTOR_HOME_PHONE_FIELD = By.cssSelector("#phone");
    private static final By SELECTOR_MOBILE_PHONE_FIELD = By.cssSelector("#phone_mobile");
    private static final By SELECTOR_ALIAS_FIELD = By.cssSelector("#alias");
    private static final By SELECTOR_REGISTER_BUTTON = By.cssSelector("#submitAccount");

    public void clickSignInButton() {
        Selenide.$(SELECTOR_SIGN_BUTTON).click();
    }

    public void signIn(String email, String password) {
        Selenide.$(SELECTOR_EMAIL_FIELD).sendKeys(email);
        Selenide.$(SELECTOR_PASSWORD_FIELD).sendKeys(password);
        Selenide.$(SELECTOR_SUBMIT_BUTTON).click();
        Selenide.$(SELECTOR_ACCOUNT_INTO).shouldHave(Condition.text(
                "Welcome to your account. Here you can manage all of your personal information and orders."));
    }

    public void createAccount() {
        Selenide.$(SELECTOR_CREATE_ACCOUNT_FIELD).setValue(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
        Selenide.$(SELECTOR_CREATE_ACCOUNT_BUTTON).click();
    }

    public void fillYourPersonalInfo() {
        Selenide.$(SELECTOR_MR_GENDER_RADIO_BUTTON).click();
        Selenide.$(SELECTOR_FIRST_NAME_FIELD).setValue("Ivan");
        Selenide.$(SELECTOR_LAST_NAME_FIELD).setValue("Ivanov");
        Selenide.$(SELECTOR_PASSWORD_FIELD).setValue("12345");
        Selenide.$(SELECTOR_BIRTH_DAYS_FIELD).setValue("1");
        Selenide.$(SELECTOR_BIRTH_MONTHS_FIELD).setValue("1");
        Selenide.$(SELECTOR_BIRTH_YEARS_FIELD).setValue("2020");
        Selenide.$(SELECTOR_NEWSLETTER_CHECKBOX).click();
        Selenide.$(SELECTOR_OFFERS_CHECKBOX).click();
        Selenide.$(SELECTOR_COMPANY_FIELD).setValue("Kaseya");
        Selenide.$(SELECTOR_ADDRESS_FIELD).setValue("701 Brickell Avenue");
        Selenide.$(SELECTOR_CITY_FIELD).setValue("Miami");
        Selenide.$(SELECTOR_STATE_DROPDOWN).setValue("9");
        Selenide.$(SELECTOR_POSTCODE_FIELD).setValue("33131");
        Selenide.$(SELECTOR_OTHER_FIELD).setValue("Additional information");
        Selenide.$(SELECTOR_HOME_PHONE_FIELD).setValue("+375292929297");
        Selenide.$(SELECTOR_MOBILE_PHONE_FIELD).setValue("+375333333333");
        Selenide.$(SELECTOR_ALIAS_FIELD).setValue("18, Baker street");
        Selenide.$(SELECTOR_REGISTER_BUTTON).click();
    }
}
