package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.LocalDriver;
import helpers.AttachmentsUtils;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    public static String host = System.getProperty("host");
    @BeforeAll
    static void beforeAll() {
        switch (host) {
            case "browserstack_test":
                Configuration.browser = BrowserstackDriver.class.getName();
                break;
            case "local_test":
                Configuration.browser = LocalDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        AndroidDriver driver = (AndroidDriver) WebDriverRunner.getWebDriver();

        AttachmentsUtils.attachScreenshot(driver);
        AttachmentsUtils.attachPageSource(driver);
        AttachmentsUtils.attachLogs("Test finished on device: " +
                driver.getCapabilities().getCapability("deviceName"));

        String sessionId = Selenide.sessionId().toString();
        System.out.println(sessionId);
        AttachmentsUtils.attachVideoLink(sessionId);
        closeWebDriver();
    }
}