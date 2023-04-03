package ui_tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.$;

public class SearchTests extends TestsBase {

    SearchPage searchPage = new SearchPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка иконки")
    @Test
    public void checkTheSearchBlock() {
        $("#careers_friend div").click();
        searchPage
                .checkIconVisible()
                .checkAppearanceTheFieldAfterClick()
                .checkOpenedWindow()
                .checkSearchResult();
    }
}
