package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;
import static io.qameta.allure.Allure.step;

public class ArticleTest extends TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Test
    void openArticleTest() {
        step("Открыть поиск и ввести запрос", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchQuery("Selenium");
        });
        step("Открыть первую статью", searchPage::openFirstSearchResult);
        step("Убедиться, что страница статьи открыта", () -> {
            searchPage.shouldSeeArticleTitle("Selenium");
        });
    }

}