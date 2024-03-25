package java_008_Collections.collection_001_List;

import org.testng.annotations.Test;

import java.util.Vector;

public class List_001 {
    /**
     * List 元素有序、且可重复。
     *
     * 常用的List接口的实现类常用的有：ArrayList、LinkedList和Vector
     */

    //TODO                              一、ArrayList
    @Test
    public void List_001_test_001(){
        // TODO                 常用方法
        // 1. add  -- addAll
        // 2. get :  获取指定Index位置的元素
        // 3. indexOf(obj):返回obj首次出现的位置  --- lastIndexOf(obj):返回obj最后一次出现的位置
        // 4. remove(index)
        // 5. set(index, obj)
        // 6. subList(fromIndex, toIndex)
    }


    @Test
    public void List_001_test_002(){
        // TODO      ArrayList的JDK1.8之前与1.8之后的区别

        // JDK1.7       ArrayList想饿汉式，直接创建一初试容量为10的数组
        // JDK1.8       ArrayList像懒汉式，一开始创建长度为0的数组，添加第一个元素的时候再创建一个长度为10的数组。
    }



    // TODO                            二、LinkedList
    // TODO   对于频繁的插入或删除元素的操作，建议使用LinkedList类，效率较高
    @Test
    public void List_001_test_003(){
        // TODO         常用方法
        //1. addFirst  ---  addLast
        //2. getFirst  ---  getLast
        //3. removeFirst --- removeLast
    }




    // TODO                          三、Vector
    // Vector是线程安全的
    @Test
    public void List_001_test_004(){
        // TODO         常见方法
        //1. addElement(obj)
        //2. insetElementAt(obj, index)
        //3. setElementAt(obj, index)
        // removeElement
        // removeAllElements
    }
}
