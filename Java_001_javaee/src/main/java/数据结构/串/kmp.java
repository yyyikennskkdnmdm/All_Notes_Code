package 数据结构.串;

public class kmp {

    public static void main(String[] args) {
        String s = " aaabbbaaa";
        String t = " abbba";
        int[] next = new int[t.length()];
        get_next(t,next);
        for(int e: next){
            System.out.print(e + " ");
        }
        System.out.println();
        int kmp = kmp(s, t, next);
        System.out.println(kmp);
    }

    public static int kmp(String s, String t, int[] next) {
        int i = 1, j = 1;
        while(i < s.length() && j < t.length()){
            if(j == 0 || s.charAt(i) == t.charAt(j)){
                i++;j++;
            }else{
                j = next[j];
            }
        }
        if(j >= t.length()){
            return i - t.length();
        }else{
            return 0;            // 没有找到
        }
    }

    public static void get_next(String t, int[] next){
        int i = 1, j = 0;
        next[1] = 0;
        while(i < t.length() - 1){
            if(j == 0 || t.charAt(i) == t.charAt(j)){
                i++;j++;
                next[i] = j;
            }else{
                j = next[j];
            }
        }
    }



}


