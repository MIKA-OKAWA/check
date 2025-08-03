package calculate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();

        assertEquals(5,calculator.add(2, 3),"2+3は5になるはず");
        assertEquals(4,calculator.add(-1,5),"-1+5は4になるはず");
        assertEquals(4,calculator.add(0,4),"0+4は4になるはず");
        assertEquals(0,calculator.add(0,0),"0+0は0になるはず");
        assertEquals(-10,calculator.add(-3,-7),"-3+(-7)は-10になるはず");

    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.subtract(3, 2), "3-2は1になるはず");
        assertEquals(-3, calculator.subtract(-1, 2), "-1-2は-3になるはず");
        assertEquals(4, calculator.subtract(4, 0), "4-0は4になるはず");
        assertEquals(0, calculator.subtract(0, 0), "0-0は0になるはず");
        assertEquals(-5, calculator.subtract(-5, 0), "-5-0は-5になるはず");
        assertEquals(-2, calculator.subtract(-5, -3), "-5-(-3)は-2になるはず");
        assertEquals(15, calculator.subtract(10, -5), "10-(-5)は15になるはず");
        
    }
}
