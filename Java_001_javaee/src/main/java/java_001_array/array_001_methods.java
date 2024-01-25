package java_001_array;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 记录数组的使用方法、以及一些例子。
 */
public class array_001_methods {

    // TODO  1. new出来的结构都放在堆里 ， 栈中存放局部变量
    @Test
    public void test_001() {
        int[] arr001 = {1,2,3,4,5,6,7,8,9};

        int[] arr002 = {1,2,3,4,5,6,7,8};

        // TODO 1 长度
        int length = arr001.length;
        System.out.println("length = " + length);

        // TODO 2 equals:判断两个数组是否相等
        boolean equals = Arrays.equals(arr001, arr002);
        System.out.println("equals = " + equals);

        // TODO 3 toString
//        String s = arr001.toString();// s = [I@d1d3979b
        String s = Arrays.toString(arr001);
        System.out.println("s = " + s);

        // TODO 4 fill：填充函数
        Arrays.fill(arr001, 6);
        String s1 = Arrays.toString(arr001);
        System.out.println("s1 = " + s1);


        // TODO 5 binarySearch : 二分查找
        int index = Arrays.binarySearch(arr002, 4);
        System.out.println("index = " + index);

    }


}
