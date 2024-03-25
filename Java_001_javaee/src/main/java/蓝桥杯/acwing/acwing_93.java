package 蓝桥杯.acwing;

import java.util.ArrayList;
import java.util.*;
public class acwing_93 {
    private final static int N = 16;
    private static int n,m;
    private static int[] st = new int[N];

    private static int cnt = 0;

    public static void dfs(int u){
        if(u > n+1){
            return;
        }
        if(cnt == m){
            for(int i = 1; i <= n;i++){
                if(st[i] == 1){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }


        for(int i = 0 ; i+u <= n; i++){
            st[u+i] = 1;
            cnt++;
            dfs(u+1+i);
            cnt--;
            st[u+i] = 0;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        dfs(1);
    }
}
