package Config.WebUi;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
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
    URL getRemoteUrl();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();
}
