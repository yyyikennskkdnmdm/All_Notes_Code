package 蓝桥杯.test_12届真题;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.lanqiao.cn/problems/1457/learning/?page=1&first_category_id=1&second_category_id=3&name=%E6%9D%A8%E8%BE%89
public class test_hard001 {

    // TODO 未ac 运行超时
    public void test001(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Long> lines = new ArrayList<>();

        Long sum = 3L;

        if(N==1){
            System.out.println(1);
            return;
        }
        lines.add(1L);
        lines.add(1L);

        for(int i = 2 ; i <= N; i++){


            for(int j = i; j >= i/2; j--){
                if(j == i){
                    lines.add(1L);
                    sum++;
                }else{
                    Long temp = lines.get(j) + lines.get(j-1);
                    if(temp != N){
                        sum++;
                    }else{
                        System.out.println(sum+1);
                        return;
                    }
                    lines.set(j,temp);
                }

            }
            sum += i/2;
        }

        //在此输入您的代码...
        scan.close();
    }
}
