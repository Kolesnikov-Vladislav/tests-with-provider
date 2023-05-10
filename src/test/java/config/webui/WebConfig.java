package config.webui;

import org.aeonbits.owner.Config;

import java.net.URL;

import static org.aeonbits.owner.Config.*;

@Sources({
        //"system:properties",
        "classpath:${env}.properties",
        //"file:~/${env}.properties",
        //"file:./${env}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    String getBaseUrl();

    // зачитываем данные из командной строки
    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("isRemote")
    Boolean isRemote();
}
