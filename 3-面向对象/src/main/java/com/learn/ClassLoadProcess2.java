package com.learn;

/**
 * Create by WEH on 2018-08-22 19:57
 */
@SuppressWarnings("all")
public class ClassLoadProcess2 {

    /*
     * ------------------------------------
     * 类加载过程：
     *  1、父类静态代码
     *  2、子类静态代码
     *  3、父类非静态代码
     *  4、父类构造方法
     *  5、子类非静态代码
     *  6、子类构造方法
     * ------------------------------------
     */

    public static int k = 0;
    public static ClassLoadProcess2 s1 = new ClassLoadProcess2("s1");
    public static ClassLoadProcess2 s2 = new ClassLoadProcess2("s2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");

    {
        print("构造块");
    }

    static {
        print("静态块");
    }

    public static int print(String s) {
        System.out.println(++k + ":" + s + "\ti=" + i + "\tn=" + n);
        ++n;
        return ++i;
    }

    public ClassLoadProcess2(String s) {
        System.out.println(++k + ":" + s + "\ti=" + i + "\tn=" + n);
        ++i;
        ++n;
    }

    public static void main(String[] args) {
        new ClassLoadProcess2("init");
    }

}
