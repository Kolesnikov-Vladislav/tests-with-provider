import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.PageMainPageGitHub;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class FirstTest {
    PageMainPageGitHub pageMainPageGitHub = new PageMainPageGitHub();

    @Test
    public void checkMainPageButton() {
        step("Открываем главную страницу 'GitHub'", () -> {
            pageMainPageGitHub.openMainPage();
        });

        step("Проверяем наличие поля 'Поиск' на странице", () -> {
            pageMainPageGitHub.searchButton();
        });
    }

    @Test
    @Tag("block")
    @DisplayName("Проверка главной страницы на работу поиска")
    public void searchIssueAnWebSite(){
        step("Открываем главную страницу 'GitHub'", () -> {
            pageMainPageGitHub.openMainPage();
        });
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        $(".header-search-input").submit();
        $(linkText("eroshenkoam/allure-example")).click();
        $("#issues-tab").click();
        step("Проверяем ISSUE", () -> {
        $("div[aria-label=\"Issues\"]")
                .shouldBe(Condition.text("issue_to_test_allure_report"))
                .shouldBe(Condition.visible);});
        //issue_to_test_allure_report
    }
}
