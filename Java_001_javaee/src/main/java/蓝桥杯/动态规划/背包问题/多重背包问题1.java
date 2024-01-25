package 蓝桥杯.动态规划.背包问题;

import java.util.Scanner;

/**
 * 每个物品只能装s[i]件
 */
public class 多重背包问题1 {

    private final static int N = 110;
    private static int n,m;
    private static int v, w, s;

    private static int[] dp = new int[N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for(int i = 1; i <= n;i++){

            v = scanner.nextInt();
            w = scanner.nextInt();
            s = scanner.nextInt();
            for(int j = m; j >= v; j--){
                for(int k = 1; k <= s && k * v <= j; k++){
                    dp[j] = Math.max(dp[j], dp[j - k * v] + k * w);
                }
            }


        }

        System.out.println(dp[m]);
    }

}
