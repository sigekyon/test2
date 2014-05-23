package sample;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class sample4 {
    
    @AfterClass
    public static void afterClass(){
        System.out.println("@afterClass");
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
