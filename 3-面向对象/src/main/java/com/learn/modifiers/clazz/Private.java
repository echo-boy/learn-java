package com.learn.modifiers.clazz;

/**
 * Create by WEH on 2018-08-14 19:38
 */
public class Private {

    /*
     * ------------------------------------
     * 如下 name 和 age 属性是"私有"的（private）
     * 只能当前类中访问
     *
     * - 一般，类的属性如果供外部访问，都要设置能私有的
     * 然后，提供对于的get、set方法。
     * 好处就在于
     * - 外部只需关心方法结果，无需关心属性是否存在
     * - 方法中可以加入一定的逻辑
     * - 可以对外屏蔽属性本身，以便于重构
     * ------------------------------------
     */

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age < 18 ? 18 : age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
