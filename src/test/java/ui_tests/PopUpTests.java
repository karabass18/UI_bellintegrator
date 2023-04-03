package ui_tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PopUpTests extends TestsBase {

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка попапа")
    @Test
    public void checkThePopUp() {

        $("#careers_friend").shouldBe(Condition.visible);
        $("#careers_friend").$("div", 1).shouldHave(text("ВАКАНСИИ"));
        $("#careers_friend div").click();
        $("#careers_friend").shouldBe(Condition.hidden);

    }
}
