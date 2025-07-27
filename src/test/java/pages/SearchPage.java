package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;


public class SearchPage {
    private final SelenideElement searchInput = $(id("org.wikipedia.alpha:id/search_src_text"));
    private final ElementsCollection textViewResults = $$(className("android.widget.TextView"));
    private final ElementsCollection firstSearchResult =  $$(id("org.wikipedia.alpha:id/page_list_item_title"));
    private final ElementsCollection articleTitle = $$(className("android.widget.TextView"));

    public void enterSearchQuery(String query) {
        searchInput.sendKeys(query);
    }

    public void shouldSeeResults() {
        textViewResults.shouldHave(sizeGreaterThan(0));
    }

    public void openFirstSearchResult() {
        firstSearchResult.first()
                         .click();
    }

    public void shouldSeeArticleTitle(String expectedTitle) {
        articleTitle.findBy(text(expectedTitle))
                    .shouldBe(visible);
    }
}