package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

    private C12 c12;

    @Before
    public void before() {
        c12 = new C12();
    }

    @Test
    public void testMA() {
        assertEquals("C12:mA()", c12.mA());
    }

}
