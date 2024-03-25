package 蓝桥杯.test_13年真题;

import java.math.BigInteger;
import java.util.*;
public class test_1428_公式求值_效率_边界值 {
    private static BigInteger mod_ = new BigInteger("999101");
    private static BigInteger a1 = new BigInteger("1");
    public static void main(String[] args) {

        BigInteger res = new BigInteger("0");

        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.next());
        BigInteger m = new BigInteger(scanner.next());
        BigInteger k = new BigInteger(scanner.next());
        BigInteger i = new BigInteger("0");

        BigInteger n_ = new BigInteger("1");
        BigInteger a = new BigInteger("1");
        while(a.compareTo(n) <= 0 || a.equals(a1) == true){

            n_ = (n_.multiply(a));
            a = a.add(a1);
        }

        BigInteger m_ = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        while(b.compareTo(m) <= 0 || b.equals(a1) == true){

            m_ = (m_.multiply(b));
            b = b.add(a1);
        }

        BigInteger nm = n.subtract(m);
        BigInteger nm_ = new BigInteger("1");
        BigInteger c = new BigInteger("1");
        while(c.compareTo(nm) <= 0 || c.equals(a1) == true){

            nm_ = (nm_.multiply(c));
            c = c.add(a1);
        }

        BigInteger cnm = (n_.divide(((m_.multiply(nm_)).mod(mod_)))).mod(mod_);


        while(i.compareTo(n) <= 0){

            BigInteger i_ = new BigInteger("1");
            BigInteger d = new BigInteger("1");

            while(d.compareTo(i) <= 0 || d.equals(a1) == true){

                i_ = (i_.multiply(d));
                d = d.add(a1);
            }

            BigInteger ni_ = new BigInteger("1");
            BigInteger e = new BigInteger("1");
            BigInteger ni = n.subtract(i);
            while(e.compareTo(ni) <= 0 || e.equals(a1) == true){

                ni_ = (ni_.multiply(e));
                e = e.add(a1);
            }

            BigInteger cni = n_.divide((i_.multiply(ni_)));

            BigInteger ik = new BigInteger("1");
            if(k.equals(new BigInteger("0")) == true){
                ik = a1;
            }
            else if(i.equals(new BigInteger("0")) == true)
            {
                ik = new BigInteger("0");
            }else if(k.compareTo(new BigInteger("0")) > 0){
                BigInteger f = new BigInteger("1");
                while(f.compareTo(k) <= 0){
                    ik = ik.multiply(i);
                    f = f.add(a1);
                }
            }else{
                // k < 0
                BigInteger f = new BigInteger("1");
                while(f.compareTo(k) <= 0){
                    ik = ik.multiply(i);
                    f = f.add(a1);
                }
                ik = a1.divide(ik);

            }
            BigInteger temp =  ik.multiply(((cni.multiply(cnm))));


            res = res.add(temp);
            i = i.add(a1);
        }
        res = res.mod(mod_);
        System.out.println(res);


    }
}
