package com.aimer.jdk;

import java.util.HashMap;

/**
 * @author :覃玉锦
 * @create :2023-09-04 19:50:00
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("key", new Object());
        System.out.println(map);
    }
}
