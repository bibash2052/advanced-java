package com.bibash.methodreference;

public class Rectangle {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateRectangleArea() {
        return length * breadth;
    }
}
