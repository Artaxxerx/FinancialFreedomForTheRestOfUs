package tests;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class BannerTest extends OpenBrowser {

    @Test
    public void theAppearanceOfTheIWantToReceiveMyCopyButtonTest() {
        step("CheckingThatTheButtonIWantToReceiveMyCopyIsPresented", stepContext -> {
            popUpWindow.verifyTheButtonIsPresent();
        });
    }

    @Test
    public void closePopupButtonTest() {
        step("CheckingThatTheClosePopUpButtonIsWorking", stepContext -> {
            popUpWindow.clickClosePopUpButton();
            popUpWindow.verifyPopUpWindowClosed();
        });
    }
}
