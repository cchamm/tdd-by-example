package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(6), new Dollar(6));
        assertNotEquals(new Dollar(9), new Dollar(6));
        assertNotEquals(new Dollar(3), new Franc((3)));
    }


    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void testEqualityDollarFranc() {
        assertEquals(new Franc(6), new Franc(6));
        assertNotEquals(new Franc(9), new Franc(6));
    }
}
