import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class WaterBottleTest {

    @Test
    public void takeDrink(){
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void empty(){
        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fill(){
        WaterBottle waterBottle = new WaterBottle(0);
        assertEquals(100, waterBottle.fill());
    }
}
