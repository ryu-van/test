import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(3, calculator.add(1, 2), "Kết quả đúng");
        assertNotEquals(4, calculator.add(1, 2), "Kết quả sai");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "Kết quả đúng");
        assertNotEquals(2, calculator.subtract(3, 2), "Kết quả sai");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(3, 2), "Kết quả đúng");
        assertNotEquals(5, calculator.multiply(3, 2), "Kết quả sai");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2), "Kết quả đúng");
        assertNotEquals(3.0, calculator.divide(4, 2), "Kết quả sai");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(4, 0);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
