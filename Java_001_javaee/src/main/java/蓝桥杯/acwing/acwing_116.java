package 蓝桥杯.acwing;

import java.util.Scanner;

public class acwing_116 {

    private final static int N = 20;
    private static char[][] input = new char[4][4];
    private static char[][] backup = new char[4][4];
    private static int[][] output = new int[N][2];
    private static int min = 20;
    public static void copy(){
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4; j++){
                input[i][j] = backup[i][j];
            }
        }
    }
    public static boolean check(){
        for(int i = 0 ; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(input[i][j] == '+'){
                    return false;
                }
            }
        }
        return true;
    }

    public static void change_one(int x,int y){
        for(int i = 0 ; i < 4; i++){
            if(input[x][i] == '+') input[x][i] = '-';
            else input[x][i] = '+';
            if(input[i][y] == '+') input[i][y] = '-';
            else input[i][y] = '+';
        }
        if(input[x][y] == '+') input[x][y] = '-';
        else input[x][y] = '+';
    }

    public static void main(String[] args) {
//        System.out.println(1 << 17);
//        System.out.println(1 + 4 + 8 + (1 <<  15) + (1 << 14) + (1 << 12));
//        for(int i = 0; i < 16; i++){
//            int temp = (1 + 4 + 8 + (1 <<  15) + (1 << 14) + (1 << 12));
//            if(i % 4 == 0) System.out.println();
//            System.out.print((temp >> i) & 1);
//        }
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 4; i++){
            backup[i] = scanner.next().toCharArray();
        }
        copy();

        for(int i = (1 + 4 + 8 + (1 <<  15) + (1 << 14) + (1 << 12)) ; i < (1 << 17) ; i++){
            copy();
//            System.out.println("i = " + i);
            int cnt = 0;
            for(int j = 0 ; j < 16; j++){
                if(((i >> j) & 1) == 1){
                    cnt++;
                    // 当前位置为1的时候按开关
                    change_one(j / 4, j % 4);
                }
            }

            boolean temp = check();
            if(temp == true && cnt < min){
//                System.out.println("i = " + i);
                min = cnt;
                int count = 0;
                for(int j = 0 ; j < 16; j++){
                    if(((i >> j) & 1) == 1){
                        output[count][0] = j / 4 + 1;
                        output[count++][1] = j % 4 + 1;
                    }
                }
            }
        }

        // output
        System.out.println(min);
        for(int i = 0 ; i < min; i++){
            System.out.println(output[i][0] + " " + output[i][1]);
        }


//        for(int i = 0 ; i < 4; i++){
//            for(int j = 0 ; j < 4; j++){
//                System.out.print(input[i][j]);
//            }
//            System.out.println();
//        }
    }


}
