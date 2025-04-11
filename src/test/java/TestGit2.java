import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestGit2 {
    @Test
    void successfulSearchTest1() {
        open("https://ya.ru/");
        $("[name=11111text]").setValue("selenide").pressEnter();
        $("[id=search-result]").shouldHave(text("ru.selenide.org"));
    }
    @Test
    void successfulSearchTest2() {
        open("https://www.bing.com/");
        $("[name=qqqq]").setValue("selenide").pressEnter();
        $("[id=b_results]").shouldHave(text("https://selenide.orgqqqqqq"));
    }
}
