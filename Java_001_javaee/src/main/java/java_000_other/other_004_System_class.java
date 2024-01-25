package java_000_other;

import org.testng.annotations.Test;

/**
 * System.getProperty
 * System.exit
 */
public class other_004_System_class {

    // TODO System.getProperty
    @Test
    public void other_004_System_class_test_001() {
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version:" + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java的home:" + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("os的name:" + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("os的version:" + osVersion);

        String userName = System.getProperty("user.name");
        System.out.println("user的name:" + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("user的home:" + userHome);

        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir:" + userDir);

    }

    // TODO System.exit
    @Test
    public void test(){

        // 编写method方法 ， 输出a = 100 , b = 200
        int a = 10;
        int b = 10;
        method(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    public void method(int a, int b){
        System.out.println("a = " + a * 10);
        System.out.println("b = " + b * 20);
        System.exit(0);
    }


}
