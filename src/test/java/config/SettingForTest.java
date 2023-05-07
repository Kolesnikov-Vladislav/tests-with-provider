package config;

import config.webui.WebConfig;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class SettingForTest {
    private static final WebConfig config = WebDriverConfig.Instance.read();

    @BeforeAll
    public static void setUp(){
        SelenideLogger.addListener("allure",new AllureSelenide());
        WebDriverProvider webDriverProvider = new WebDriverProvider(config);
        webDriverProvider.webConfig();
    }

   @AfterEach
    public void getAttach(){
        Attach.addVideo();
        Attach.browserConsoleLogs();
        Attach.pageSource();
        Attach.screenshotAs("ScreenShot");
    }
}
