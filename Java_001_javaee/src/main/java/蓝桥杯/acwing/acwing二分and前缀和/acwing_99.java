package 蓝桥杯.acwing.acwing二分and前缀和;
import java.util.*;
public class acwing_99 {
    private static int N, R;
    private static int X, Y, W;
    private static int[][] W1 = new int[5000][5000];
    private static int max_w = 0, temp_w = 0;
    private static int x, y;
    public static void main(String[] args) {
        // input
        Scanner scanner
                = new Scanner(System.in);
        N = scanner.nextInt();
        R = scanner.nextInt();
        for(int i = 0 ; i < N; i++){
            X = scanner.nextInt();
            Y = scanner.nextInt();
            W = scanner.nextInt();
            W1[X][Y] = W;
            x = Math.max(x, X);
            y = Math.max(y, Y);
        }
        int wx = x - R + 2, wy = y - R + 2;
        for(int i = 0; i < wx; i++){
            for(int j = 0 ; j < wy; j++){
                // 计算w
                for(int k = 0 ; k < R; k++){
                    for(int q = 0; q < R; q++){
                        temp_w += W1[i+k][j+q];
                    }
                }
                if(temp_w > max_w) max_w = temp_w;
                temp_w = 0;
            }
        }
        System.out.println(max_w);
    }
}
