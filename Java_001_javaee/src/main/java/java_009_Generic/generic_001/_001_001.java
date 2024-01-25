package java_009_Generic.generic_001;



import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _001_001 {


    @Test
    public void _001_test_001(){

        // TODO 为什么要有泛型
        // 集合在设计阶段/声明阶段不能确定这个容器到底实际存储的是什么类型的对象，所以在jdk1.5之前只能把元素类型设计为Object
        // jdk1.5之后使用泛型来解决。

        // TODO 由于子类在继承泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        SubOrder subOrder = new SubOrder();


        // TODO 泛型不同的引用不能相互赋值
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        list1 = list2;



        // TODO ?
        List<Object> list11 = null;
        List<String> list21 = null;
        List<?> list00 = null;
        list00 = list11;
        list00 = list21;

        list21.add("AA");
//        list00.add("DD");  // 不能添加数据


        // TODO ? extend A
        List<? extends _001_001_Person> list111 = null;
        List<? super _001_001_Person> list211 = null;

        List<_001_001_Student> list311 = new ArrayList<_001_001_Student>();
        List<_001_001_Person> list411 = new ArrayList<_001_001_Person>();
        List<Object> list511 = new ArrayList<Object>();

        list111 = list311;
        list111 = list411;

        list211 = list411;
        list211 = list511;

    }
}

class Order<T> {
    T orderT;

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }
}
class SubOrder extends Order<Integer> {//SubOrder:不是泛型类


    public static <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }
        return list;

    }
}

class SubOrder1<T> extends Order<T> {//SubOrder1<T>:仍然是泛型类
}

class _001_001_Person {
}
class _001_001_Student extends _001_001_Person {

}