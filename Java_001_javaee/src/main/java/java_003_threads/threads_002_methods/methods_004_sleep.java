package java_003_threads.threads_002_methods;

import org.testng.annotations.Test;

// TODO static void sleep(long millis)：(指定时间:毫秒)
//令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
//抛出InterruptedException异常
public class methods_004_sleep {

    @Test
    public void  methods_004_sleep_test_001() throws InterruptedException {

        methods_004_sleep_class_001 thread1 = new methods_004_sleep_class_001();
        thread1.start();

        Thread.currentThread().setName("主线程");

        for(int i = 0 ; i < 100;i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }

    }

}

class methods_004_sleep_class_001 extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 100;i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);

            if(i == 20){
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}