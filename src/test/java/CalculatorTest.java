import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Bottle bottle;
    Calculator calculator;

    @Before
    public void before(){
        bottle = new Bottle(100);
        calculator = new Calculator();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canAdd(){
        int result = calculator.add(bottle.getVolume(), 10);
        assertEquals(110, result);
    }

    @Test
    public void canSubtract(){
        int result = calculator.subtract(bottle.getVolume(), 10);
        assertEquals(90, result);
    }

    @Test
    public void canDivide(){
        double result = calculator.divide(bottle.getVolume(), 2);
        assertEquals(50, result, 0);
    }

    @Test
    public void canEmptyBottle(){
        int result = calculator.clear(bottle.getVolume(), 100);
        assertEquals(0, result);
    }
}
