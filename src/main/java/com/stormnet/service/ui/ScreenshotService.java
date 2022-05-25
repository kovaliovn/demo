package com.stormnet.service.ui;

import com.codeborne.selenide.SelenideElement;
import com.stormnet.service.ui.UiTestExecutor.UiExecutorType;
import org.openqa.selenium.By;

public class ScreenshotService {

    private static final UiTestExecutor UI_TEST_EXECUTOR = UiTestExecutorFactory.getInstance()
            .get(UiExecutorType.UPDATE);

    private ScreenshotService() {
    }

    public static void uiExecutor(final Feature feature, final By... ignoredElements) {
        UI_TEST_EXECUTOR.execute(feature, ignoredElements);
    }

    public static void uiExecutor(final SelenideElement element, final Feature feature, final By... ignoredElements) {
        UI_TEST_EXECUTOR.execute(element, feature, ignoredElements);
    }
}
