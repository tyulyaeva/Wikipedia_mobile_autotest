package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class MainPage {
    private final SelenideElement searchIcon = $(accessibilityId("Search Wikipedia"));

    public void clickSearchIcon() {
        searchIcon.click();
    }
}