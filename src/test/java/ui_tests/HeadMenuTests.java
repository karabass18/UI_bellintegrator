package ui_tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HeadMenuPage;

import static com.codeborne.selenide.Selenide.$;

public class HeadMenuTests extends TestsBase {

    HeadMenuPage headMenuPage = new HeadMenuPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка логотипа")
    @Test
    public void checkTheLogo() {

        $("#careers_friend div").click();
        headMenuPage
                .checkLogoVisible()
                .checkLogoLink("https://bellintegrator.ru");
    }

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка блока \"Наши вакансии\"")
    @Test
    public void checkVacancies() {

        // $("#careers_friend div").click();
        headMenuPage
                .checkVacanciesVisible()
                .checkVacanciesClick()
                .checkJobSubmenu();
    }

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка блока SocialMedia")
    @Test
    public void checkSocialMedia() {

        headMenuPage
                .checkVK()
                .checkLinkedin()
                .checkTelegram();
    }
}
