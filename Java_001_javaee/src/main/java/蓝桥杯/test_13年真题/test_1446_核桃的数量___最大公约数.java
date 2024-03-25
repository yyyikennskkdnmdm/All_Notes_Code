package 蓝桥杯.test_13年真题;
import java.util.*;
public class test_1446_核桃的数量___最大公约数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int x = (a * b) / gcd(a, b);
        System.out.println((x * c) / gcd(x, c));
    }

    public static int gcd(int a, int b){
        if(a % b == 0) return b;
        else return gcd(b, a%b);
    }
}
