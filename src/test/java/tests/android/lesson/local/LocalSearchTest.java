package tests.android.lesson.local;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class LocalSearchTest extends TestBase {

    @Test
    void successSearchTest() {

        step("Type search", () -> {
            back();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Type search", () ->
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0))
        );
    }
}
