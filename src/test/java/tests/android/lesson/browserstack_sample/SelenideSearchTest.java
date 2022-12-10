package tests.android.lesson.browserstack_sample;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import tests.BaseTest;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearchTest extends BaseTest {

    @Test
    void successSearchTest() {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
    }
}
