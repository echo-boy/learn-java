package com.learn.modifiers.method;

/**
 * Create by WEH on 2018-08-14 19:55
 */
public class Protected {

    class Parent {

        /**
         * protected级别的方法，子类可以访问
         */
        protected void method() {
        }

    }

    class Child extends Parent {
        void test() {
            method();
        }
    }

    class Other {
        void test() {
            new Parent().method();
        }
    }

}
