package config;

import com.codeborne.selenide.Configuration;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;

public class ProjectProvider {
    static BaseTestConfig configBase = ConfigFactory.create(BaseTestConfig.class, System.getProperties());

    public static void configBase() {

    }
}
