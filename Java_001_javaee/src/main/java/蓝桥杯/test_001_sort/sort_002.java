package 蓝桥杯.test_001_sort;

import java.util.*;
import java.util.TreeMap;
// https://www.lanqiao.cn/problems/205/learning/?page=1&first_category_id=1&tags=%E6%8E%92%E5%BA%8F
public class sort_002 {


    static Scanner scan = new Scanner(System.in);
    static int n;
    static int N, M;
    public static void main(String[] args) {


        //在此输入您的代码...
        n = scan.nextInt();
        scan.nextLine();
        String[] lines = new String[n];
        for(int i = 0 ; i < n; i++){
            lines[i] = scan.nextLine();
        }

        //处理数据：将每行中的字符串转换为数字数组
        // 1.先将每行的分别转换为字符串数组，每一个字符串为单个数字
        TreeMap<Integer,Integer> nums = new TreeMap<>();
        for(int i = 0 ; i < n; i++){
            String[] temp = lines[i].split(" ");
            for(int j = 0 ; j < temp.length; j++){
                Integer t = Integer.parseInt(temp[j]);
                if(nums.get(t) == null){
                    nums.put(t,1);
                }else{
                    nums.put(t,nums.get(t)+1);
                }
            }
        }
        // 判断
        int temp2 = 101;
        for(Map.Entry<Integer, Integer> entry: nums.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(temp2 != 101 && key - temp2 > 1){
                System.out.print(key-1);
                System.out.print(" ");
            }
            if(value == 2){
                N = key;
            }
            temp2 = key;
        }
        System.out.println(N);




        scan.close();



    }


}
