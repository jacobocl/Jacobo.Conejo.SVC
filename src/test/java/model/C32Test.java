package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

    private C32 c32;

    @Before
    public void before() {
        c32 = new C32();
    }

    @Test
    public void testMA() {
        assertEquals("C32:mA()", c32.mA());
    }

}
