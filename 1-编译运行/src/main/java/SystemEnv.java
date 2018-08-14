import java.util.Map;

/**
 * Create by WEH on 2018-08-11 20:12
 */
public class SystemEnv {

    /**
     * 系统环境变量
     */
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("系统环境变量");
        System.out.println("-----------------------");

        System.out.println("-------------");
        System.out.println("获取单个：");
        System.out.println("-------------");
        System.out.println("    JAVA_HOME: " + System.getenv("JAVA_HOME"));
        System.out.println("    M2_HOME  : " + System.getenv("M2_HOME"));
        System.out.println();

        System.out.println("-------------");
        System.out.println("获取所有：");
        System.out.println("-------------");
        Map<String, String> systemEnv = System.getenv();
        for (String key : systemEnv.keySet()) {
            System.out.println(String.format("%1$30s: %2$s", key, systemEnv.get(key)));
        }
    }

}
