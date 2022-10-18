package org.example;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClaculatorTest {
    Calculator c;

    @Before
    public void setUp() throws Exception{

    }
    @After
    public void tearDown() throws Exception{

    }
    @Test
    public void testSum()
    {
        assertEquals(100,c.sum(10,20,30,40));
    }
    @Test
    public void testSquare()
    {
        assertEquals(225,c.square(15));
    }
}
