package edu.htc.bi.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddZero() {
        int x = 4;
        int zero = 0;
        int result = calc.add(x, zero);
        assertEquals(x, result);
    }

    @Test
    public void testAddDoubles() {
        double x = 3.14;
        double y = 2.71;
        double result = calc.add(x, y);
        assertEquals(x+y, result, 0.001);
    }
}