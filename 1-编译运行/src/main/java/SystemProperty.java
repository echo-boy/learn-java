import java.util.Properties;
import java.util.Set;

/**
 * Create by WEH on 2018-08-11 19:11
 */
public class SystemProperty {

    /**
     * JVM系统变量
     */
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("JVM系统变量");
        System.out.println("-----------------------");

        System.out.println("-------------");
        System.out.println("获取单个：");
        System.out.println("-------------");
        System.out.println("    系统用户名     ：" + System.getProperty("user.name"));
        System.out.println("    系统名称       ：" + System.getProperty("os.name"));
        System.out.println("    Java版本      ：" + System.getProperty("java.version"));
        System.out.println("    Jre目录       ：" + System.getProperty("java.home"));
        System.out.println("    临时文件目录    ：" + System.getProperty("java.io.tmpdir"));
        System.out.println();

        System.out.println("-------------");
        System.out.println("枚举所有：");
        System.out.println("-------------");
        Properties properties = System.getProperties();
        Set<Object> keys = properties.keySet();
        for (Object key : keys) {
            System.out.println("    " + key.toString() + "=" + properties.get(key));
        }
        System.out.println();

        // java -Duser.weh.arg1=参数1 SystemProperty
        // 如果放在启动类后面，则不是JVM系统属性，而是main函数的参数
        // java SystemProperty -Duser.weh.arg1=参数1
        System.out.println("-------------");
        System.out.println("获取自定义：");
        System.out.println("-------------");
        System.out.println("    自定义参数1：" + System.getProperty("user.weh.arg1", "默认值"));
        System.out.println("    自定义参数2：" + System.getProperty("user.weh.arg2", "默认值"));
        // 或者 System.setProperty
        System.out.println("System.setProperty...");
        System.setProperty("user.weh.arg3", "自定义参数");
        System.out.println("    自定义参数2：" + System.getProperty("user.weh.arg3"));
    }

}
