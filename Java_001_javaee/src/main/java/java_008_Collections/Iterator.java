package java_008_Collections;

import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 *
 *
 * Iterator主要用于遍历Collection集合的元素
 *
 *      TODO        提供了一种方法，访问一个容器对象中各个元素，而又不需暴露该对象的内部细节。
 *
 *
 */
public class Iterator {



    @Test
    public void Iterator_test_001(){
        ArrayList<Integer> integers = new ArrayList<>();

        for(int i = 0 ; i < 10;i++) {
            integers.add(i);
        }

        java.util.Iterator<Integer> iterator = integers.iterator();


        // TODO hasNext
        while(iterator.hasNext()){
            // TODO next
            Integer next = iterator.next();


            // TODO  remove
            if(next.equals(1)){
                iterator.remove();
                continue;
            }

            System.out.println(next);




        }
    }
}
