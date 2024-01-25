package 蓝桥杯;

import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test {
    static int n;
    static int m;

    static int flag0 = 0;
    static int flag1 = 101;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        n = scan.nextInt();
        m = scan.nextInt();

        int[][] arr = new int[m][2];
        for(int i = 0 ; i < m; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        Integer[] nums = new Integer[n];
        for(int i = 0 ; i < n; i++){
            nums[i] = i+1;
        }

        int maxq = -1;
        int minq = n + 1;
        for(int i = 0; i < m;i++){
            if(arr[i][0] == 0){
                if(arr[i][1] > flag0){
                    sortPartialDescending(nums, 0,arr[i][1]-1);
                    flag0 = arr[i][1];
                    flag1 = arr[i][1]+1;
                }
            }else{
                if(arr[i][1] < flag1){
                    sortPartialAscending(nums,arr[i][1]-1,n-1);
                    flag0 = arr[i][1]-1;
                    flag1 = arr[i][1];
                }
            }
            System.out.print(i + ":" + arr[i][0] + ":" + arr[i][1] + " == ");
            for(int j = 0; j < nums.length; j++){
                System.out.print(nums[j] + " ");
            }
            System.out.println();

        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        scan.close();
    }

    public static void sortPartialDescending(Integer[] arr, int start, int end) {
        if (start < 0 || end >= arr.length || start >= end) {
            return;
        }
        Arrays.sort(arr, start, end + 1, Comparator.reverseOrder());
    }

    public static void sortPartialAscending(Integer[] arr, int start, int end) {
        if (start < 0 || end >= arr.length || start >= end) {
            return;
        }
        Arrays.sort(arr, start, end + 1);
    }





}

/*
100 100
1 14
1 9
0 78
0 94
0 59
1 39
0 15
1 8
1 44
0 48
1 57
1 12
1 95
1 48
1 19
0 67
0 60
0 30
0 18
1 66
1 74
1 39
1 2
0 2
1 40
0 92
0 26
0 80
0 61
1 49
0 39
0 24
1 25
1 88
0 71
1 70
1 86
0 7
1 78
0 82
1 72
0 30
1 64
0 15
1 99
0 73
0 54
1 3
0 19
1 89
1 27
1 78
0 71
0 75
1 39
0 100
0 8
1 3
0 37
0 14
1 59
1 3
0 86
0 62
1 97
1 24
0 73
1 12
1 39
1 65
0 89
1 84
1 46
0 27
1 18
0 26
0 59
0 93
1 84
0 24
1 97
1 50
1 1
1 25
1 78
1 72
1 3
0 45
1 83
0 87
1 25
1 78
1 88
0 54
0 35
1 43
0 78
1 17
0 59
0 31
*/