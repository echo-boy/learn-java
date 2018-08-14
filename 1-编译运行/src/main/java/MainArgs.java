/**
 * Create by WEH on 2018-08-11 19:01
 */
public class MainArgs {

    /**
     * 多个参数逗号隔开：
     * -  javac MainArgs.java
     * -  java MainArgs a b c
     * 输出：
     * -  参数1：a
     * -  参数1：b
     * -  参数1：c
     */
    public static void main(String[] args) {
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("参数" + (i + 1) + "：" + args[i]);
            }
        }
    }

}
