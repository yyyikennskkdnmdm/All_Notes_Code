package java_008_Collections;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

public class Collections_example {

    /**
     *  Java集合可分为Collection和Map两种体系
     *      Collection接口：单列数据，定义了存取一组对象的方法的集合。
     *          List：元素有序、可重复的集合
     *          Set：元素无序，不可重复的集合
     *      Map接口：双列数据，保存具有映射关系的键值对集合
     *
     *
     *
     *  JDK不提供Collection接口的任何直接实现，而是提供更具体的子接口实现。
     *
     *
     *
     */


    @Test
    public void Collections_example_test_Collection(){


        // Collection接口的方法
        Collection collection = new ArrayList();

        collection.add(1); // TODO        添加

        Collection collection2 = new ArrayList();

        collection.add(collection2);

        int size = collection.size(); // TODO           元素个数

        collection.clear(); // TODO             清空

        boolean empty = collection.isEmpty(); // TODO           判空

        boolean contains = collection.contains(1); // TODO          是否包含

        boolean b = collection.containsAll(collection2);

        // TODO    交集:将交集的结果存在collection中，不影响collection2
        boolean b1 = collection.retainAll(collection2);

        // TODO     删除
        boolean remove = collection.remove(1);

        boolean b2 = collection.removeAll(collection2);

        // TODO      判断相等
        boolean equals = collection.equals(collection2);

        // TODO     转成对象数组
        Object[] objects = collection.toArray();

        // TODO     获取集合对象的哈希值
        int i = collection.hashCode();




    }




}
