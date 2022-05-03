package com.stormnet.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class TShirtsPage {

    private static final By SELECTOR_TSHIRTS_BUTTON = By.cssSelector("li:nth-child(3) a[title='T-shirts']");
    private static final By SELECTOR_TSHIRTS_NAME = By.cssSelector(".category-name");
    private static final By SELECTOR_FADED_TSHIRTS_PRODUCT = By.cssSelector("ul.product_list.grid > li.first-in-line");
    private static final By SELECTOR_MORE_BUTTON = By.cssSelector(".button.lnk_view.btn.btn-default");
    private static final By SELECTOR_WRITE_REVIEW_BUTTON = By.cssSelector("li a[class='open-comment-form']");
    private static final By SELECTOR_FIFTH_QUALITY_STAR = By.cssSelector("a[title='5']");
    private static final By SELECTOR_TITLE_FIELD = By.cssSelector("#comment_title");
    private static final By SELECTOR_COMMENT_FIELD = By.cssSelector("#content");
    private static final By SELECTOR_SEND_REVIEW_BUTTON = By.cssSelector("#submitNewMessage");
    private static final By SELECTOR_CONFIRM_REVIEW_BUTTON = By.cssSelector(
            "div[class='fancybox-inner'] p.submit button[type='submit']");
    private static final By SELECTOR_CONFIRM_REVIEW_WINDOW = By.cssSelector(".fancybox-skin");

    public void clickTShirts() {
        Selenide.$(SELECTOR_TSHIRTS_BUTTON).click();
        Selenide.$(SELECTOR_TSHIRTS_NAME).shouldHave(Condition.text("T-shirts"));
    }

    public void clickMoreButton() {
        Selenide.$(SELECTOR_FADED_TSHIRTS_PRODUCT).hover();
        Selenide.$(SELECTOR_MORE_BUTTON).click();
    }

    public void clickWriteReviewButton() {
        Selenide.$(SELECTOR_WRITE_REVIEW_BUTTON).click();
    }

    public void fillAndSubmitWriteReview() {
        Selenide.$(SELECTOR_FIFTH_QUALITY_STAR).click();
        Selenide.$(SELECTOR_TITLE_FIELD).setValue("High quality product");
        Selenide.$(SELECTOR_COMMENT_FIELD).setValue(
                "Faded short sleeve t-shirt with high neckline. Soft and stretchy material for a comfortable fit. "
                        + "Accessorize with a straw hat and you're ready for summer!");
        Selenide.$(SELECTOR_SEND_REVIEW_BUTTON).click();
        Selenide.$(SELECTOR_CONFIRM_REVIEW_BUTTON).click();
        Selenide.$(SELECTOR_CONFIRM_REVIEW_WINDOW).shouldBe(Condition.disappear);
    }
}
