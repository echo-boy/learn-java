package com.learn.oop;

/**
 * Create by WEH on 2018-08-14 19:13
 */
public class StringUtils {

    /*
     * ---------------------------------------
     * 这里面
     *      isEmpty 是静态方法，属于类，是类方法
     *
     * 即不需要 new 一个对象，直接通过类即可使用
     * -  StringUtils.isEmpty("HelloWorld")
     * ---------------------------------------
     */

    public static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }

}
