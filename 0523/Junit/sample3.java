package sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class sample3 {
    
    @After
    public void after(){
        System.out.println("@after");
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
