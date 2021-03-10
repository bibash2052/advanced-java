package com.bibash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    static Character[] characterArray = {'b','i','b','a', 's', 'h'};
    static Integer[] integerArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true, false};


    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        list.addAll(Arrays.asList(array));
        return list;
    }

    public static void main(String[] args) {
        List<Character> characterList = arrayToList(characterArray, new ArrayList<>());
        List<Boolean> booleanList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> integerList = arrayToList(integerArray, new ArrayList<>());
        System.out.println(characterList);
        System.out.println(booleanList);
        System.out.println(integerList);
    }
}
