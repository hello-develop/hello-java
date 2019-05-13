package tech.changyan.hello.java;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class HelloLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        HelloLongestSubstring hls = new HelloLongestSubstring();
        int longest = hls.lengthOfLongestSubstring("uqinntq");
        System.out.println(longest);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        HelloLongestSubstring hls = new HelloLongestSubstring();
        int longest = hls.lengthOfLongestSubstring2("uqinntq");
        System.out.println(longest);
    }

    @Test
    public void lengthOfLongestSubstring3() {
        HelloLongestSubstring hls = new HelloLongestSubstring();
        int longest = hls.lengthOfLongestSubstring3("uqinntq");
        System.out.println(longest);
    }

    @Test
    public void test(){
        Set<Character> s = new HashSet<>();
        s.add('a');
        s.add('b');
        s.add('a');

        for(Character c:s){
            System.out.println(c);
        }
        System.out.println();

        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(1, 'c');

        System.out.println();

        for(Character c:map.values()){
            System.out.println(c);
        }

        System.out.println();

        for(HashMap.Entry<Integer, Character> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}