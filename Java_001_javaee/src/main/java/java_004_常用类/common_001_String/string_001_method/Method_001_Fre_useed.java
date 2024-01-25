package java_004_常用类.common_001_String.string_001_method;

import org.testng.annotations.Test;

public class Method_001_Fre_useed {

    @Test
    public void Method_001_Fre_useed_test_001(){
        String test_String = new String("abcdefghijklmnopqrstuvwxyz");
        // length()
        // charAt()
        char c = test_String.charAt(3);

        // isEmpty()
        // toLowerCase()
        // toUpperCase()
        String toUpperCase_test_String = test_String.toUpperCase();
        // trim() ： 去除前后空格
        // equals
        // equalsIgnoreCase:忽略大小写的equals
        boolean equals = test_String.equalsIgnoreCase(toUpperCase_test_String);

        // concat拼接，相等于+
        // compareTo: 比较两个字符串长短
        // substring 获取子串
        String substring_10_to_end = test_String.substring(10);
        String substring_10_to_20 = test_String.substring(10, 20);

        // endsWith(String) : 是否以String结尾
        // startsWith(string) ：是否以string开始
        boolean startsWith = test_String.startsWith("abcd");
        boolean startsWith1 = test_String.startsWith("bcd", 1);


        // contains(sting)：是否包含string
        // indexOf(string):string第一次出现的索引
        int indexOf = test_String.indexOf("f");
        int indexOf1 = test_String.indexOf("r", 1);// 从start开始索引

        // lastIndexOf(string) or (string, end):从end开始反向索引


        String test_replace = new String("replacestart__replacestart__replacestart");
        // replace:替换
        String replace = test_replace.replace("start", "end");
        System.out.println("replace = " + replace);
        // String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
        // String replaceAll(String regex, String replacement) ： 使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
        // String replaceFirst(String regex, String replacement) ： 使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串。

        // matches(regex):是否匹配正则表达式
        // split(regex)：根据正则表达式拆分字符串
        // split(regex,limit)：根据正则表达式拆分字符串，最多分为limit个



    }

}
