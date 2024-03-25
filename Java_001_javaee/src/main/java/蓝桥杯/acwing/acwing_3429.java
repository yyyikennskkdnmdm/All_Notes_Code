package 蓝桥杯.acwing;


import java.util.*;

public class acwing_3429 {
    private final static int N = 6;
    private static boolean[] flag = new boolean[N];
    private static int cnt = 0, n;

    private static char[] inputs = new char[N];
    private static char[] res = new char[N];

    // 输入的是字符串
    public static void dfs(int u){

        if(u > n){
            for(int i = 0 ; i < n ;i++){
                System.out.print(res[i]);
            }
            System.out.println();
            return;
        }

        for(int i = 0 ; i < n; i++){
            if(flag[i] == false){
                res[cnt++] =  inputs[i];
                flag[i] = true;
                dfs(u+1);
                flag[i] = false;
                cnt--;
            }
        }
    }

    // 输入的是数字
    public static void dfs2(int u){
        if(u > n){
            for(int i = 0 ; i < n; i++){
                System.out.print(res[i]);
            }
            System.out.println();
            return;
        }
        for(int i = 0 ; i < n; i++){
            if(flag[i] == false){
                res[cnt++] = (char)(i + '1');
                flag[i] = true;
                dfs2(u+1);
                flag[i] = false;
                cnt--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        //输入
//        String input = scanner.next();
//        inputs = input.toCharArray();
//
//        n = input.length();
//        dfs(1);

        n = scanner.nextInt();
        dfs2(1);


    }
}
