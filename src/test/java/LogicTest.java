import org.junit.Test;

import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void add() {
        assertEquals(5, Logic.add(2, 3));
    }

    @Test
    public void remove() {
        assertEquals(-1, Logic.remove(2, 3));
    }

    @Test
    public void multiply() {
        assertEquals(6, Logic.multiply(2, 3));
    }

    @Test
    public void divide() {
        assertEquals(2, Logic.divide(5, 2));
    }
}