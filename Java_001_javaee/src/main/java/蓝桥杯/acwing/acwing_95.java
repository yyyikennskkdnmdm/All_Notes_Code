package 蓝桥杯.acwing;

import org.testng.annotations.Test;

import java.util.*;

public class acwing_95 {


    private final static int N = 6;
    private static char[][] g = new char[N][N];
    private static char[][] backup = new char[N][N];
    private static int[] dx = {-1, 0, 1, 0, 0}, dy = {0, 1, 0, -1, 0};

    public static void turn(int x, int y){
        for(int i = 0 ; i < 5; i++){
            int a = x + dx[i], b = y + dy[i];
            if(a < 0 || a >= 5 || b < 0 || b >= 5) continue;
            g[a][b] ^= 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-- > 0){
            for(int i = 0; i < 5; i++){
                g[i] = scanner.next().toCharArray();
            }
            int res = 10;
            // 第一行的一共有32种方法
            for(int op = 0; op < 32; op++){
                // 复制数组
                for(int i = 0 ; i < 5;i++){
                    for(int j = 0 ; j < 5; j++){
                        backup[i][j] = g[i][j];
                    }
                }

                int step = 0;
                // 32中方法都尝试一遍
                for(int i = 0 ; i < 5; i++){
                    if((op >> i & 1) == 1){
                        step++;
                        turn(0, i);
                    }
                }
                // 如果上一个方块是灭的，那么必须将当前方块的下方方块点亮才可以
                for(int i = 0 ; i < 4; i++){
                    for(int j = 0 ;j < 5; j++){
                        if(g[i][j] == '0'){
                            step++;
                            turn(i+1,j);
                        }
                    }
                }

                boolean dark = false;
                for(int i = 0; i < 5; i++){
                    if(g[4][i] == '0'){
                        dark = true;
                        break;
                    }
                }
                if(dark == false) res = Math.min(res, step);
                // 复制数组
                for(int i = 0 ; i < 5;i++){
                    for(int j = 0 ; j < 5; j++){
                        g[i][j] = backup[i][j];
                    }
                }

            }
            if(res > 6) res = -1;
            System.out.println(res);
        }



    }

}


