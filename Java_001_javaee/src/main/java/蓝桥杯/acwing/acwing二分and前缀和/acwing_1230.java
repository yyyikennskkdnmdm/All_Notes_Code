package 蓝桥杯.acwing.acwing二分and前缀和;
import java.util.*;
public class acwing_1230 {

    private static int[] nums = new int[100010];
    // sums表示nums的前缀和,sums[i]表示nums[0]...nums[i-1]的前缀和
    private static int[] sums = new int[100010];

    private static int n, k,res;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        for(int i = 0 ; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        toSums();
        res = 0;
        judge();
        System.out.println(res);
    }
    public static void toSums(){
        for(int i = 1; i < n + 1; i++){
            sums[i] = sums[i-1] + nums[i-1];
        }
    }

    public static void judge(){
        for(int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                if ((sums[j] - sums[i]) % k == 0){
                    res++;
                }
            }
        }



    }


}
