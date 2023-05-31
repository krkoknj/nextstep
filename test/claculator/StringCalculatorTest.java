package claculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorTest {

    StringCalculator cal;
    @BeforeEach
    public void setup() {
        cal = new StringCalculator();
    }

    @Test
    void test1() {
        int add = cal.add("1,2,3");
        assertEquals(6, add);
    }

    @Test
    void test2() {
        int add = cal.add("//;\n1;2;3");
        assertEquals(6, add);
    }

    @Test
    void test_문자_하나() {
        int add = cal.add("11");
        assertEquals(11, add);
    }
    @Test
    void testNull() {
        int add = cal.add(null);
        assertEquals(0, add);
    }

    @Test
    void testEmptyString() {
        int add = cal.add("");
        assertEquals(0, add);
    }

    @Test
    void exceptionTest() {
        assertThrows(RuntimeException.class, () -> {
            cal.add("-1");
        });
    }
}