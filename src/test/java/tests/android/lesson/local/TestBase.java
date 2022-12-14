package tests.android.lesson.local;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.MobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {
    @BeforeAll
    public static void setup() {
        Configuration.browser = MobileDriver.class.getName();
        Configuration.browserSize = null;
    }
    @BeforeEach
    void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }
    @AfterEach
    public void tearDown() {
        String sessionId = Selenide.sessionId().toString();

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        closeWebDriver();
    }
}