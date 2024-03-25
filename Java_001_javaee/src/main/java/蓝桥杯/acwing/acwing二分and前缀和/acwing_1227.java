package 蓝桥杯.acwing.acwing二分and前缀和;
import java.util.*;
public class acwing_1227 {

    private static int n =  100010;
    private static int N, K, H, W, max = 0, cnt = 0;
    private static int[][] sizes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //第一行
        N = scanner.nextInt();
        K = scanner.nextInt();
        // 后n行
        sizes = new int[N][2];
        for(int i = 0 ; i < N; i++){
            H = scanner.nextInt();
            W = scanner.nextInt();
            sizes[i][0] = H;
            sizes[i][1] = W;
            if(max < H){
                max = H;
            }
            if(max < W){
                max = W;
            }
        }

        for(int a = max; a > 0; a--){

            for(int b = 0; b < N; b++){
                cnt += (sizes[b][0]/a) * (sizes[b][1]/a);
            }
            if(cnt >= K){
                System.out.println(a);
                return;
            }else{
                cnt = 0;
            }

        }
    }
}
