package 蓝桥杯.test_13年真题;
import java.util.*;
public class test_1442_打印十字图 {
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int N = 4*n+5;
        char g[][] = new char[N][N];
        int l = 2, r = N - 3;
        g[0][0] = g[0][1] = g[0][N-1] = g[0][N-2] = g[N-1][0] = g[N-1][1] = g[N-1][N-1] = g[N-1][N-2] = '.';
        while(l <= r){
            g[0][l] = g[0][r] = g[N-1][l] = g[N-1][r] = '$';
            l++;
            r--;
        }

        g[1][0] = g[1][1] = g[1][N-1] = g[1][N-2] = g[N-2][0] = g[N-2][1] = g[N-2][N-1] = g[N-2][N-2] = '.';
        g[1][2] = g[1][N-3] = g[N-2][2] = g[N-2][N-3] = '$';
        l = 3; r = N - 4;
        while(l <= r){
            g[1][l] = g[1][r] = g[N-2][l] = g[N-2][r] = '.';
            l++;
            r--;
        }

        int k = 2;
        while(k < N - 2){
            g[k][0] = g[k][N-1] = '$';
            k++;
        }

        l = 1; r = N -2;
        int i = 2, j = N - 3;
        while(i <= j){
            l = 1; r = N -2;
            while(l <= r){
                if(g[i-1][l-1] == '.') g[i][l] = '$';
                else g[i][l] = '.';
                if(g[i-1][r+1] == '.') g[i][r] = '$';
                else g[i][r] = '.';
                if(g[j+1][l-1] == '.') g[j][l] = '$';
                else g[j][l] = '.';
                if(g[j+1][r+1] == '.') g[j][r] = '$';
                else g[j][r] = '.';
                l++;
                r--;
            }
            i++;
            j--;
        }

        for(int i1 = 0 ; i1 < N; i1++){
            for(int j1= 0; j1 < N; j1++){
                System.out.print(g[i1][j1]);
            }
            System.out.println();
        }

    }
}
