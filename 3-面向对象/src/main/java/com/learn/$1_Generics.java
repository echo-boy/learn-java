package com.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by WEH on 2018-08-23 19:49
 */
public class $1_Generics {
    /*
     * ------------------------------------
     * 范型
     * ------------------------------------
     */

    public static void main(String[] args) {
        test1();

        test2();

        test3();

        test4();

    }

    /**
     * ? extends Xxx    只能get
     * ? super Xxx      只能set
     * 可参见：{@link java.util.Collections#copy(List, List)}
     * -  目的在于 限制 + 规范
     */
    private static void test4() {
        class A {

            boolean isXxx() {
                throw new UnsupportedOperationException();
            }

            void hello() {
                throw new UnsupportedOperationException();
            }
        }

        class B extends A {

            boolean isXxx() {
                return true;
            }

            @Override
            void hello() {
                System.out.println("B");
            }
        }

        class C extends B {

            boolean isXxx() {
                return true;
            }

            @Override
            void hello() {
                System.out.println("C");
            }
        }

        /**
         * super - 只读
         */
        class Test<T extends Number> {

            void test1(List<? super C> list) {
                list.add(new C());
            }

            void test11(List<? extends B> list) {
//                list.add(new C());
            }

            void test2(List<T> list) {
            }

            void test3(List<? extends Number> list) {

            }
        }

        List<String> a = new ArrayList<>();
        List<Object> b = new ArrayList<>();
//        List<Object> c = a; // 报错
//        List<String> d = b; // 报错

        List<? extends Number> eList = null;
        eList = new ArrayList<Integer>();
        Number numObject = eList.get(0);  // 正确
//        Integer intObject = eList.get(0);  // 错误
//        eList.add(new Integer(1));  // 错误

        List<? super Integer> sList = null;
        sList = new ArrayList<Number>();
//        Number numObj = sList.get(0);  //语句1，错误
//        Integer intObj = sList.get(0);  //语句2，错误
        sList.add(new Integer(1));  //语句3，正确

        ArrayList<Integer> list = new ArrayList<>();
        new Test().test2(list);
        new Test().test3(list);
    }

    /**
     * 方法级别的范型
     */
    private static void test3() {
        // 属于方法的范型，两个方法同样是V，但是是没关系的
        class Utils {

            <V> void test1(V value) {
                System.out.println(value);
            }

            <V> void test2(V value) {
                System.out.println(value);
            }
        }

        Utils utils = new Utils();
        utils.test1("Hello Wrold");
        utils.test2(123123123);
    }

    /**
     * 范型应用场景：
     * -  抽取公共部分，减少重复代码
     */
    private static void test2() {
        class A {

            boolean isXxx() {
                throw new UnsupportedOperationException();
            }

            void hello() {
                throw new UnsupportedOperationException();
            }
        }

        class B extends A {

            boolean isXxx() {
                return true;
            }

            @Override
            void hello() {
                System.out.println("B");
            }
        }

        class C extends A {

            boolean isXxx() {
                return true;
            }

            @Override
            void hello() {
                System.out.println("C");
            }
        }

        class Parent<V extends A> {

            void test(V a) {
                if (a.isXxx()) {
                    a.hello();
                }
            }

        }

        class Child1 extends Parent<B> {
        }

        class Child2 extends Parent<C> {
        }

        int flag = 1;
        switch (flag) {
            case 1:
                new Child1().test(new B());
                break;
            case 2:
                new Child2().test(new C());
                break;
        }
    }


    private static void test1() {
        // 范型认识
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int num = (int) list.get(0);

        list.forEach(System.out::println);

        for (Object aList : list) {
            System.out.println(aList);
        }
    }
}
