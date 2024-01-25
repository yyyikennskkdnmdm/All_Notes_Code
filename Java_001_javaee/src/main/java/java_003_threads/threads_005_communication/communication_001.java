package java_003_threads.threads_005_communication;

import org.testng.annotations.Test;

// TODO 可以让两个线程交替打印
public class communication_001 {


    @Test
    public void communication_001_test_001(){
        communication_001_class_002 thread001 = new communication_001_class_002();
        communication_001_class_002 thread002 = new communication_001_class_002();

        thread001.start();
        thread002.start();

    }
}



class communication_001_class_002 extends Thread {

    private static int number = 1;

    private static final Object obj = new Object();

    @Override
    public void run() {
        while(number < 100){
            synchronized (obj){

                System.out.println(Thread.currentThread().getName() + " : " + number);

                number++;
                obj.notify();
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
