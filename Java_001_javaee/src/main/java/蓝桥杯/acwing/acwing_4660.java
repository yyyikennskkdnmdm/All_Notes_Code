package 蓝桥杯.acwing;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class acwing_4660 {
    private static int n;
    private static BigInteger res = new BigInteger("0");
    private static BigInteger temp = new BigInteger("0");
    private static BigInteger sum = new BigInteger("0");
    private static BigInteger fac = new BigInteger("1");

    public static void dfs(int u){
//        998244353
        for(int i = 2 ; i <= u; i++){
            res = res.multiply(new BigInteger(String.valueOf(i)));
            calculateFactorial(i);
            calculateSum(i);
            res = res.add(sum.multiply(fac));
        }
        res = res.remainder(new BigInteger("998244353"));
        System.out.println(res.toString());



    }

    public static void calculateFactorial(int u){
        BigInteger temp = new BigInteger("1");
        for(int i = 1; i < u; i++){
            temp = temp.multiply(new BigInteger(String.valueOf(i)));
        }
        fac = temp;
    }

    public static void calculateSum(int u){
        BigInteger temp = new BigInteger("0");
        for(int i = 1; i < u;i++){
            temp = temp.add(new BigInteger(String.valueOf(i)));
        }
        sum = temp;

    }

    private static long res2 = 0;
    private static long sum2 = 0;
    private static long fac2 = 1;


    public static void dfs2(int u){
        for(int i = 2 ; i <= u;i++){
            sum2 = (((i-1)*(i))/2) % 998244353;
            fac2 = 1;
            for(int j = 1 ; j < i; j++ ){
                fac2 *= j;
                fac2 %= 998244353;
            }
            res2 = (i * res2 + sum2 * fac2) % 998244353;
        }
        System.out.println(res2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        dfs2(n);


    }
}
