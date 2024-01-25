package 蓝桥杯;


import org.testng.annotations.Test;

import java.util.*;

public class test3 {



    public static void main(String[] args) {



    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int temp = 0, temp2 = 1;
        for(int i = 1; i < k; i++){
            temp += temp2;
            temp2 *= 2;
        }
        int res = 0;
        while(temp < nums.size()){
            res += nums.get(temp);
            temp *= 2;
        }

        return res;
    }

    @Test
    public void test001(){
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(2);
        Integer pop = integers.pop();
        System.out.println(pop);
    }

    private final static int N = 1010;
    private static List<Thing> things = new ArrayList<>();
    private static int v, w, s;
    private static int n, m;
    private static int[] f = new int[N];

    @Test
    public void test002(){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for(int i = 0 ; i < n; i++){
            v = scanner.nextInt();
            w = scanner.nextInt();
            s = scanner.nextInt();
            if(s < 0){
                Thing thing = new Thing(-1,v,w);
                things.add(thing);
            }else if(s == 0){
                Thing thing = new Thing(0,v,w);
                things.add(thing);
            }else{
                for(int k = 1; k <= s; k *= 2){
                    s -= k;
                    Thing thing = new Thing(-1,v*k,w*k);
                    things.add(thing);
                }
                if(s > 0) things.add(new Thing(-1,v*s,w*s));
            }
        }


        for(Thing thing: things){
            if(thing.kinf < 0){
                for(int j = m; j >= thing.v; j--){
                    f[j] = Math.max(f[j], f[j-thing.v] + thing.w);
                }
            }else{
                for(int j = thing.v; j <= m; j++){
                    f[j] = Math.max(f[j], f[j-thing.v] + thing.w);
                }
            }
        }

        System.out.println(f[m]);
    }

}

class Thing{
    int kinf;
    int v, w;

    public Thing() {
    }

    public Thing(int kinf, int v, int w) {
        this.kinf = kinf;
        this.v = v;
        this.w = w;
    }
}
