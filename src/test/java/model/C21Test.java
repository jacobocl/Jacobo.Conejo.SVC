package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C21Test {

    private C21 c21;

    @Before
    public void before() {
        c21 = new C21();
    }

    @Test
    public void testM1() {
        assertEquals("C21:m1()", c21.m1());
    }

    @Test
    public void testM2() {
        assertEquals("C21:m2()", c21.m2());
    }

}
