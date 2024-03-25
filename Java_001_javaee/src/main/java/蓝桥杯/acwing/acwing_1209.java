package 蓝桥杯.acwing;

import java.util.*;

public class acwing_1209 {



    //    带分数
    public static int ans;
    public static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int n;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt(); // 100
        dfs(0, numbers);
        // 输出结果
        System.out.println(ans);
    }

    // 将数组全排列
    private static void dfs(int k, int[] nums) {
        if (k == 9) {
            check(nums); // 将每种排列进行检查
            return;
        }
        for (int i = k; i < 9; i++) {
            // 交换
            swap(i, k, nums);
            // 递归
            dfs(k + 1, nums);
            // 回溯
            swap(i, k, nums);
        }

    }


    // 检查该排列的数组是否有解
    private static void check(int[] nums) {
        for(int i = 0; i < 7; i++) {    // 将 + 和 / 插入到numbers数组中，  有8个空位可以插入， / 占一位， 剩下7个位置插入 +
            int num1 = toInt(nums, 0, i); // 带分数前面的整数
            if (num1 >= n) { // 如果带分数前面的整数超过了  n, 后面加多少都是不符合的。  这里可以查询提高效率
                return;
            }
            for (int j = i + 1; j <= 7; j++) {
                int num2 = toInt(nums, i + 1, j);     // 带分数后面整数的分子
                int num3 = toInt(nums, j + 1, 8);    // 带分数后面整数的分母
                if (num2 % num3 == 0 && num2 / num3 + num1 == n) { // 判断后面的分数是否可以整除， 且该排列是否符合题目条件
                    ans++;
                }
            }
        }

    }

    // 将下标对应的数组 合成 一个整数。
    private static int toInt(int[] nums, int i, int i2) {
        int result = nums[i];
        while (i < i2) {
            result *= 10;
            result += nums[i + 1];
            i++;
        }
        return result;
    }

    private static void swap(int i, int k, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
    }

}
