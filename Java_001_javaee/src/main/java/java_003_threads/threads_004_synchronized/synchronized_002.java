package java_003_threads.threads_004_synchronized;

import org.testng.annotations.Test;

// TODO 使用同步方法实现线程同步
public class synchronized_002 {


    @Test
    public void synchronized_002_test_001(){
        synchronized_002_class_001 thread001 = new synchronized_002_class_001();
        synchronized_002_class_001 thread002 = new synchronized_002_class_001();

        thread001.start();
        thread002.start();
    }



    @Test
    public void synchronized_002_test_002(){
        synchronized_002_class_002 thread = new synchronized_002_class_002();

        Thread thread001 = new Thread(thread);
        Thread thread002 = new Thread(thread);

        thread001.start();
        thread002.start();



    }
}


class synchronized_002_class_001 extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {
        while(ticket > 0){
            show();
        }
    }

    private static synchronized void show() {

        if(ticket > 0){
            System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
            ticket--;
        }

    }
}


class synchronized_002_class_002 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while(ticket > 0) {
            show();
        }
    }

    public synchronized void show() {
        if(ticket > 0){
            System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
            ticket--;
        }
    }
}