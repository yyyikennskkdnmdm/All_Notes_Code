package 蓝桥杯.test_001_sort;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;
//https://www.lanqiao.cn/problems/359/learning/?page=1&first_category_id=1&tags=%E6%8E%92%E5%BA%8F

// TODO 未解决：2个ac，三个超时
public class sort_003 {

    static int n;
    static int m;
    static int[] numbers;
    static int[] colors;
    public static void main(String[] args) {
        // TODO 初始化
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        numbers = new int[n];
        colors = new int[n];
        for(int i = 0 ; i < n;i++){
            numbers[i] = scanner.nextInt();
        }
        scanner.nextLine();
        for(int i = 0 ; i < n; i++){
            colors[i] = scanner.nextInt();
        }

//        System.out.println(n);
//        System.out.println(m);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(colors));


        int result = 0;
        for(int i = 0 ; i < n - 2; i++){
            for(int j = i+2; j < n; j+=2){
                if(colors[j] == colors[i]){
                    //表示满足条件的三元组
                    int temp = (i+j+2)*(numbers[i]+numbers[j]);
                    result += temp;
                    result = result%10007;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
