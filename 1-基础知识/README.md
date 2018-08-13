# JAVA-ABC

## Java基础知识

### Java特点：

* 面向对象
    * 封装
    * 
    * 封装
* 健壮
    * 强类型机制
    * 垃圾的自动收集
    * 异常处理
    * 安全检查机制
    * ...
* 动态<br>
    * 类加载器
    * 反射
* 可移植

### 运行环境
> JDK （包含） JRE （包含） JVM
 
     JDK： java development kit
         Java开发工具包，开发环境必须
     JRE： java runtime environment
         Java运行环境，只用于运行Java程序，不能编译和调试等开发环境功能
     JVM： java virtual machine
         Java虚拟机
   
   ```PS：一个只是运行Java服务的环境只需JRE（bin目录包含'java'）。```

### 执行

> 命令：javac java

     1）将.java文件编译为.class文件
         javac Test.java
     2）运行.class文件
         java Test

### 入口
    
> 包含main函数的类

     传参数
         java Test 1 2 3
     main方法的String[] args会接收到参数

### 命名规范

> 大小写敏感

* 包名全部由小写字母组成
* 类名首字母大写，多个单词的话，每个单词首字母都大写（HelloWorld）。
* 方法名/属性名首字母小写，多个单词组成的话后面单词首字母大写
* 标识符
    * 只能由 字母、数字、_（下划线）、$ 符号组成
    * 不能以数字开头
    * 不能使用JAVA中的关键字（每个语言的关键字都差不多）

### 类结构

`HelloWorld.java`-示例
```java
package com.hello.world;

/**
 * Hello World DEMO
 */
public class HelloWorld {

    /**
     * say hello wrold
     */
    public void hello() {
        /*
         * 方法内多行注释
         */
        
        // 真正要执行的语句
        System.out.println("Hello World!");
    }

}
class AnotherClass {
    
}
```

* 类文件————类名.java
    > 一个类文件中最多只能定义一个public类（除内部类外），且这个类名必须与文件名一致<br>
    可以定义多个非public类，类名符合命名规范即可
* package
    > 包名，都是小写字母
* 类注释
* 类声明
* 类成员（属性、方法、内部类）
* Java真正执行的是语句，每个语句都以分号";"结尾
* 注释 - Java编译器自动忽略注释
    * 单行注释：//
    * 多行注释：/* */
    * 文档注释：/** */  - 写在类和方法的定义之上

### 数据类型和变量定义

变量：相对于常量，表示不确定的值或对于值的一个引用符号。可以代表某个基本数据类型或者指向一个对象。

> Java中变量必须先定义后使用

定义:

    变量类型 变量名 = 变量值;

    // 变量可以赋值，然后可以之后再修改其值即重新赋值。

TODO 这儿感觉可以在之前补充一下类加载过程，然后说一下Java的内存模型，这儿说一下变量声明赋值过程。









