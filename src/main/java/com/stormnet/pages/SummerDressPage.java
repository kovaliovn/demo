package com.stormnet.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class SummerDressPage {

    private static final SelenideElement SELECTOR_PRINTED_SUMMER_DRESS =
            Selenide.$$("img[alt='Printed Summer Dress']").get(0);
    private static final SelenideElement SELECTOR_MORE_BUTTON = Selenide.$$("a.button.lnk_view.btn.btn-default").get(0);
    private static final SelenideElement SELECTOR_BLACK_COLOR_BUTTON = Selenide.$("a[name='Black']");
    private static final SelenideElement SELECTOR_ORANGE_COLOR_BUTTON = Selenide.$("a[name='Orange']");
    private static final SelenideElement SELECTOR_BLUE_COLOR_BUTTON = Selenide.$("a[name='Blue']");
    private static final SelenideElement SELECTOR_YELLOW_COLOR_BUTTON = Selenide.$("a[name='Yellow']");

    public void clickMoreButton() {
        SELECTOR_PRINTED_SUMMER_DRESS.hover();
        SELECTOR_MORE_BUTTON.click();
    }

    public void clickBlackColorButton() {
        SELECTOR_BLACK_COLOR_BUTTON.click();
    }

    public void clickOrangeColorButton() {
        SELECTOR_ORANGE_COLOR_BUTTON.click();
    }

    public void clickBlueColorButton() {
        SELECTOR_BLUE_COLOR_BUTTON.doubleClick();
    }

    public void clickYellowColorButton() {
        SELECTOR_YELLOW_COLOR_BUTTON.click();
    }
}
