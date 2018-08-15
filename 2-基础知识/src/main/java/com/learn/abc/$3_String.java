package com.learn.abc;

import java.util.Random;

/**
 * Create by WEH on 2018-08-15 19:20
 */
public class $3_String {

    /*
     * ------------------------------------
     * String
     *
     *  1) final修饰的类
     *  2) 字符串常量池
     *  3）碎片，StringBuilder，StringBuffer
     * ------------------------------------
     */

    public static void main(String[] args) {
        /*
         * -------------------
         * final
         * -------------------
         */
        // final类型的类，不允许继承重写
//        class MyString extends String {
//        }
        // 为什么是final的呢？
        // 出于安全考虑
        // 1、如果不是final的，就可以被子类重写，接收到的就不一定是什么值
        // 2、String中的byte[] value也是fianl的，一经创建，就不能修改
        // 出于性能考虑
        // 1、字符串常量池
        // 2、避免JVM才对相关方法在虚函数表中查询（如果允许继承，执行方法需要找到真正要执行的方法）

        /*
         * -------------------
         * 声明
         * -------------------
         */
        // 等价
        String string1 = new String();
        String string2 = "";

        /*
         * -------------------
         * 字符串常量池
         *
         * 以下情况，会在字符串常量池中存储对象
         * 1. 显示调用String的intern方法的时候;
         * 2. 直接声明字符串字面常量的时候，例如: String a = "aaa";
         * 3. 字符串直接常量相加的时候，例如: String c = "aa" + "bb";
         *      其中的aa/bb只要有任何一个不是字符串字面常量形式，都不会在常量池生成"aabb". 且此时jvm做了优化，不会同时生成"aa"和"bb"在字符串常量池中
         * -------------------
         */
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s6 = s5.intern();
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;
        String s10 = "Hel" + new String("lo").intern();

        System.out.println("s1 == s2  " + (s1 == s2));  // true
        System.out.println("s1 == s3  " + (s1 == s3));  // true
        System.out.println("s1 == s4  " + (s1 == s4));  // false
        System.out.println("s1 == s5  " + (s1 == s5));  // false
        System.out.println("s1 == s6  " + (s1 == s6));  // true
        System.out.println("s1 == s9  " + (s1 == s9));  // false
        System.out.println("s1 == s10  " + (s1 == s10));  // false

        // intern的作用
        Integer[] integers = new Integer[10];
        Random random = new Random(10 * 10000);
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt();
        }
        int size = 10000000;
        String[] arr = new String[size];
        long t = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            // 方式一：每次都要new一个String对象
            arr[i] = new String(String.valueOf(integers[i % integers.length]));
            // 方式二：intern，避免重复字符串创建，大大减少内存
//            arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length])).intern();
        }
        System.out.println((System.currentTimeMillis() - t) + "ms");
        System.gc();

    }

}
