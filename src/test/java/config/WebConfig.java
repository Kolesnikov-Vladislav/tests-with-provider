package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:system.properties",
        "classpath:${place}.properties",
        "classpath:remote.properties"
}
)
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("FIREFOX")
    String getBrowser();


    @Key("baseUrl")
    String getBaseUrl();

    // зачитываем данные из командной строки
    @Key("remoteUrl")
    String getRemoteUrl();
}
