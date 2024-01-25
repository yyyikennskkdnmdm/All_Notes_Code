package 蓝桥杯.test_12届真题;

import java.math.BigInteger;
import java.util.Scanner;
//https://www.lanqiao.cn/problems/1452/learning/?page=1&first_category_id=1&second_category_id=3&name=%E6%97%B6%E9%97%B4%E6%98%BE%E7%A4%BA  AC
public class test_easy002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        BigInteger adaytime = new BigInteger("86400");
        BigInteger ahourtime = new BigInteger("3600");
        BigInteger aminutetime = new BigInteger("60");

        String s = scan.nextLine();
        BigInteger now = new BigInteger(s);
        now = now.divide(new BigInteger("1000"));

        BigInteger mod = now.mod(adaytime);
        BigInteger hour = mod.divide(ahourtime);
        BigInteger minute = mod.mod(ahourtime).divide(aminutetime);
        BigInteger second = mod.mod(aminutetime);
        int inthour = hour.intValue();
        int intminute = minute.intValue();
        int intsecond = second.intValue();
        if(inthour < 10){
            System.out.print("0" + inthour + ":");
        }else{
            System.out.print(inthour + ":");
        }
        if(intminute < 10){
            System.out.print("0" + intminute + ":");
        }else{
            System.out.print(intminute + ":");
        }
        if(intsecond < 10){
            System.out.print("0" + intsecond);
        }else{
            System.out.print(intsecond);
        }

        scan.close();
    }
}
