package com.my.column.common;

public class t2 {
    public static void main(String[] args) {
        Integer i = 10;
        Integer j = 5 + (i++);
        j += i;
        System.out.println(j++);
    }
}
