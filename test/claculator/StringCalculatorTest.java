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
}