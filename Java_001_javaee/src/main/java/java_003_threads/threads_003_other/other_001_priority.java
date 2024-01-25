package java_003_threads.threads_003_other;
import org.testng.annotations.Test;

/**
 * TODO 线程的优先级:优先级值越大，优先级越高
 * MAX_PRIORITY:10
 * MIN_PRIORITY: 1
 * NORM_PRIORITY:5
 *
 * 涉及的方法：getPriority():返回线程优先值 / setPriority(int newPriority):改变线程的优先级
 */
public class other_001_priority {
    
    @Test
    public void other_001_priority_test_001(){
        // 默认的优先级为：5
        int priority = Thread.currentThread().getPriority();
        System.out.println("priority = " + priority);


        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());



        //  MAX_PRIORITY:10
        //  MIN_PRIORITY: 1
        //  NORM_PRIORITY:5
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
    }
}
