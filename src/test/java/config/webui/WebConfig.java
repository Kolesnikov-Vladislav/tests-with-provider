package config.webui;

import org.aeonbits.owner.Config;

import java.net.URL;

import static org.aeonbits.owner.Config.*;

@LoadPolicy(LoadType.MERGE)
@Sources({
        "system:properties",
        "classpath:${place}.properties",
        "file:~/${place}.properties",
        "file:./${place}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("108.0")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com/")
    String getBaseUrl();


    // зачитываем данные из командной строки
    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    URL getRemoteUrl();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();
}
