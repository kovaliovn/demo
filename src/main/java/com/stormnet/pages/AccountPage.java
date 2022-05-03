package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class AccountPage {

    private static final By SELECTOR_DRESSES_BUTTON = By.cssSelector("a[title='Dresses']");
    private static final By SELECTOR_CASUAL_DRESSES_BUTTON = By.cssSelector("a[title='Casual Dresses']");
    private static final By SELECTOR_CATEGORY_NAME = By.cssSelector(".category-name");

    public void openCasualDresses() {
        Selenide.$$(SELECTOR_DRESSES_BUTTON).get(1).hover();
        Selenide.$$(SELECTOR_CASUAL_DRESSES_BUTTON).get(1).click();
        Selenide.$(SELECTOR_CATEGORY_NAME).shouldHave(Condition.text("Casual Dresses"));
    }
}
