package com.learn.modifiers.clazz;

/**
 * Create by WEH on 2018-08-14 19:39
 */
class Default {

    private String name;

    /**
     * 内部类
     * - private 可以修饰属性、方法、构造方法
     * - 修饰类的时候，只能修饰内部类
     */
    private class Inner {

    }

    private class Other extends Inner {

    }

}
