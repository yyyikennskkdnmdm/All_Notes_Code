package 蓝桥杯.test_13年真题;

import java.util.Scanner;

public class test_1440_带分数 {

    private static int n;
    private static int res = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
//		int[] arr = {3,6,9,2,5,8,7,1,4};
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        int[] arr = {1,2,3,4};
        quanpailie(arr ,0, 9);
        System.out.println(res);
    }

    public static void returnRes(int[] arr) {

        for(int i = 0; i < 8; i++) {
            for(int j = i + 1; j < 9; j++) {
                int b = toNum(arr, i, j);
                int c = toNum(arr, j, 9);
                int a;
                if(b % c == 0)  a = toNum(arr, 0, i);
                else continue;
                if(a + b / c == n) {
//                    System.out.println("cool");
                    res++;
                }
            }
        }

    }

    public static int toNum(int[] arr, int i, int j) {
        int res = 0;
        for(int k = i ; k < j; k++) {
            res *= 10;
            res += arr[k];
        }
        return res;
    }


    private static int count = 0;
    public static void quanpailie(int[] arr, int i, int j) {
        if(i == j) {
            // 判断
//            System.out.println(count++);
//            for (int e :
//                    arr) {
//                System.out.print(e + " ");
//            }
//            System.out.println();
            returnRes(arr);
            return;
        }else {
            for(int k = i; k < j; k++) {
                swag(arr, i, k);
                quanpailie(arr, i + 1, j);
                swag(arr, i, k);
            }
        }
    }
    public static void swag(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
