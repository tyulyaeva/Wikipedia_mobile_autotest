package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import static io.qameta.allure.Allure.step;

@DisplayName("Wikipedia тесты")
public class MainPageTest extends TestBase{

    MainPage mainPage = new MainPage();

    @Feature("Проверка отображения баннера с новостями")
    @Story("Проверка отображения раздела с новостями 'In the News' на главное странице Википедии")
    @DisplayName("Тест-кейс №3: Проверка наличия раздела 'In the News' на главной странице")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @Tag("browserstack_test")
    void inTheNewsSectionTest() {
        step("Проверить, что 'In the News' отображается на главной странице", () ->
                mainPage.checkInTheNews("In the News"));
    }
}
