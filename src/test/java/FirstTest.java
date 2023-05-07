import org.junit.jupiter.api.Test;
import page.PageMainPageGitHub;

import static io.qameta.allure.Allure.step;

public class FirstTest {
    PageMainPageGitHub pageMainPageGitHub = new PageMainPageGitHub();

    @Test
    public void checkMainPage() {
        step("Открываем главную страницу 'GitHub'", () -> {
            pageMainPageGitHub.openMainPage();
        });

        step("Проверяем наличие поля 'Поиск' на странице", () -> {
            pageMainPageGitHub.searchButton();
        });
    }
}
