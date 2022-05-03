package com.stormnet.pages;

import com.codeborne.selenide.Selenide;
import com.stormnet.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllTest extends BaseTest {

    @Test
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
}
