package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;
import static io.qameta.allure.Allure.step;

@DisplayName("Wikipedia тесты")
public class SearchTest extends TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Feature("Проверка получения результата поиска")
    @Story("Проверка отображения получения результата поиска в списке страниц Википедии")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Тест-кейс №1: Проверка получения результата поиска")
    void successfulSearchTest() {
        step("Открыть поиск и ввести запрос", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchQuery("Selenide");
        });
        step("Проверить результата поиска", searchPage::shouldSeeResults);
    }

}