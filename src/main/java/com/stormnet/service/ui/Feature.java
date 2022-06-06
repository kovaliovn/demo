package com.stormnet.service.ui;

public enum Feature {

    EXAMPLE("/example.png");


    private static final String BASE_SCREENSHOT_PATH = "./src/test/resources/expected-ui";
    final String expectedUiScreenshot;

    Feature(final String screenShotPath) {
        // change if that need
        final String browser = "/chrome";
        this.expectedUiScreenshot = BASE_SCREENSHOT_PATH + browser + screenShotPath;
    }

    public String getExpectedUiScreenshot() {
        return this.expectedUiScreenshot;
    }
}
