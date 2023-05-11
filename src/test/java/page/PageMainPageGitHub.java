package page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageMainPageGitHub {

    public PageMainPageGitHub searchButton(){

        $(".header-search-input").shouldBe(visible);
        return this;
    }
    public PageMainPageGitHub openMainPage(){
        open(baseUrl);
        return this;
    }
}
