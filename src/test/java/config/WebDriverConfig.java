package config;

import config.webui.WebConfig;
import org.aeonbits.owner.ConfigFactory;

public enum WebDriverConfig {
    Instance;

    private static final WebConfig webConfig =
            ConfigFactory.create(
                    WebConfig.class,
                    System.getProperties()
            );

    public WebConfig read() {
        return webConfig;
    }
}