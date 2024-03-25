package 蓝桥杯.base.base001_枚举;

import java.util.ArrayList;
import java.util.Arrays;

public class 计数质数 {

    public static void main(String[] args) {

    }

    public int countPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int[] isPrime = new int[n];
        Arrays.fill(isPrime,1);
        for(int i = 2; i < n; i++){
            if(isPrime[i] == 1){
                primes.add(i);
            }
            for(int j = 0; j < primes.size() && primes.get(j) * i < n; j++){
                isPrime[primes.get(j) * i] = 0;
                if(i % primes.get(j) == 0){
                    break;
                }
            }
        }
        return primes.size();


    }
}
