package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));

        Money fiveF = Money.franc(5);
        assertEquals(Money.franc(10), fiveF.times(2));
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(6), Money.dollar(6));
        assertNotEquals(Money.dollar(9), Money.dollar(6));
        assertNotEquals(Money.dollar(3), Money.franc((3)));

        assertEquals(Money.franc(6), Money.franc(6));
        assertNotEquals(Money.franc(9), Money.franc(6));
    }



    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CNF", Money.franc(1).currency());
    }
}
