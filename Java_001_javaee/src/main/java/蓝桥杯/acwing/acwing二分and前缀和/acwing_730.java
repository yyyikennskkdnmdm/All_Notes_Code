package 蓝桥杯.acwing.acwing二分and前缀和;

import java.util.Scanner;

public class acwing_730 {
    private static int N = 100010;
    private static int n;
    private static int l = 0, r = 100000,mid;
    private static int[] inputs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        inputs = new int[n];

        for(int i = 0 ; i < n; i++){
            inputs[i] = scanner.nextInt();
        }

        while(l < r){
            mid = (l+r)/2;
            if(check(mid)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        System.out.println(l);

    }

    public static boolean check(int e){

        for(int i = 0 ; i < n; i++){
            e = 2*e - inputs[i];
            if(e < 0) return false;
            if(e > 10000) return true;
        }
        return true;

    }
}
