package tests;

import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;

import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    MainPage searchMainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Test
    void successfulSearchTest() {
        step("Откройте поиск и введите запрос", () -> {
            searchMainPage.clickSearchIcon();
            searchPage.enterSearchQuery("Appium");
        });

        step("Проверить что контент найден", searchPage::shouldSeeResults);
    }
}