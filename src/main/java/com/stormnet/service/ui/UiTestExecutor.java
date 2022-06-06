package com.stormnet.service.ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public interface UiTestExecutor {

    String FORMAT_NAME = "png";

    ShootingStrategy SHOOTING_STRATEGY = ShootingStrategies.viewportPasting(100);

    void execute(final Feature feature, By... ignoredElements);

    void execute(final SelenideElement element, final Feature feature, By... ignoredElements);

    UiExecutorType getType();

    enum UiExecutorType {
        COMPARE,
        UPDATE
    }
}
