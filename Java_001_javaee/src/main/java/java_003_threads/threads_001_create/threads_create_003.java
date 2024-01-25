package java_003_threads.threads_001_create;

import org.testng.annotations.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
// TODO 实现Callable
public class threads_create_003 {

    @Test
    public void threads_create_003_test_001() throws ExecutionException, InterruptedException {
        threads_create_003_class_001 thread001 = new threads_create_003_class_001();
        FutureTask futureTask = new FutureTask(thread001);
        new Thread(futureTask).start();

        Object o = futureTask.get();
        System.out.println("o = " + o);;

    }


}



class threads_create_003_class_001 implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}