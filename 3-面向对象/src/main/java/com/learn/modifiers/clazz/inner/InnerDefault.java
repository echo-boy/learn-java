package com.learn.modifiers.clazz.inner;

/**
 * Create by WEH on 2018-08-14 19:39
 */
class InnerDefault {

    public static int count = 0;

    public final String name;

    InnerDefault(String name) {
        this.name = name;
    }

    static class Child extends InnerDefault {
        public Child() {
            this("");
        }

        Child(String name) {
            super(name);
            count++;
        }
    }

    public static void main(String[] args) {
        Child child = null;
        for (int i = 0; i < 100; i++) {
            child = new Child();
        }
        System.out.println(child.count);
    }

    /*
     * 当前类【InnerDefault】的访问级别是"default"的，只能"当前包"中可以访问（即使用）
     */

    /**
     * 内部类
     * - private 可以修饰属性、方法、构造方法
     * - 修饰类的时候，只能修饰内部类
     */
    class Inner {

    }

}
