package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class SignInPage {

    private static final By SELECTOR_SIGN_BUTTON = By.cssSelector(".login");
    private static final By SELECTOR_EMAIL_FIELD = By.cssSelector("#email");
    private static final By SELECTOR_PASSWORD_FIELD = By.cssSelector("#passwd");
    private static final By SELECTOR_SUBMIT_BUTTON = By.cssSelector("#SubmitLogin");
    private static final By SELECTOR_ACCOUNT_INTO = By.cssSelector(".info-account");

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
}
