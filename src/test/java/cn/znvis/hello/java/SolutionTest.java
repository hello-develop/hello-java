package cn.znvis.hello.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void test(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(1);


        List<Integer> list2 = new ArrayList<>();
        list2.add(-1);
        list2.add(1);

        System.out.println(list1.equals(list2));
    }

    @Test
    public void threeSum(){
        Solution sl = new Solution();
        System.out.println(sl.threeSum(new int[]{1,0,-1,2,-2}));
    }

    @Test
    public void longestCommonPrefix(){
        Solution sl = new Solution();
        System.out.println(sl.longestCommonPrefix(new String[]{"fl", "fl", "fls"}));
    }

    @Test
    public void intToRoman(){
        Solution sl = new Solution();
        System.out.println(sl.intToRoman(91));
    }

    @Test
    public void maxArea(){
        Solution sl = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(sl.maxArea2(height));
    }

    @Test
    public void myAtoi(){
        Solution sl = new Solution();
        System.out.println(sl.myAtoi("   -42"));
    }

    @Test
    public void convert(){
        Solution sl = new Solution();
        System.out.println(sl.convert("abcd", 2));
    }

    @Test
    public void addTwoNumbers(){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

        Solution sl = new Solution();

        ListNode l3 = sl.addTwoNumbers(l1, l2);
        while(l3!=null){
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    @Test
    public void longestPalindrome(){
        Solution sl = new Solution();
        System.out.println(sl.longestPalindrome("bbbbbbbbbbb"));
    }

    @Test
    public void isPalindrome() {
        Solution sl = new Solution();
        System.out.println(sl.isPalindrome(121));
    }

    @Test
    public void romanToInt(){
        Solution sl = new Solution();
        System.out.println(sl.romanToInt("MCMXCIX"));
    }


}