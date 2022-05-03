package com.stormnet.base;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.stormnet.pages.AccountPage;
import com.stormnet.pages.CasualDressesPage;
import com.stormnet.pages.ContactUsPage;
import com.stormnet.pages.SignInPage;
import com.stormnet.pages.SummerDressPage;
import com.stormnet.pages.TShirtsPage;
import com.stormnet.pages.WomenPage;
import io.qameta.allure.selenide.AllureSelenide;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    private static final String DEMO_APP_PROPERTIES = "./src/main/resources/demo.app.properties";
    private static final String ALLURE = "Allure";
    private static Properties properties;
    protected final SignInPage signInPage = new SignInPage();
    protected final AccountPage accountPage = new AccountPage();
    protected final CasualDressesPage casualDressesPage = new CasualDressesPage();
    protected final ContactUsPage contactUsPage = new ContactUsPage();
    protected final TShirtsPage tShirtsPage = new TShirtsPage();
    protected final WomenPage womenPage = new WomenPage();
    protected final SummerDressPage summerDressPage = new SummerDressPage();

    @BeforeAll
    public static void setUp() {
        properties = new Properties();
        readManagerPropertyFile();
        Configuration.baseUrl = properties.getProperty("automationpractice.site.url");
        Configuration.browser = properties.getProperty("browser");
        Configuration.browserVersion = properties.getProperty("browserVersion");
        Configuration.browserSize = properties.getProperty("browserSize");
        Configuration.timeout = Long.parseLong(properties.getProperty("timeout"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (Configuration.browser.equals("firefox")) {
            capabilities.setBrowserName(Browsers.FIREFOX);
            final FirefoxOptions options = new FirefoxOptions().addArguments("private");
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        }
        if (Configuration.browser.equals("chrome")) {
            capabilities.setBrowserName(Browsers.CHROME);
            final ChromeOptions options = new ChromeOptions().addArguments("incognito");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        }
        // If set to true, sets value by javascript instead of using Selenium built-in "sendKey"
        // function (that is quite slow because it sends every character separately).
        Configuration.fastSetValue = true;
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void begin() {
        SelenideLogger.addListener(ALLURE, new AllureSelenide()
                .savePageSource(Configuration.savePageSource)
                .screenshots(Configuration.screenshots));
        Selenide.open("/");
    }

    @AfterEach
    public void tearDown() {
        SelenideLogger.removeListener("Allure");
        Selenide.closeWindow();
    }

    private static void readManagerPropertyFile() {
        File file = new File(DEMO_APP_PROPERTIES);
        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file");
        }

        try {
            properties.load(fileInput);
        } catch (IOException e) {
            System.out.println("There is no such property");
        }
    }
}
