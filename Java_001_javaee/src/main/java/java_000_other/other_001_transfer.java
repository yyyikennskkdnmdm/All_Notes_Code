package java_000_other;


import lombok.Data;
import org.testng.annotations.Test;

/**
 * 关于值传递的问题
 */
public class other_001_transfer {

    // TODO 对于局部变量的swag传入的形参， 对于对象的swag传入的是带地址的实参所以对于对象的值传递会改变原本的值
    public void test_swag(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public void test_swag_obj(other_test001 obj){
        int temp = obj.a;
        obj.a = obj.b;
        obj.b  = temp;
    }

    @Test
    public void transfer_test_001(){
        int test_a = 1, test_b = 2;
        test_swag(test_a, test_b);
        System.out.println("test_a = " + test_a + "   test_b = " + test_b);


        other_test001 otherTest001 = new other_test001(3,4);
        test_swag_obj(otherTest001);
        System.out.println(otherTest001);
    }


}
@Data
class other_test001{
    int a;
    int b;

    public other_test001(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
