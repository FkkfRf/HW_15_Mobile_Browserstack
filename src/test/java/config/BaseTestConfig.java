package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        //"classpath:config/${env}.properties"
        "classpath:config/local.properties"
})
public interface BaseTestConfig extends Config {

    @Key("userName")
    @DefaultValue("hwqa_uomRki")
    String getUserName();

    @Key("password")
    @DefaultValue("u1VhNMZ58D8FuosP4XxR")
    String getPassword();

}

