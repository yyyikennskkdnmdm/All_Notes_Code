package java_003_threads.threads_004_synchronized;

import org.testng.annotations.Test;

import java.util.concurrent.locks.ReentrantLock;

public class synchronized_003 {


    @Test
    public void synchronized_003_test_001(){

        synchronized_001_class_001 thread = new synchronized_001_class_001();

        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);

        thread1.start();
        thread2.start();

    }

    @Test
    public void synchronized_003_test_002(){
        synchronized_001_class_002 thread = new synchronized_001_class_002();
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);
        thread1.start();
        thread2.start();
    }
}


class synchronized_003_class_001 implements Runnable{

    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
         while(true) {

             if (ticket > 0) {
                 lock.lock();
                 System.out.println(Thread.currentThread().getName() + "：售票，票号为：" + ticket);
                 ticket--;
                 lock.unlock();
             }else{
                 break;
             }

         }
    }
}

class synchronized_003_class_002 extends Thread{


    private static int ticket = 100;

    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){

            if(ticket > 0){
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "：售票，票号为：" + ticket);
                ticket--;
                lock.unlock();
            }else{
                break;
            }
        }
    }
}
