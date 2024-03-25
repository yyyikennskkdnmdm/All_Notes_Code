package 蓝桥杯.base.base001_枚举;

import org.testng.reporters.jq.INavigatorPanel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 模糊坐标 {


    public static void main(String[] args){

        List<String> res = ambiguousCoordinates("(1001)");
        System.out.println(res);

    }

    public static List<String> ambiguousCoordinates(String s) {
        List<String> res = new ArrayList<>();
        // 分解s
        String temp = s.substring(1,s.length() - 1);

        for(int i = 1; i < temp.length(); i++){
            String s1 = temp.substring(0,i);
            String s2 = temp.substring(i,temp.length());
            boolean flag1 = !(s1.charAt(0) == '0' && s1.charAt(s1.length()-1) == '0');
            boolean flag2 = !(s2.charAt(0) == '0' && s2.charAt(s2.length()-1) == '0');

            if((s1.length() == 1 || flag1 == true)
                    && (s2.length() == 1 || flag2 == true)){
//                System.out.println(s1 + " " + s2);

                // 1 两个长度1
                if(s1.length() == 1 && s2.length() == 1){
                    res.add("(" + s1 + ", " + s2 + ")");
                }
                // 2 其中一个长度1
                else if(s1.length() != 1 && s2.length() == 1){
                    if(s1.charAt(0) == '0'){
                        res.add("(0." + s1.substring(1) + ", " + s2 + ")");
                    }else{
                        for(int k = 1; k < s1.length();k++){
                            if(s1.charAt(k) == '0'){
                                // 判断0后面是否全是0，全是0则不符合
                                int flag = 0;
                                for(int q = k + 1; q < s1.length(); q++){
                                    if(s1.charAt(q) != '0'){
                                        flag = 1;
                                        break;
                                    }
                                }
                                if(flag == 0 || k == s1.length()-1 || s1.charAt(s1.length()-1) == '0'){
                                    break;
                                }
                            }
                            res.add("(" + s1.substring(0,k) + "." + s1.substring(k) + ", " + s2 + ")");
                        }
                        res.add("(" + s1 + ", " + s2 + ")");
                    }
                // 3 其中一个长度1
                }else if(s1.length() == 1 && s2.length() != 1){
                    if(s2.charAt(0) == '0'){
                        res.add("(" + s1 + ", 0." + s2.substring(1) + ")");
                    }else{
                        int k;
                        for(k = 1; k < s2.length(); k++){
                            if(s2.charAt(k) == '0'){
                                // 判断0后面是否全是0，全是0则不符合
                                int flag = 0;
                                for(int q = k + 1; q < s2.length(); q++){
                                    if(s2.charAt(q) != '0'){
                                        flag = 1;
                                        break;
                                    }
                                }
                                String s3 = s2.substring(k);
                                if(flag == 0 || k == s2.length()-1){
                                    break;
                                }
                            }
                            res.add("(" + s1 + ", " + s2.substring(0,k) + "." + s2.substring(k) + ")");
                        }
                        res.add("(" + s1 + ", " + s2 + ")");
                    }
                // 4
                }else{
                    if(s1.charAt(0) == '0' && s2.charAt(0) == '0'){
                        res.add("(0." + s1.substring(1) + ", 0." + s2.substring(1) + ")");
                    }else if(s1.charAt(0) == '0'){
                        String sub1 = "(0." + s1.substring(1) + ", ";
                        for(int k = 1; k < s2.length(); k++){
                            if(s2.charAt(k) == '0'){
                                int flag4 = 0;
                                for(int q = k + 1; q < s2.length(); q++){
                                    if(s2.charAt(q) != '0'){
                                        flag4 = 1;
                                        break;
                                    }
                                }
                                if(flag4 == 0 || k == s2.length() - 1){
                                    break;
                                }
                            }
                            res.add(sub1 + s2.substring(0,k) + "." + s2.substring(k) + ")");
                        }
                        res.add(sub1 + s2 + ")");
                    }else if(s2.charAt(0) == '0'){
                        String sub2 = ", " + "0." + s2.substring(1) + ")";
                        for(int k = 1; k < s1.length(); k++){
                            if(s1.charAt(k) == '0'){
                                int flag4 = 0;
                                for(int q = k + 1; q < s1.length(); q++){
                                    if(s1.charAt(q) != '0'){
                                        flag4 = 1;
                                        break;
                                    }
                                }
                                if(flag4 == 0 || k == s1.length() - 1) break;
                            }
                            res.add("(" + s1.substring(0,k) + "." + s1.substring(k) + sub2);
                        }
                        res.add("(" + s1 + sub2);
                    }else{
                        for(int k1 = 0; k1 < s1.length(); k1++){
//                            int flag5 = 0;
//                            for(int q = k1 + 1; q < s1.length(); q++){
//                                if(s1.charAt(q) != '0') {
//                                    flag5 = 1;
//                                    break;
//                                }
//                            }
//                            if(flag5 == 0) break;
                            for(int k2 = 0; k2 < s2.length(); k2++){
//                                int flag6 = 0;
//                                for(int q = k2 + 1; q < s2.length(); q++){
//                                    if(s2.charAt(q) != '0') {
//                                        flag6 = 1;
//                                        break;
//                                    }
//                                }
//                                if(flag6 == 0) break;

                                if(k1 == 0 && k2 != 0){
                                    res.add("(" + s1 + ", " + s2.substring(0,k2) + "." + s2.substring(k2) + ")");
                                }
                                else if(k2 == 0 && k1 != 0){
                                    res.add("(" + s1.substring(0,k1) + "." + s1.substring(k1) + ", " + s2 + ")");
                                }else if(k1 != 0 && k2!= 0){
                                    res.add("(" + s1.substring(0,k1) + "." + s1.substring(k1) + ", " + s2.substring(0,k2) + "." + s2.substring(k2) + ")");
                                }
                            }
                        }
                        res.add("(" + s1 + ", " + s2 + ")");
                    }
                }

            }


        }

        // 删掉.00类型的
        ArrayList<String> removed = new ArrayList<>();
        for(String st : res){
            int di = 0;
            int flag1 = 0, flag2 = 0;
            for(int i = 0 ; i < st.length(); i++){
                if(st.charAt(i) == '.') flag1 = 1;
                if(st.charAt(i) == ','){
                    di = i;
                    break;
                }
            }
            for(int i = di + 2; i < st.length(); i++){
                if(st.charAt(i) == '.') {
                    flag2 = 1;
                    break;
                }
            }
            if(flag1 == 1 && st.charAt(di - 1) == '0') removed.add(st);
            if(flag2 == 1 && st.charAt(st.length() -2) == '0' && removed.contains(st) == false) removed.add(st);

        }

        for(String re : removed){
            res.remove(re);
        }

//        System.out.println(removed);

        return res;
    }
}
