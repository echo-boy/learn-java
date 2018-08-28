package com.learn;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Create by @author WEH on 2018-08-27 19:16
 */
public class $1_TryCatch {

    /*
     * try-catch (-finally)
     *
     * Throwable
     *     |- Error      系统级错误
     *     |- Exception  可修复的异常
     *         |- 其他Exception
     *         |- RuntimeException
     *             |- NullPointerException
     *             |- ArrayIndexOutOfBoundsException
     *             |- ArithmeticException
     *             |- NumberFormatException
     *             |- ClassCastException
     *             |- InputMismatchException
     *             ...
     *
     * RuntimeException 及其子类，是运行时异常，不用try-catch包括也可通过编译
     * 其他非 RuntimeException 子类的异常都需要try-catch块包含才可以通过编译
     */

    public static void main(String[] args) {
        System.out.println("1-----------------------------");
        test1();
        System.out.println("2-----------------------------");
        test2();
        System.out.println("3-----------------------------");
        test3();
        System.out.println("4-----------------------------");
        System.out.println(test4());
        System.out.println("5-----------------------------");
        System.out.println(test5());
        System.out.println("6-----------------------------");
        System.out.println(test6());
        System.out.println("7-----------------------------");
        System.out.println(test7());
        System.out.println("8-----------------------------");
        test8();
    }

    /**
     * 1）try是必须的
     * 2）catch和finally至少要有一个，视情况
     * 3）catch可以有多个
     */
    private static void test1() {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        // Since 1.8，catch捕获多个异常
        try {
            System.out.println(1 / 0);
            throw new IOException();
        } catch (ArithmeticException | IOException ignored) {
        }

        System.out.println("你好，世界");
    }

    /**
     * finally 写"无论是否抛出异常"一定要执行的代码
     * -- 注意：finally不是写在方法中就一定会执行，而是进入了对应的try后，才会保证执行。避免这种低级错误
     */
    private static void test2() {
        // 不进入try，finally并不执行
        if (1 == 2) {
            try {
            } finally {
                System.out.println("finally");
            }
        }

//        // 程序终止，finally并不执行
//        try {
//            System.out.println("程序终止！");
//            System.exit(0);
//        } finally {
//            System.out.println("finally");
//        }
    }

    private static void test3() {
        try {
            System.out.println("try");
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    private static String test4() {
        try {
            return "结果";
        } finally {
//            return "finally";
            throw new RuntimeException("Finally异常！");
        }
    }

    private static String test5() {
        try {
            return "结果" + (1 / 0);
        } finally {
            return "finally";
        }
    }

    /**
     * subroutine
     * --  Java 虚拟机会把 finally 语句块作为 subroutine直接插入到 try 语句块或者 catch 语句块的控制转移语句之前。
     * 但是，还有另外一个不可忽视的因素，那就是在执行 subroutine（也就是 finally 语句块）之前，try 或者 catch 语句块
     * 会保留其返回值到本地变量表（Local Variable Table）中。待 subroutine 执行完毕之后，再恢复保留的返回值到操作数
     * 栈中，然后通过 return 或者 throw 语句将其返回给该方法的调用者（invoker）。
     * <p>
     * -- 请注意，前文中我们曾经提到过 return、throw 和 break、continue 的区别，对于这条规则（保留返回值），只适用于
     * return 和 throw 语句，不适用于 break 和 continue 语句，因为它们根本就没有返回值。
     */
    private static String test6() {
        String result = "Hello";
        try {
            return result + " World";
        } finally {
            result += "!!!!";
        }
    }

    public static String test7() {
        try {
            System.out.println("try block");
            return test7X();
        } finally {
            System.out.println("finally block");
        }
    }

    public static String test7X() {
        System.out.println("return statement");
        return "after return";
    }

    /**
     * try-with-resource
     */
    public static void test8() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }
            }
        }

        try (FileInputStream fis2 = new FileInputStream("")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (MyClose close = new MyClose()) {
            close.hello();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static class MyClose implements Closeable {

        public MyClose() throws Exception {
        }

        @Override
        public void close() throws IOException {
            System.out.println("关闭");
        }

        public void hello() {
            System.out.println("Hello");
        }
    }

}
