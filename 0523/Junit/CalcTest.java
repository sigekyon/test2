package sample;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;


public class CalcTest {
    
    @Before
    public void setUp() throws Exception {
        
    }
    
    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void testSum2() {
        assertEquals(3,new Calc().sum(1, 2));
    }

}
