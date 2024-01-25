package 蓝桥杯.test_12届真题;
import java.util.*;


// https://www.lanqiao.cn/problems/1458/learning/?page=1&first_category_id=1&second_category_id=3&name=%E5%8F%8C%E5%90%91%E6%8E%92%E5%BA%8F
// https://www.acwing.com/problem/content/3422/

// 正确，但超时
public class test_mid003 {
    static int N = 100010;
    static int n, m;
    static PII[] stk = new PII[N];
    static int[] ans = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int top = 0;//栈顶

        while (m -- > 0) {

            int p = sc.nextInt();
            int q = sc.nextInt();

            if (p == 0) {
                //求出连续操作的最长前缀
                while (top != 0 && stk[top].x == 0) q = Math.max(q, stk[top -- ].y);
                //优化三
                while (top >= 2 && stk[top - 1].y <= q) top -= 2;
                stk[ ++ top] = new PII(0, q);
            } else if (top != 0) {
                //求出连续操作的最长后缀
                while (top != 0 && stk[top].x == 1) q = Math.min(q, stk[top --].y);
                //优化三
                while (top >= 2 && stk[top - 1].y >= q) top -= 2;
                stk[ ++ top] = new PII(1, q);
            }
        }

        //k是递减变量，l为左边界，r为右边界
        int k = n, l = 1, r = n;
        for (int i = 1; i <= top; i ++ ) {
            if (stk[i].x == 0) {
                //若为前缀操作，则(stk[i].y, r]不用操作，直接填数
                while (r > stk[i].y && l <= r) ans[r -- ] = k --;
            } else {
                //若为后缀操作，则[l, stk[i].y)不用操作，直接填数
                while (l < stk[i].y && l <= r) ans[l ++ ] = k --;
            }
            if (l > r) break;
        }

        //若l < r, 表示中间还有些数没有填上，操作次数为奇数，则下一次操作为前缀操作
        if (top % 2 == 1) {
            while (l <= r) ans[l ++ ] = k --;
        } else {
            while (l <= r) ans[r -- ] = k --;
        }

        for (int i = 1; i <= n; i ++ ) System.out.print(ans[i] + " ");
    }

    static class PII {
        int x, y;

        public PII(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
//100 100
//        1 14
//        1 9
//        0 78
//        0 94
//        0 59
//        1 39
//        0 15
//        1 8
//        1 44
//        0 48
//        1 57
//        1 12
//        1 95
//        1 48
//        1 19
//        0 67
//        0 60
//        0 30
//        0 18
//        1 66
//        1 74
//        1 39
//        1 2
//        0 2
//        1 40
//        0 92
//        0 26
//        0 80
//        0 61
//        1 49
//        0 39
//        0 24
//        1 25
//        1 88
//        0 71
//        1 70
//        1 86
//        0 7
//        1 78
//        0 82
//        1 72
//        0 30
//        1 64
//        0 15

//        1 99  8

//        0 73  7
//        0 54
//        1 3
//        0 19
//        1 89
//        1 27
//        1 78
//        0 71
//        0 75
//        1 39

//        0 100  1
//        0 8
//        1 3
//        0 37
//        0 14
//        1 59
//        1 3
//        0 86
//        0 62
//        1 97
//        1 24
//        0 73
//        1 12
//        1 39
//        1 65
//        0 89
//        1 84
//        1 46
//        0 27
//        1 18
//        0 26
//        0 59
//        0 93
//        1 84
//        0 24
//        1 97
//        1 50

//        1 1  2
//        1 25
//        1 78
//        1 72
//        1 3
//        0 45
//        1 83

//        0 87  3
//        1 25
//        1 78
//        1 88
//        0 54
//        0 35

//        1 43   6
//        0 78

//        1 17  4

//        0 59  5
//        0 31