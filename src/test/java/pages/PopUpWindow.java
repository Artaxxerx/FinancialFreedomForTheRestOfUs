package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PopUpWindow {

    private SelenideElement
            iWantToReceiveMyCopyButton = $("#button-0a65a969"),
            closePopUpButton = $("*[data-testid='popup-close-icon']"),
            iFrame = $("iframe[src*='systeme.io/public/826213131185d0889e235aec024f6f732ad036']"),
            popup = $(".sc-kbzbTo");


    public PopUpWindow verifyTheButtonIsPresent() {
        $(iFrame).shouldBe(visible, Duration.ofSeconds(10));
        Selenide.switchTo().frame(iFrame);
        iWantToReceiveMyCopyButton
                .shouldBe(interactable, Duration.ofSeconds(10)).click();
        return this;
    }

    public PopUpWindow clickClosePopUpButton() {
        $(iFrame).shouldBe(visible, Duration.ofSeconds(10));
        Selenide.switchTo().frame(iFrame);
        closePopUpButton
                .shouldBe(clickable, Duration.ofSeconds(10)).click();
        return this;
    }

    public PopUpWindow verifyPopUpWindowClosed() {
        popup.shouldNotBe(visible, Duration.ofSeconds(5));
        return this;
    }
}
