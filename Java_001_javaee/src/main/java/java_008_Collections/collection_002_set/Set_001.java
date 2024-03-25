package java_008_Collections.collection_002_set;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.TreeSet;

//      TODO *  对于存放在Set容器中的对象，对应的类一定要重写equals和hashCode方法，以实现对象相等规则。
public class Set_001 {


    /***
     *  TODO                             HashSet
     *
     *  HashSet按Hash算法来存储集合中的元素，因此具有很好的存取、查找、删除性能
     *
     *  TODO 特点
     *  不能保证元素的排列顺序
     *  HashSet不是线程安全的
     *  集合元素可以是null
     *
     *  TODO 扩容机制
     *  底层也是数组，初始容量为16，当如果使用率超过0.75，则扩容为原来的两倍
     */


    /**
     * TODO                             LinkedHashSet
     * 使用双链表来维护的哈希表
     * 是HashSet的子类，根据哈希值来决定元素的存储位置，元素顺序存储
     */


    /**
     * TODO：需要重点掌握TreeSet的自然排序和定制排序
     * TODO                             TreeSet:有序，查询速度比List快
     * 是SortedSet接口的实现类，TreeSet可以确保集合元素处于排序状态
     * 底层使用红黑树结构存储数据。
     *
     */
    @Test
    public void Set_001_test_003(){
        // TODO   新增方法
        // 1.  comparator
        // 2.  first -- last
        // 3.  lower -- higher
        // 4.  subSet -- headSet --- tailSet
        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.remove(1);


        LinkedList<Integer> integers1 = new LinkedList<>();
        integers1.add(1);
        integers1.addFirst(2);
        integers1.addLast(3);


    }
}
