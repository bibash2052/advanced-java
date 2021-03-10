package com.bibash;

public class Varargs {

    public static void main(String[] args) {
        String name1 = "Bibash1";
        String name2 = "Bibash2";
        String name3 = "Bibash3";
        String name4 = "Bibash4";
        printNameList(name1, name2, name3, name4);
    }
    //String... is variable arguments of type string. Any number of string arguments can be passed inside this function.
    private static void printNameList(String... names) {
        for (int i=0; i< names.length; i++) {
            System.out.println(i + 1 + ": " + names[i]);
        }
        System.out.println();
    }
}
