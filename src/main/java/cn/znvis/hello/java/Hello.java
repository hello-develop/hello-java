package cn.znvis.hello.java;

import java.util.HashMap;
import java.util.Map;

/**
 * DESC
 *
 * @author cc
 * @date 2020/5/29
 */
public class Hello {

    public void hello() {
        System.out.println(">>> hello");
    }

    public void hello2() {
        System.out.println(">>> hello2");
    }

    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<>();
        map.put("cc", true);
        if (map.getOrDefault("dd", true)) {
            System.out.println(">>> ok");
        }
    }
}
