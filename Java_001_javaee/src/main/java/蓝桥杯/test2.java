package 蓝桥杯;

import java.math.BigInteger;
import java.util.*;
import java.util.Comparator;

public class test2 {

        public static void main(String[] args) {
            Integer[] arr = {5, 2, 8, 1, 9, 3, 7, 4, 6};
            sortPartialDescending(arr, 2, 7);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }

        public static void sortPartialDescending(Integer[] arr, int start, int end) {
            if (start < 0 || end >= arr.length || start >= end) {
                return;
            }

//            Arrays.sort(arr, start, end + 1, Comparator.reverseOrder());
            Arrays.sort(arr, start, end + 1);

        }




}
