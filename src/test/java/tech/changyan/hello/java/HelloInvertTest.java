package tech.changyan.hello.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloInvertTest {

    @Test
    public void reverse() {
        HelloInvert hi = new HelloInvert();
        System.out.println(hi.reverse(-2147483648));
    }

    @Test
    public void test(){
        int x = 1;
        System.out.println(x /= 10);  //整数相除取整数位
    }
}