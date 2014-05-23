package sample;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class sample2 {
    
    @BeforeClass
    public static void beforeClass(){
        System.out.println("@beforeClass");
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
