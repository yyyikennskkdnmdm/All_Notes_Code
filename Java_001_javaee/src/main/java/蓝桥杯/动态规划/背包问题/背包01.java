package 蓝桥杯.动态规划.背包问题;

import java.util.Scanner;

public class 背包01 {

    private final static int N = 1010;
    private static int n, m;
    private static int[] f = new int[N];
    private static int[] v = new int[N];
    private static int[] w = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for(int i = 1 ; i <= n; i++){
             v[i] = scanner.nextInt();
             w[i] = scanner.nextInt();
        }

        for(int i = 1; i <= n; i++){
            for(int j = m; j >= v[i]; j--){
                f[j] = Math.max(f[j], f[j-v[i]]+w[i]);
            }
        }

        System.out.println(f[m]);


    }


}
