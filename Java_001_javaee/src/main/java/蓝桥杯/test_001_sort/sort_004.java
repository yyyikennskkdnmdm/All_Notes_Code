package 蓝桥杯.test_001_sort;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// https://www.lanqiao.cn/problems/391/learning/?page=1&first_category_id=1&tags=%E6%8E%92%E5%BA%8F&sort=problem_id&asc=1   AC
public class sort_004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //在此输入您的代码...

        int n = in.nextInt();

        int a = in.nextInt() , b = in.nextInt();

        int [][]arr = new int [n][2];


        for(int i = 0; i < n ; i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr , Comparator.comparingInt(o -> o[0] * o[1]));

        BigInteger ans = new BigInteger("-1") , sum = new BigInteger(String.valueOf(a));


        // 注意：使得获得奖赏最多的大臣，所获奖赏尽可能的少
        // 错误理解：奖赏最多的大臣是在最后一个，实际上不是的，奖赏最多的大臣也可能在中间
        for(int i = 0 ; i < n ; i++){
            ans = ans.max(sum.divide(new BigInteger(String.valueOf(arr[i][1]))));
            sum = sum.multiply(new BigInteger(String.valueOf(arr[i][0])));
        }

        System.out.println(ans);

        in.close();
    }
}
