package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchPage {

    public SearchPage checkIconVisible() {
        step("Проверка видимости", () -> {
            $(".search_icon").shouldBe(Condition.visible);
            $("#search").shouldBe(Condition.hidden);
        });
        return this;
    }

    public SearchPage checkAppearanceTheFieldAfterClick() {
        step("Проверка появления поля после клика", () -> {
            $(".search_icon").click();
            $("#search").shouldBe(Condition.visible);
        });
        return this;
    }

    public SearchPage checkOpenedWindow() {
        step("Проверка адреса окна с результатами поиска", () -> {
            $(".search_icon").click();
            $("[name=search]").setValue("Neuton AutoML").pressEnter();
            assertThat(WebDriverRunner.url()).contains("bellintegrator.ru/index.php?route=product/search");

        });
        return this;
    }

    public SearchPage checkSearchResult() {
        step("Проверка результатов поиска", () -> {

            $(".short__desc").shouldHave(text("Bell Integrator выпускает на российский рынок новое решение"));

        });
        return this;
    }
}
