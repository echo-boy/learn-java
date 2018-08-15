package com.learn.abc;

/**
 * Create by WEH on 2018-08-14 18:51
 */
public class $1_Variable {

    /*
     * ------------------------------------
     * 基本数据类型
     * ------------------------------------
     */

    public static void main(String[] args) {
        // 声明变量
        Integer num1 = 10;
        Integer num2 = new Integer("10");

        String[] arr1 = new String[5];
        String[] arr2 = new String[]{};

        // 当创建变量的时候，会在内存中为其申请空间（有值才会分配）。没有分配空前之前是不能使用的。
        // 比如，下面的object，后面要为其赋值（=null），才能在后面使用（输出）。否则会编译报错。
        Object object = null;
        System.out.println(object);
    }

}
