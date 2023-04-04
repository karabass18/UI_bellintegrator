package helpers;

import static com.codeborne.selenide.Selenide.$;

public class PopUpWatcher {

    public static void checkPopUpVisibility() {

        if ($("#careers_friend div").isDisplayed()) {
            $("#careers_friend div").click();
        }
    }
}
