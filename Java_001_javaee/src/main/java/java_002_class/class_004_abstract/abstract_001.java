package java_002_class.class_004_abstract;

import org.testng.annotations.Test;

public class abstract_001 {

    @Test
    public void abstract_001_test_001(){
        // TODO 抽象类不能实例化
//        abstract_001_class001 abstract_001_class001 = new abstract_001_class001(); //java: java_002_class.class_004_abstract.abstract_001_class001是抽象的; 无法实例化
//        System.out.println(abstract_001_class001);
        abstract_001_class002 abstract_001_class002 = new abstract_001_class002();
        abstract_001_class002.method_001();
    }


}

abstract class abstract_001_class001{

    public int a;

    public void method_001(){
        a = 1;
        System.out.println("abstract_001_class001.method_001" + "  , a = " + a);
    }

}

class abstract_001_class002 extends abstract_001_class001{
    @Override
    public void method_001() {
        super.method_001();
        a = 2;
        System.out.println("abstract_001_class002.method_001"+ "  , a = " + a);
    }
}
