package tests;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class BannerTest extends OpenBrowser {

    @Test
    public void theAppearanceOfTheIWantToReceiveMyCopyButtonTest() {
        step("Checking That The Button 'I want to receive my copy' is presented", stepContext -> {
            popUpWindow.verifyTheButtonIsPresent();
        });
    }

    @Test
    public void closePopupButtonTest() {
        step("Checking that the close popUp button is working", stepContext -> {
            popUpWindow.clickClosePopUpButton();
            popUpWindow.verifyPopUpWindowClosed();
        });
    }
}
