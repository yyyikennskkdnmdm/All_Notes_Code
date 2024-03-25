package 蓝桥杯.acwing;

import java.util.*;

public class acwing_94 {
    private final static int N = 16;
    private static int n;
    private static int[] st = new int[N];

    private static int cnt = 0,layer = 0, cnt2 = 0;

    private static int[] res = new int[N];
    public static void dfs(int u){
        if(cnt2 == n){
            for(int i = 0 ; i < n; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }

        for(int i = 1 ; i <= n; i++){

            if(st[i] == 0){
                st[i] = 1;
                res[cnt2++] = i;
                dfs(1);
                st[i] = 0;
                cnt2--;
            }


        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        dfs(1);
    }
}
