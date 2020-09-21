package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class some_easy_tests {

    @Test
    @Tag("positive")
    void easyPositiveTest() {
        int a = 1;
        assertEquals(a, 1);
    }

    @Test
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
