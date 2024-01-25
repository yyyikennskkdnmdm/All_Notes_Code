package java_002_class.class_001_instanceof关键字;

import org.testng.annotations.Test;

/**
 *
 * instanceof关键字 和 向下转型 的一些特殊情况
 *
 * a instanceof A:判断a对象是否是类A的实例
 */
public class instanceof_001 {

    @Test
    public void test_instanceof_001(){
        // TODO 同类的实例
        instanceof_001_a a = new instanceof_001_a();
        boolean tf_a = a instanceof instanceof_001_a;
        System.out.println("tf_a = " + tf_a);

        // TODO 子类的实例也返回true
        instanceof_002_b b = new instanceof_002_b();
        boolean tf = b instanceof instanceof_001_a;
        System.out.println("tf = " + tf);

        // 返回为false的情况
        boolean b1 = a instanceof instanceof_002_b;
        System.out.println("b1 = " + b1);


        instanceof_003_c c = new instanceof_003_c();
//        boolean b2 = c instanceof instanceof_001_a; // 如果两个类之间没有关系，那么不能显性表示
    }

    // TODO 通常使用在子类强转为父类的情况
    public void test_instanceof_002_useful(Object obj){

        if(obj instanceof instanceof_002_b){
            instanceof_001_a obj_ = (instanceof_001_a) obj;
            System.out.println("强转为父类");
        }

    }

    // TODO 几种特殊的情况
    @Test
    public void test_instanceof_002(){
        // 1 . 编译时通过了，但是运行时java.lang.ClassCastException
        instanceof_001_a a_bb = new instanceof_004_bb();
        instanceof_002_b a_b = (instanceof_002_b) a_bb;

        //

    }




}





class instanceof_001_a{
    int a;
}
class instanceof_002_b extends  instanceof_001_a{
    int b;
}
class instanceof_004_bb extends instanceof_001_a{
    int bb;
}
class instanceof_003_c{
    int c;
}