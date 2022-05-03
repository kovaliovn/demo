package com.stormnet.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class SummerDressPage {

    private static final By SELECTOR_PRINTED_SUMMER_DRESS = By.cssSelector("img[alt='Printed Summer Dress']");
    private static final By SELECTOR_MORE_BUTTON = By.cssSelector("a.button.lnk_view.btn.btn-default");
    private static final By SELECTOR_BLACK_COLOR_BUTTON = By.cssSelector("a[name='Black']");
    private static final By SELECTOR_ORANGE_COLOR_BUTTON = By.cssSelector("a[name='Orange']");
    private static final By SELECTOR_BLUE_COLOR_BUTTON = By.cssSelector("a[name='Blue']");
    private static final By SELECTOR_YELLOW_COLOR_BUTTON = By.cssSelector("a[name='Yellow']");

    public void clickMoreButton(int order) {
        Selenide.$$(SELECTOR_PRINTED_SUMMER_DRESS).get(order).hover();
        Selenide.$$(SELECTOR_MORE_BUTTON).get(0).click();
    }

    public void clickBlackColorButton() {
        Selenide.$(SELECTOR_BLACK_COLOR_BUTTON).click();
    }

    public void clickOrangeColorButton() {
        Selenide.$(SELECTOR_ORANGE_COLOR_BUTTON).click();
    }

    public void clickBlueColorButton() {
        Selenide.$(SELECTOR_BLUE_COLOR_BUTTON).doubleClick();
    }

    public void clickYellowColorButton() {
        Selenide.$(SELECTOR_YELLOW_COLOR_BUTTON).click();
    }
}
