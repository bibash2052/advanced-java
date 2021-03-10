package com.bibash;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(4, 0.75f, false);
        linkedHashMap.put("Bibash", 12345);
        linkedHashMap.put("Bibash1", 123456);
        linkedHashMap.put("Bibash2", 12345765);
        linkedHashMap.put("Bibash3", 12345765);

        for (Map.Entry<String, Integer> entry: linkedHashMap.entrySet()
             ) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
