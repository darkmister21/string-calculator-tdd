import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private final StringCalculator calculator = new StringCalculator();

    @Test
    void emptyStringReturnsZero() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void singleNumberReturnsItself() {
        assertEquals(1, calculator.add("1"));
        assertEquals(5, calculator.add("5"));
    }

    @Test
    void twoNumbersCommaSeparatedReturnSum() {
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    void multipleNumbersCommaSeparatedReturnSum() {
        assertEquals(15, calculator.add("1,2,3,4,5"));
    }

    @Test
    void newLinesBetweenNumbersReturnSum() {
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    void customDelimiterReturnsSum() {
        assertEquals(3, calculator.add("//;\n1;2"));
        assertEquals(6, calculator.add("//-\n1-2-3"));
    }
}