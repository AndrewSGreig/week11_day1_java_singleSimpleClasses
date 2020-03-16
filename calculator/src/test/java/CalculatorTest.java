import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Before
    public void Before(){
//        calculator = new Calculator(4,2);
//        int num1 = 4;
//        int num2 = 2
    }
    @Test
    public void canAdd(){
        Calculator calculator = new Calculator(4,2);
        assertEquals(6, calculator.add(4,2));
    }

    @Test
    public void canSubtract(){
        Calculator calculator = new Calculator(4,2);
        assertEquals(2, calculator.subtract(4,2));
    };

    @Test
    public void canMultiply(){
//        Calculator calculator = new Calculator(int num1, int num2);
        Calculator calculator = new Calculator(4, 2);
        assertEquals(8, calculator.multiply(4,2));
    }


    @Test
    public void canDivide(){
        Calculator calculator = new Calculator(4, 2);
        assertEquals(2.0, calculator.divide(4,2));
    }
}
