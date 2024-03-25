package 数据结构.串;

public class pusu {
    public static void main(String[] args) {
        String s = "aaabbbaaa";
        String t = "abbba";
        int i = pusu2(s, t);
        System.out.println(i);
    }
    // s为主串，t为模式串
    public static int pusu2(String s, String t){
        int tLen = t.length();
        int sLen = s.length();
        for(int i = 0; i < sLen - tLen; i++){
            String temp = s.substring(i, i + tLen);
            if(temp.equals(t) == true){
                return i;
            }
        }
        return -1;
    }
}
