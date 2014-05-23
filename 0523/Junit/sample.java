package sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class sample {
    
    @Before
    public void before(){
        System.out.println("@before");
    }

    @Test
    public void test() {
        System.out.println("@test - test1");
    }
    
    @Test
    public void hoge(){
        System.out.println("@test - hoge");
    }

}
