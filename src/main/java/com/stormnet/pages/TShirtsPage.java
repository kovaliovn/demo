package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class TShirtsPage {

    private static final SelenideElement SELECTOR_TSHIRTS_BUTTON = Selenide.$("li:nth-child(3) a[title='T-shirts']");
    private static final SelenideElement SELECTOR_TSHIRTS_NAME = Selenide.$(".category-name");
    private static final SelenideElement SELECTOR_FADED_TSHIRTS_PRODUCT =
            Selenide.$("ul.product_list.grid > li.first-in-line");
    private static final SelenideElement SELECTOR_MORE_BUTTON = Selenide.$(".button.lnk_view.btn.btn-default");
    private static final SelenideElement SELECTOR_WRITE_REVIEW_BUTTON = Selenide.$("li a[class='open-comment-form']");
    private static final SelenideElement SELECTOR_FIFTH_QUALITY_STAR = Selenide.$("a[title='5']");
    private static final SelenideElement SELECTOR_TITLE_FIELD = Selenide.$("#comment_title");
    private static final SelenideElement SELECTOR_COMMENT_FIELD = Selenide.$("#content");
    private static final SelenideElement SELECTOR_SEND_REVIEW_BUTTON = Selenide.$("#submitNewMessage");
    private static final SelenideElement SELECTOR_CONFIRM_REVIEW_BUTTON = Selenide.$(
            "div[class='fancybox-inner'] p.submit button[type='submit']");
    private static final SelenideElement SELECTOR_CONFIRM_REVIEW_WINDOW = Selenide.$(".fancybox-skin");

    public void clickTShirts() {
        SELECTOR_TSHIRTS_BUTTON.click();
        SELECTOR_TSHIRTS_NAME.shouldHave(Condition.text("T-shirts"));
    }

    public void clickMoreButton() {
        SELECTOR_FADED_TSHIRTS_PRODUCT.hover();
        SELECTOR_MORE_BUTTON.click();
    }

    public void clickWriteReviewButton() {
        SELECTOR_WRITE_REVIEW_BUTTON.click();
    }

    public void fillAndSubmitWriteReview() {
        SELECTOR_FIFTH_QUALITY_STAR.click();
        SELECTOR_TITLE_FIELD.setValue("High quality product");
        SELECTOR_COMMENT_FIELD.setValue(
                "Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. "
                        + "Accessorize with a straw hat and you're ready for summer!");
        SELECTOR_SEND_REVIEW_BUTTON.click();
        SELECTOR_CONFIRM_REVIEW_BUTTON.click();
        SELECTOR_CONFIRM_REVIEW_WINDOW.shouldBe(Condition.disappear);
    }
}
