package com.learn.oop;

/**
 * Create by WEH on 2018-08-14 19:10
 */
public class Person {

    /*
     * ---------------------------------------
     * 这里面
     *      name 和 age   都是成员属性
     *      eat  和 sleep 都是成员方法
     * ---------------------------------------
     */

    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;

    void eat() {
        System.out.println("吃ing。。。");
    }

    void sleep() {
        System.out.println("睡ing。。。");
    }


}
