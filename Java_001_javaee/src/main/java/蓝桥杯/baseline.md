# 枚举

### 计算质数 

https://leetcode.cn/problems/count-primes/solutions/507273/ji-shu-zhi-shu-by-leetcode-solution/

#### ① 暴力枚举

```java
class Solution {
    public int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }

    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```



#### ②埃氏筛

```java
class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
```



#### ③ 线性筛

primes记录质数的个数

isPrime表示是否i为质数

```java
class Solution {
    public int countPrimes(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                primes.add(i);
            }
            // 如果i是质数，则i*（i之前的质数，即primes(i-1)...primes(0)）都不是质数
            for (int j = 0; j < primes.size() && i * primes.get(j) < n; ++j) {
                isPrime[i * primes.get(j)] = 0;
                if (i % primes.get(j) == 0) {
                    break;
                }
            }
        }
        return primes.size();
    }
}
```





### 模糊坐标

https://leetcode.cn/problems/ambiguous-coordinates/solutions/1951931/mo-hu-zuo-biao-by-leetcode-solution-y1yz/

```java
class Solution {
    public List<String> ambiguousCoordinates(String s) {
        int n = s.length() - 2;
        List<String> res = new ArrayList<String>();
        s = s.substring(1, s.length() - 1);
        for (int l = 1; l < n; ++l) {
            List<String> lt = getPos(s.substring(0, l));
            if (lt.isEmpty()) {
                continue;
            }
            List<String> rt = getPos(s.substring(l));
            if (rt.isEmpty()) {
                continue;
            }
            for (String i : lt) {
                for (String j : rt) {
                    res.add("(" + i + ", " + j + ")");
                }
            }
        }
        return res;
    }

    public List<String> getPos(String s) {
        List<String> pos = new ArrayList<String>();
        if (s.charAt(0) != '0' || "0".equals(s)) {
            pos.add(s);
        }
        for (int p = 1; p < s.length(); ++p) {
            if ((p != 1 && s.charAt(0) == '0') || s.charAt(s.length() - 1) == '0') {
                continue;
            }
            pos.add(s.substring(0, p) + "." + s.substring(p));
        }
        return pos;
    }
}
```





连续整数求和

- 如果 k是奇数，则当 n 可以被 k 整除时，正整数 n 可以表示成 k 个连续正整数之和；
- 如果 k 是偶数，则当 n不可以被 k 整除且 2n 可以被 k 整除时，正整数 n 可以表示成 k*个连续正整数之和

```java
class Solution {
    public int consecutiveNumbersSum(int n) {
        int ans = 0;
        int bound = 2 * n;
        for (int k = 1; k * (k + 1) <= bound; k++) {
            if (isKConsecutive(n, k)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isKConsecutive(int n, int k) {
        if (k % 2 == 1) {
            return n % k == 0;
        } else {
            return n % k != 0 && 2 * n % k == 0;
        }
    }
}

```

