package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class findExamplesInWikiTests {

    @Test
    @DisplayName("Find JUnit5 example in Wiki")
    void findExampleForJUnit5() {
        //open selenide homepage
        open("https://github.com/selenide/selenide");

        //goto wiki
        $("[data-content='Wiki']").click();

        //find SoftAssertions page
        //goto SoftAssertions page
        $$("#wiki-pages-box li").findBy(text("SoftAssertions")).click();
        $("#wiki-wrapper h1").shouldHave(text("SoftAssertions"));

        //find example code for JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
