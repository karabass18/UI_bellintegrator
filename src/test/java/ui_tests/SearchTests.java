package ui_tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

import static helpers.PopUpWatcher.checkPopUpVisibility;

public class SearchTests extends TestsBase {

    SearchPage searchPage = new SearchPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка иконки")
    @Test
    public void checkTheSearchBlock() {
        checkPopUpVisibility();
        searchPage
                .checkIconVisible()
                .checkAppearanceTheFieldAfterClick()
                .checkOpenedWindow()
                .checkSearchResult();
    }
}
