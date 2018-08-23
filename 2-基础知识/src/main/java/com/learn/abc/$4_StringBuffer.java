package com.learn.abc;

/**
 * Create by WEH on 2018-08-22 10:06
 */
public class $4_StringBuffer {

    /**
     * javap -c com.learn.abc.\$4_StringBuffer
     */

    public static void main(String[] args) {
        String s1 = "aaaaa";
        String s2 = "bbbbb";
        StringBuilder r = null;
        int i = 3694;
        r = new StringBuilder(s1 + i + s2);

        for (int j = 0; j < 10; j++) {
            r.append("23124");
        }

        System.out.println(r);
    }

}
