package cn.znvis.hello.java;

import org.junit.Test;

public class HelloSumTest {

    @Test
    public void twoSum() {
    }

    @Test
    public void twoSum2() {
    }

    @Test
    public void twoSum3() {
        int[] arr = {1,2,3,4};
        int target = 4;
        int[] twoSum = HelloSum.twoSum3(arr, target);
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

        for(int e:twoSum){
            System.out.println(e);
        }
    }
}