package com.stormnet.pages;

import com.codeborne.selenide.Selenide;
import com.stormnet.base.BaseTest;
import com.stormnet.service.ui.Feature;
import com.stormnet.service.ui.ScreenshotService;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllTest extends BaseTest {

    @Test
    @Owner(value = "Kovaliov Nikita")
    public void firstCaseTest() {
        String expectedMessage = "Your order on My Store is complete.\n"
                + "Please send us a bank wire with\n"
                + "- Amount $28.00\n"
                + "- Name of account owner Pradeep Macharla\n"
                + "- Include these details xyz\n"
                + "- Bank name RTP\n";
        signInPage.clickSignInButton();
        signInPage.signIn("kovaliovn92@gmail.com", "Genius1992");
        accountPage.openCasualDresses();
        casualDressesPage.addToCardProductAndConfirmOrder();
        Assertions.assertTrue(Selenide.$(".box").getText().contains(expectedMessage));
    }

    @Test
    @Owner(value = "Kovaliov Nikita")
    @Description(value = "Send feedback to support")
    public void secondCaseTest() {
        String expectedMessage = "Your message has been successfully sent to our team.";
        signInPage.clickSignInButton();
        signInPage.createAccount();
        signInPage.fillYourPersonalInfo();
        accountPage.openCasualDresses();
        casualDressesPage.addToCardProductAndConfirmOrder();
        contactUsPage.clickContactUsButton();
        contactUsPage.fillContactUsPage();
        contactUsPage.clickSendButton();
        Assertions.assertTrue(Selenide.$(".alert.alert-success").getText().contains(expectedMessage));
    }

    @Test
    @Owner(value = "Kovaliov Nikita")
    public void thirdCaseTest() {
        String expectedMessage = "Faded Short Sleeve T-shirts";
        signInPage.clickSignInButton();
        signInPage.signIn("kovaliovn92@gmail.com", "Genius1992");
        tShirtsPage.clickTShirts();
        tShirtsPage.clickMoreButton();
        tShirtsPage.clickWriteReviewButton();
        tShirtsPage.fillAndSubmitWriteReview();
        Assertions.assertTrue(Selenide.$("h1[itemprop='name']").getText().contains(expectedMessage));
    }

    @Test
    @Owner(value = "Kovaliov Nikita")
    public void fourthCaseTest() {
        signInPage.clickSignInButton();
        signInPage.signIn("kovaliovn92@gmail.com", "Genius1992");
        womenPage.clickWomen();
        womenPage.clickMoreButton();
        womenPage.clickWishListButton();
        accountPage.clickAccountButton();
        accountPage.removeWishList();
        Assertions.assertFalse(Selenide.$("#block-history .table.table-bordered").isDisplayed());
    }

    @Test
    @Owner(value = "Kovaliov Nikita")
    public void fifthCaseTest() {
        signInPage.clickSignInButton();
        signInPage.signIn("kovaliovn92@gmail.com", "Genius1992");
        accountPage.openSummerDresses();
        summerDressPage.clickMoreButton();
        summerDressPage.clickBlackColorButton();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        summerDressPage.clickBlueColorButton();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        summerDressPage.clickOrangeColorButton();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
        summerDressPage.clickYellowColorButton();
        Assertions.assertTrue(Selenide.$(".color_pick.selected").exists());
    }

    @Test
    @Owner(value = "Kovaliov Nikita")
    public void screenShotTest() {
        ScreenshotService.uiExecutor(Feature.EXAMPLE);
    }
}
