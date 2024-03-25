package java_004_String_StringBuffer_STringBuilder_Date.common_002_StringBuffer.StringBuffer_001_method;

import org.testng.annotations.Test;

public class method_001_req_use {

    @Test
    public void method_001_req_use_test_001() {
        // TODO java.lang.StringBuffer代表可变的字符序列，
        StringBuffer stringBuffer = new StringBuffer();

        // TODO 增删改查
        StringBuffer append = stringBuffer.append("1.append()--");
        System.out.println("append = " + append);

        StringBuffer delete = stringBuffer.delete(0, 1);
        System.out.println("delete = " + delete);

        StringBuffer replace = stringBuffer.replace(0, 1, "A");
        System.out.println("replace = " + replace);

        StringBuffer insert = stringBuffer.insert(0, "insert()");
        System.out.println("insert = " + insert);

        StringBuffer reverse = stringBuffer.reverse();
        System.out.println("reverse = " + reverse);


        // indexOf(string)
        // substring(start, end)
        // charAt(n)
        // setCharAt(n, char)
    }
}