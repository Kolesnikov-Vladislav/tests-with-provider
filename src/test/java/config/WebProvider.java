package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebProvider {

    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static void config() {
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser();

        if (config.getRemoteUrl() != null) {
            Configuration.remote = config.getRemoteUrl();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }
}
