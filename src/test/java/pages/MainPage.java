package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {
    private final ElementsCollection card = $$(id("org.wikipedia.alpha:id/view_card_header_title"));
    private final SelenideElement navigationButton = $(id("org.wikipedia.alpha:id/menu_overflow_button"));
    private final SelenideElement settingButton = $(id("org.wikipedia.alpha:id/explore_overflow_settings"));

    public void clickSearchIcon() {
        $(accessibilityId("Search Wikipedia")).click();
    }

    @Step("Проверяем наличие 'In the News'")
    public MainPage checkInTheNews(String value) {
        card.findBy(text(value)).shouldBe(Condition.visible);
        return this;
    }

    @Step ("Кликаем на кнопку 'Навигация'")
    public  MainPage navigationPress(){
        navigationButton.click();
        return this;
    }
    @Step("Кликаем на кнопку 'Settings'")
    public MainPage settingsButtonClick() {
        settingButton.click();
        return this;

    }
}