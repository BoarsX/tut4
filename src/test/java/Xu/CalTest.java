package Xu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    public void add() {
        Cal cal = new Cal();
        int a = 5;
        int b = 6;
        int c = cal.add(a,b);
        assertEquals(a + b,c);
    }


    @Test
    void subtract() {
        Cal cal = new Cal();
        int a = 5;
        int b = 6;
        int d = cal.subtract(a,b);
        assertEquals(a - b,d);
    }
}