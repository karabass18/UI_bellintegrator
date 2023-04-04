package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class HamburgerMenuPage {

    public HamburgerMenuPage checkHamburgerVisible() {
        step("Проверка видимости", () -> {
            $("#top-menu").shouldBe(Condition.visible);
            $("#menu").shouldBe(Condition.hidden);
        });
        return this;
    }

    public HamburgerMenuPage checkHamburgerClick() {
        step("Проверка клика по гамбургеру", () -> {
            $("#top-menu").click();
            $("#menu").shouldBe(Condition.visible);
            $("#menu").shouldHave(text("ТРАДИЦИОННЫЕ УСЛУГИ"));
        });
        return this;
    }

    public HamburgerMenuPage checkClosingMenu() {
        step("Проверка закрытия по клику на кнопку закрыть", () -> {
            $(".top-menu_btn_close").click();
            $("#menu").shouldBe(Condition.hidden);
            $("#top-menu").shouldBe(Condition.visible);
        });
        return this;
    }
}
