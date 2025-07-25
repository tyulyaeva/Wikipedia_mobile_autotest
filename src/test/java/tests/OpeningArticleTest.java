package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.MainPage;
import pages.SearchPage;
import static io.qameta.allure.Allure.step;

public class OpeningArticleTest extends TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @ParameterizedTest(name = "Поиск по запросу \"{0}\" и открытие статьи")
    @CsvSource({
            "Appium, Appium",
            "Selenium, Selenium"
    })

    void openArticleTest(String searchQuery, String expectedTitle) {
        step("Выполняем поиск", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchQuery(searchQuery);
        });

        step("Открываем первую статью", searchPage::openFirstSearchResult);

        step("Проверяем заголовок статьи", () -> {
            searchPage.shouldSeeArticleTitle(expectedTitle);
        });
    }
}