package 数据结构.串;

public class kmp_nextval {


    public static void main(String[] args) {
        String s = " aaabbbaaa";
        String t = " abbba";
        int[] next = new int[t.length()];
        get_nextval(t,next);
        for(int e: next){
            System.out.print(e + " ");
        }
        System.out.println();
        int kmp = kmp(s, t, next);
        System.out.println(kmp);
    }

    public static void get_nextval(String t, int[] nextval){
        int i = 1, j = 0;
        while(i < t.length() - 1){
            if(j == 0 || t.charAt(i) == t.charAt(j)){
                i++; j++;
                if(t.charAt(i) != t.charAt(j)) nextval[i] = j;
                else nextval[i] = nextval[j];
            }else{
                j = nextval[j];
            }
        }
    }
    public static int kmp(String s, String t, int[] nextval){
        int i = 1, j = 1;
        while(i < s.length() && j < t.length()){
            if(j == 0 || s.charAt(i) == t.charAt(j)){
                i++; j++;
            }else{
                j = nextval[j];
            }
        }
        if(j >= t.length()) return i - t.length();
        else return 0;
    }


}
