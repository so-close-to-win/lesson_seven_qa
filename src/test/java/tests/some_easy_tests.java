package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class some_easy_tests {

    @Test
    @DisplayName("Позитивный тест")
    @Description("Проба позитивного теста")
    @Tag("positive")
    void easyPositiveTest() {
        int a = 1;
        assertEquals(a, 1);
    }

    @Test
    @DisplayName("Негативный тест")
    @Description("Проба негативного теста")
    @Tag("antipositive")
    void easyNegativeTest() {
        int b = 2;
        assertEquals(b, 1);
    }

    @Test
    @Tag("Parametrize")
    void parametrizedStringTest() {
        String a = "apple";
        String b = System.getProperty("bbb");

        assertEquals(a, b);
    }
}
