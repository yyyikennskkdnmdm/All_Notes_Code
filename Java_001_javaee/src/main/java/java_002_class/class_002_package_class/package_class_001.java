package java_002_class.class_002_package_class;

import org.testng.annotations.Test;

public class package_class_001 {


    @Test
    public void test_001(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // flase:使用new，则编译器会创建新的对象

        Integer n = 1;
        Integer m = 1;
        System.out.println(n == m);//true，采用自动装箱，编译器会将自动装箱的所有的相同数值的变量指向同一个地址。


        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);// 自动装箱Integer的范围为-128 - 127，所以对于128的自动装箱编译器会创建新的对象。
    }
}
