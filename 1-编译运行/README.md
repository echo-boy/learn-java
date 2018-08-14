# JAVA-RUN

## Java编译运行

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
         
            源代码文件*.java
                -> 词法分析器
                -> tokens流
                -> 语法分析器
                -> 语法树/抽象语法树
                -> 语义分析器
                -> 注解抽象语法树
                -> 字节码生成器
                -> JVM字节码文件*.class
     2）运行.class文件
         java Test
            
            类的一生（类加载过程）：
                加载：
                    将class文件加载到内存中，并将这些静态数据转换成方法区中的运行时
                    数据结构，在堆中生成一个代表这个类的java.lang.Class对象，作为
                    方法区类数据的访问入口，这个过程需要类加载器参与。
                链接
                    将java类的二进制代码合并到JVM的运行状态之中的过程
                    　　* 验证：确保加载的类信息符合JVM规范，有没有安全方面的问题
                    　　* 准备：正式为类变量（static变量）分配内存并设置类变量初始值
                    　　* 解析：虚拟机常量池的符号引用替换为字节引用过程
                初始化
                    * 初始化阶段是执行类构造器<clinit>（）方法的过程。类构造器<clinit>（）方法是由
                        编译器自动收藏类中的所有类变量的赋值动作和静态语句块(static块)中的语句合并产生
                    * 当初始化一个类的时候，如果发现其父类还没有进行过初始化，则需要先触发其父类的初始化
                    * 虚拟机会保证一个类的<clinit>（）方法在多线程环境中被正确加锁和同步
                    * 当访问一个Java类的静态域时，只有真正声名这个域的类才会被初始化
                使用
                卸载（动态加载才有卸载一说）
                    卸载条件：三个引用消失
                    * 类加载器引用
                    * 类Class对象引用
                    * 类对象引用
                    
![aratar](https://images0.cnblogs.com/i/325852/201403/111825528931093.png)
            
            类加载器
                - 其实也是Java类。有四大类：
                根加载器 Bootstrap Class Loader
                扩展加载器 Extension Class Loader
                系统应用加载器 APP Class Loader
                用户自定义加载器 Customer Class Loader
            


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









