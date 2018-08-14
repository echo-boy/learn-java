package com.learn.oop;

/**
 * Create by WEH on 2018-08-14 19:17
 */
public class Student extends Person {

    /*
     * ---------------------------------------
     * 继承 Person类
     *  则Person类的方法和属性，该类就都有了
     * ---------------------------------------
     */

    /*
     * ---------------------------------------
     * 两个study方法，参数列表不同 -- 【重载】
     * ---------------------------------------
     */
    void study() {
        System.out.println("学习ing。。。");
    }

    void study(String subject) {
        System.out.println("学习" + subject + "ing。。。");
    }

    /*
     * ---------------------------------------
     * sleep方法 -- 【重写】
     *  在父类中有一个方法名一样，参数列表也一样的方法
     * ---------------------------------------
     */
    @Override
    void sleep() {

    }
}
