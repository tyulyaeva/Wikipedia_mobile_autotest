package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;
import static io.qameta.allure.Allure.step;
public class SearchTest extends TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Test
    void successfulSearchTest() {
        step("Открыть поиск и ввести запрос", () -> {
            mainPage.clickSearchIcon();
            searchPage.enterSearchQuery("Selenide");
        });
        step("Проверить результата поиска", searchPage::shouldSeeResults);
    }

}