package 蓝桥杯.test_001_sort;


import org.testng.annotations.Test;

import java.io.*;
import java.util.*;

public class sort_001 {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int x;


    // 1.使用Scanner
    @Test
    public void main1() {
        n = sc.nextInt();
        x = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        // 分三种情况模拟
        // 1.所有字符串都相同
        if(cs[0] == cs[x - 1]) {
            if(cs[x - 1] == cs[n - 1]) {
                int count = (n + x - 1) / x;
                for(int i = 0; i < count; i++) {
                    System.out.print(cs[i]);
                }
                System.out.println();
            } else {
                for(int i = x - 1; i < n; i++) {
                    System.out.print(cs[i]);
                }
                System.out.println();
            }
        }
        else {
            // 都不相等
            System.out.println(cs[x - 1]);
        }

    }


    // TODO 使用InputStreamReader和 OutputStreamWriter
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static void main(String[] args)throws IOException{
        String[] input = in.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        char[] c = in.readLine().toCharArray();
        Arrays.sort(c);
        if(c[0]==c[x-1]){
            out.print(c[0]);
            //把字典序最小的糖果分了后，就分看剩下的糖果是否相同，相同则尽量均分，否则就都给一个人，这样·能保证大的字符串字典序最小
            if(c[x]==c[n-1]){
                for(int i=0; i<(n-x+x-1)/x; i++) out.print(c[x]);       //(n-x+x-1)/x中的+x-1代表上取整
            }else{
                for(int i=x; i<n; i++) out.print(c[i]);
            }
        }else{
            out.print(c[x-1]);        //如果最小的糖果不够分，那么剩下的人分到的糖果字典序肯定是最大的，所以可以直接输出
        }
        out.flush();
        out.close();
    }


    @Test
    public void test_001(){
        System.out.println((4-2+2-1)/2);

    }



}
