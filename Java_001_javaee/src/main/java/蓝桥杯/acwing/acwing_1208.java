package 蓝桥杯.acwing;


import java.util.*;

public class acwing_1208 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String start = scan.next();
        String end = scan.next();
        int num = 0;
        char[] a = start.toCharArray();
        char[] b = end.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]){
                a[i] = a[i]=='*'?'o':'*';
                a[i+1] = a[i+1]=='*'?'o':'*';
                num++;
            }else{
                continue;
            }
        }
        scan.close();
        System.out.println(num);
    }
}
