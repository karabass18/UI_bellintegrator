package ui_tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HamburgerMenuPage;

import static helpers.PopUpWatcher.checkPopUpVisibility;

;

public class HamburgerMenuTests extends TestsBase {

    HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка логотипа")
    @Test
    public void checkTheLogo() {
        checkPopUpVisibility();
        hamburgerMenuPage
                .checkHamburgerVisible()
                .checkHamburgerClick()
                .checkClosingMenu();
    }


}
