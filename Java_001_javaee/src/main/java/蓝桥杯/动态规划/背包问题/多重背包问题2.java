package 蓝桥杯.动态规划.背包问题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 二进制优化问题1
 */
public class 多重背包问题2 {

    private final static int N = 2010;
    private static int n,m;
    private static int s;

    private static int[] dp = new int[N];

    private static Good good = new Good();
    private static List<Good> goods = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for(int i = 1; i <= n;i++) {

            good.v = scanner.nextInt();
            good.w = scanner.nextInt();
            s = scanner.nextInt();

            for(int j = 1; j <= s; j*=2){
                s -= j;
                Good good1 = new Good(j * good.v, j * good.w);
                goods.add(good1);
            }
            if(s > 0){
                Good good2 = new Good(s * good.v, s * good.w);
                goods.add(good2);
            }
        }


        for(Good g : goods){
            for(int i = m; i >= g.v; i--){
                dp[i] = Math.max(dp[i], dp[i - g.v] + g.w);
            }
        }

        System.out.println(dp[m]);
    }
}
class Good{
    int v, w;

    public Good() {
    }

    public Good(int v, int w) {
        this.v = v;
        this.w = w;
    }
}
