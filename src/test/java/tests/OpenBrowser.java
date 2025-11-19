package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;
import pages.PopUpWindow;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenBrowser {
    PopUpWindow popUpWindow = new PopUpWindow();

    @BeforeEach
    void baseUrl() {
        step("Open the page", () -> {
            open("https://systeme.io/blog/cost-of-online-course");
            WebDriverRunner.getWebDriver().manage().window().maximize();
        });
    }
}
