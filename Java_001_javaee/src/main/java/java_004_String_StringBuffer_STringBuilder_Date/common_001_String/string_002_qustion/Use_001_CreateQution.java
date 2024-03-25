package java_004_String_StringBuffer_STringBuilder_Date.common_001_String.string_002_qustion;

import org.testng.annotations.Test;

public class Use_001_CreateQution {

    @Test
    public void Use_001_CreateQution_test_001() {
        // TODO 判断字符串
        String s1 = "hello"; // 常量池
        String s2 = "world"; // 常量池
        String s3 = "hello" + "world"; // 常量池

        String s4 = s1 + "world"; // 堆中  TODO 新创建的对象
        System.out.println(" s4 == s3 = " +  (s3 == s4)); // false


        String s5 = s1 + s2; // 堆
        System.out.println(" s5 == s3 = " +  (s5 == s3)); // false
        System.out.println(" s5 == s4 = " +  (s5 == s4)); // false



        String s6 = (s1 + s2).intern(); // 常量池 TODO 如果拼接的结果调用intern()方法，返回值就在常量池中
        System.out.println(" s6 == s3 = " + (s6 == s3)); // true

    }

}
