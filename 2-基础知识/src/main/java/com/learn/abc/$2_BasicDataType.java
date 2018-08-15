package com.learn.abc;

/**
 * Create by WEH on 2018-08-14 08:11
 */
public class $2_BasicDataType {

    /*
     * ------------------------------------
     * 基本数据类型
     * - 基本数据类型存储在栈中 —— 变量即本身
     * - （在方法里传基本数据类型的参数，实际上是复制了一份）
     *
     * 一定是栈里吗？ —— 数组就是堆中
     * int[] arr = new int[]{1,2};
     * ------------------------------------
     */
    public static void main(String[] args) {
        /*
         * -------------------
         * 常规定义
         * -------------------
         */
        byte a = 0;
        short b = 1;
        int c = 2;
        long d = 3L; // 'L'不是必须的

        float e = 4.0F; // 当是小数的时候，'F'必须（为了可double区分），整数的时候不必须
        double f = 5.0D; // 'D'不是必须的

        boolean g = false;

        char ch = '哈';

        System.out.println("0: " + a);
        System.out.println("1: " + b);
        System.out.println("2: " + c);
        System.out.println("3L: " + d);
        System.out.println("4.0F: " + e);
        System.out.println("5.0D: " + f);
        System.out.println("false: " + g);
        System.out.println("哈: " + ch);

        /*
         * -------------------
         * 互相转换
         * -------------------
         */
        byte n1 = 1;
        short n2 = n1;
        int n3 = n2;
        long n4 = n3;
        float n5 = n4;
        double n6 = n5;

        // 反过来赋值，就需要强转了。

        n1 = (byte) n2;
        n2 = (short) n3;
        n3 = (int) n4;
        n4 = (long) n5;
        n5 = (float) n6;

        /*
         * -------------------
         * 自动转换
         * -------------------
         */
        short num1 = 1;
        short num2 = 1 + 1;

        // 'short + xxx'会自动提升表达式的类型，结果变成了int
        // 说明，java不鼓励short类型的参与运算
        short num3 = (short) (num1 + 1);
        // += 方式的运算不用强转
        num3 += 1;

        // 同理，byte也是
        byte byte1 = 1;
        byte byte2 = 1 + 1;

        byte byte3 = (byte) (byte1 + 1);

        /*
         * -------------------
         * 包装类
         * - 包转类的存在就是为了要 -- 响应'一切都是对象'的思想
         * - 而且，包装类也提供了一些方法，具体参照各包装类源码
         * -------------------
         */
        // 在java5之前，声明包装了，需要通过new的方式，Java5之后，引入了'自动拆装箱'机制，就可以直接以下面的方式赋值了
        Byte oByte = 0;
        Short oShort = 1;
        Integer oInteger = 2;
        Long oLong = 3L; // 'L'必须

        Float oFloat = 4.0F; // 'F'必须
        Double oDouble = 5.0D; // 'D'不必须

        Boolean oBoolean = Boolean.FALSE;

        Character oChar = ' ';

        /*
         * -------------------
         * 其他
         * -------------------
         */
        Integer compare1 = 126;
        Integer compare2 = 126;

        System.out.println(compare1 == compare2);

        Integer compare3 = 128;
        Integer compare4 = 128;

        System.out.println(compare3 == compare4);


    }

}
