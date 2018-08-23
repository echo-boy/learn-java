package com.learn;

/**
 * Create by WEH on 2018-08-22 19:57
 */
@SuppressWarnings("all")
public class ClassLoadProcess1 {
    public static int a = 10;
    public static ClassLoadProcess1 test;

    static {
        System.out.println();
        System.out.println();
        test = new ClassLoadProcess1();
    }

    public ClassLoadProcess1() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        new ClassLoadProcess1();
    }
}
