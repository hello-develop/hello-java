package cn.znvis.hello.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HelloLongestSubstring {
    /**
     * 获取无重复字符的最长子串的长度
     * @param s 原始字符串
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;

        if(s.length()<=1) return s.length();

        for(int i=0; i<s.length()-longest; i++){
            int cursor = s.indexOf(s.charAt(i), i+1)==-1 ? s.length() : s.indexOf(s.charAt(i), i+1);

            for(int j=i+1; j<cursor; j++){
                int cursor2 = s.indexOf(s.charAt(j), j+1);
                cursor = cursor2==-1||cursor2>cursor ? cursor : s.indexOf(s.charAt(j), j+1);
            }

            if(cursor-i>longest) longest=cursor-i;
        }

        return longest;
    }

    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n && (n-i)>ans) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }


    public int lengthOfLongestSubstring3(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n && (n-i) > ans; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j))+1, i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }

}
