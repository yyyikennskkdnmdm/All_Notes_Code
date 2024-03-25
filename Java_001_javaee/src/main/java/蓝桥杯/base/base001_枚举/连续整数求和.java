package 蓝桥杯.base.base001_枚举;

public class 连续整数求和 {

    public static void main(String[] args) {
        System.out.println(2 * 15 % 4);
    }
    public static int consecutiveNumbersSum(int n) {
        if(n == 1 || n == 2) return 1;
        int res = 1;
        for(long i = n / 2 + 1; n <= i * (i + 1)/2; i--){
            int temp = 0;
            for(long j = i; j > 0; j--){
                temp += j;
                if(temp == n) {
                    res++;
                    for(long k = i; k >= j; k--){
                        System.out.print(k + ",");
                    }
                    System.out.println();
                    break;
                }
                if(temp > n) break;
            }
        }
        return res;
    }
}
