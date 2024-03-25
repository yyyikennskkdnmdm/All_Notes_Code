package 蓝桥杯.acwing;


import java.util.*;

public class acwing_92 {

    private final static int N = 16;
    private static int n;
    private static int[] st = new int[N];


    public static void dfs(int u){
        if(u > n){
            ArrayList<Integer> way = new ArrayList<>();
            for(int i = 1; i <= n;i++){
                if(st[i] == 1){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            return;
        }
        st[u] = 2;
        dfs(u+1);
        st[u] = 0;

        st[u] = 1;
        dfs(u+1);
        st[u] = 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        dfs(1);
    }

}
