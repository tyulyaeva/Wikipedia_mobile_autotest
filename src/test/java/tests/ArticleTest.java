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
public class ArticleTest extends TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Feature("Проверка открытия статьи, на  денной в результате поиска")
    @Story("Проверка открытия статьи Википедии")
    @Severity(SeverityLevel.CRITICAL)
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