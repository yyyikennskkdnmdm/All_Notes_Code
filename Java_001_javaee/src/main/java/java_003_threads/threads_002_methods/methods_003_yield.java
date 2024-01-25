package java_003_threads.threads_002_methods;

import org.testng.annotations.Test;
// TODO static void yield()：线程让步
//暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
//若队列中没有同优先级的线程，忽略此方法
public class methods_003_yield {


    @Test
    public void  methods_003_yield_test_001() throws InterruptedException {

//        methods_003_yield thread001 = new methods_003_yield();
//        thread001.start();

        Thread.currentThread().setName("主线程");

        for(int i = 0 ; i < 100;i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }



    }
}
//
//class methods_003_yield_class_001 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0 ; i < 100;i++){
//            System.out.println(Thread.currentThread().getName() + " : " + i);
//
//            if(i % 20 == 0){
////                yield(10);
//            }
//
//        }
//    }
//}
