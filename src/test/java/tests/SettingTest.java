package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LanguagePage;
import pages.MainPage;
import pages.SettingsPage;

@DisplayName("Wikipedia тесты")
public class SettingTest extends TestBase{
    MainPage mainPage = new MainPage();
    SettingsPage settingsPage = new SettingsPage();
    LanguagePage languagePage = new LanguagePage();

    @Feature("Проверка добавления функции смены языка текста в настройках Википедии")
    @Story("Проверка отображения смены языка текста в настройках Википедии после добавления из общего списка языков")
    @DisplayName("Тест-кейс №4: Проверка добавления языка 'Deutsch' в настройках")
    @Severity(SeverityLevel.NORMAL)
    @Test
    @Tag("browserstack_test")
    void languageSettingTest() {
        mainPage.navigationPress()
                .settingsButtonClick();
        settingsPage.languageListClick();
        languagePage.languageSelection("Deutsch")
                .checkLanguage("Deutsch");

    }
}
