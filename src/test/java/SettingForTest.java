
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class SettingForTest {
    @BeforeAll
    static void setUp() {
        WebProvider.config();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void addAttachments() {
        Attach.addVideo();
        Attach.browserConsoleLogs();
        Attach.pageSource();
        Attach.screenshotAs("ScreenShot");
    }
}
