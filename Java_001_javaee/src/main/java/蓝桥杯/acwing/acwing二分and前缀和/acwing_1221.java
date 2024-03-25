package 蓝桥杯.acwing.acwing二分and前缀和;

import java.util.*;

public class acwing_1221 {
    private static int N = 5000010;
    private static int m;

    private static int[] outputs = new int[4];
    public static int toMin(int n){
        int i;
        for(i = 0 ; i*i < n; i++);
        return i;
    }
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();

        // 缩小范围
        int n = toMin(m);
        System.out.println(n);
        for(int a = 0; a <= n; a++){
            for(int b = a; b <= n; b++){
                for(int c = b; c <= n; c++){
                    for(int d = c; d <= n; d++){
                        if(a*a + b*b + c*c + d*d == m){
                            System.out.println(a + " " + b + " " + c + " " + d);
                            return;
                        }
                    }
                }
            }
        }


    }

}
