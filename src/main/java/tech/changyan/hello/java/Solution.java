package tech.changyan.hello.java;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> subList = new ArrayList<>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);
                        list.add(subList);
                    }
                }
            }
        }
        return list;
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int minLength = strs[0].length();
        boolean flag = true;
        String maxPrefix = "";
        for(int i=1;i<strs.length;i++){
            if(minLength>strs[i].length()) minLength = strs[i].length();
        }

        for(int i=0;i<minLength;i++){
            for(int j=0;j<strs.length;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                maxPrefix = strs[0].substring(0, i+1);
            }else{
                break;
            }
        }

        return maxPrefix;
    }

    public String intToRoman2(int num){
        StringBuffer sb = new StringBuffer();

        return sb.toString();
    }

    /**
     * 整数转换罗马数字
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");

        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");

        map.put(100, "C");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");

        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");


        String roman = "";
        int divNum = num;
        int remNum = 0;
        int i = 0;
        do{
            remNum = divNum%10;
            divNum = divNum/10;
            if(remNum!=0) roman = map.get(remNum*(int)Math.pow(10, i)) + roman;
            i++;
        }while(divNum>=1);
        return roman;
    }

    /**
     * 最大装水面积-双指针法
     * @param height
     * @return
     */
    public int maxArea2(int[] height) {
        int maxArea = 0, curArea = 0;
        int l = 0;
        int r = height.length-1;

        while(l!=r){
            curArea = Integer.min(height[l], height[r])*(r-l);
            maxArea = maxArea< curArea ? curArea : maxArea;
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxArea;
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int curArea = 0;

        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                curArea = Integer.min(height[i], height[j]) * (j-i);
                maxArea = maxArea<curArea ? curArea : maxArea;
            }
        }
        return maxArea;
    }

    public int myAtoi(String str) {
        String regex = "^\\s*([-+]){0,1}[0]*([1-9]+[0-9]*)";

        Pattern pattern = Pattern.compile(regex);

        int reslut = 0;
        String matchStr = "";
        long matchNum = 0;

        Matcher match = pattern.matcher(str);


        if(match.find()) {
            String sign = match.group(1)==null ? "" : match.group(1);
            String num = match.group(2)==null ? "" : match.group(2);
            matchStr = sign+num;

            if(matchStr.length()<=11){
                matchNum = Long.parseLong(matchStr);
                if(matchNum<=Integer.MAX_VALUE && matchNum>=Integer.MIN_VALUE){
                    reslut = (int)matchNum;
                }else if(matchNum>Integer.MAX_VALUE){
                    reslut = Integer.MAX_VALUE;
                }else if(matchNum<Integer.MIN_VALUE){
                    reslut = Integer.MIN_VALUE;
                }
            }else{
                if(matchStr.charAt(0)!='-'){
                    reslut = Integer.MAX_VALUE;
                }else{
                    reslut = Integer.MIN_VALUE;
                }
            }
        }

        return reslut;
    }

    /**
     * 考虑行数的两种特殊情况：1、行数小于2行；2、行数比字符数多
     */
    public String convert(String s, int numRows) {

        if(numRows<=0) return "";
        if(numRows==1) return s;

        int length = s.length();
        numRows = Math.min(length, numRows);

        int flag = 0;
        boolean reverseFlag = false;

        String[] strArr = new String[numRows];
        String result = "";

        for(int i=0;i<length;i++){
            strArr[flag] = strArr[flag]==null ? "" : strArr[flag];
            if(flag<numRows-1 && !reverseFlag){
                strArr[flag++] += s.charAt(i);
            }else{
                reverseFlag = true;
                strArr[flag--] += s.charAt(i);
                if(flag==0) reverseFlag=false;
            }

        }

        for(int i=0;i<strArr.length;i++){
            result += strArr[i];
        }

        return result;
    }


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        boolean carry = false;

        ListNode l0 = new ListNode(0);
        ListNode h3 = new ListNode(0);
        ListNode l3 = h3;

        while(l1!=null || l2!=null){
            l1 = l1==null ? l0 : l1;
            l2 = l2==null ? l0 : l2;

            sum = l1.val + l2.val;
            if(carry) sum += 1;

            if(sum>=10){
                carry = true;
                sum -= 10;
            }else{
                carry = false;
            }
            l3.next = new ListNode(sum);

            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(carry) l3.next = new ListNode(1);

        return h3.next;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int longest = 0;
        String subPalil = "";

        if(n<=1){
            return s;
        }else{
            longest++;
            subPalil = s.substring(0,1);
        }

        for(int i=0; i<n-longest; i++){
            for(int j=i+1; j<n; j++){
                String substr = s.substring(i, j+1);
                if(this.isPalindrome(substr)){
                    if(j-i+1>longest){
                        longest = j-i+1;
                        subPalil = substr;
                    }
                }
            }
        }

        return subPalil;
    }

    public <T> boolean isPalindrome(T x) {

        String str1 = String.valueOf(x);
        String str2 = str1;
        int n = str1.length();

        if(str1.charAt(0)=='-') return false;

        for(int i=0; i<n/2; i++){
            if(str1.charAt(i)!=str2.charAt(n-i-1)) return false;
        }

        return true;
    }

    public int romanToInt(String s) {
        int n = s.length();
        int result = 0;

        for (int i=0; i<n; i++){
            if(n-i>1) {
                switch (s.substring(i, i + 2)) {
                    case "CM":
                        result += 900;
                        i++;
                        continue;
                    case "CD":
                        result += 400;
                        i++;
                        continue;
                    case "XC":
                        result += 90;
                        i++;
                        continue;
                    case "XL":
                        result += 40;
                        i++;
                        continue;
                    case "IX":
                        result += 9;
                        i++;
                        continue;
                    case "IV":
                        result += 4;
                        i++;
                        continue;

                }
            }
            switch (s.charAt(i)){
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    result += 1;
                    break;
            }
        }

        return result;
    }

}
