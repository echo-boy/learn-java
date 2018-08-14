package com.learn.modifiers.clazz.inner;

/**
 * Create by WEH on 2018-08-14 19:49
 */
public class InnerPublic {

    /*
     * 当前类【InnerPublic】的访问级别是"public"的，可在项目任意地方访问（即使用）
     */

    /*
     * InnerDefault的访问级别是"default"，和当前类是同一个包下，可以访问
     */
    void accessDefault() {
        InnerDefault innerDefault = new InnerDefault();
    }

}
