package com.bibash;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("ABC");
        stringLinkedList.add("FGH");
        stringLinkedList.add(1,"DE");
        System.out.println(stringLinkedList);
    }
}
