package com.bibash;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Bibash", 12345);
        hashMap.put("Bibash1", 123456);
        hashMap.put("Bibash2", 12345765);
        System.out.println(hashMap);
    }
}
