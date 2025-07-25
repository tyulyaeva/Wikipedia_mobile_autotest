package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;
import static io.qameta.allure.Allure.step;

@DisplayName("Wikipedia тесты")
public class ArticleTest extends TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Test
    @DisplayName("Тест-кейс №2: Проверка открытия статьи")
    void openArticleTest() {
        step("Открыть поиск и ввести запрос", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchQuery("black sabbath");
        });
        step("Открыть первую статью", searchPage::openFirstSearchResult);
        step("Убедиться, что страница статьи открыта", () -> {
            searchPage.shouldSeeArticleTitle("black sabbath");
        });
    }

}