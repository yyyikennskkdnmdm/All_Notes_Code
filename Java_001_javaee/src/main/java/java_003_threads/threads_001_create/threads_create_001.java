package java_003_threads.threads_001_create;

import org.testng.annotations.Test;

// TODO: 继承thread类来创建线程
public class threads_create_001 {

    @Test
    public void threads_create_001_test_001(){
        class_001_threads_create_001 class_001_threads_create_001 = new class_001_threads_create_001();
        // TODO 如果自己手动调用run()方法，那就是普通的方法，没有启动多线程模式
        // TODO 想要启动多线程，必须调用start方法
        class_001_threads_create_001.start();

        class_001_threads_create_001 class_001_threads_create_001_2 = new class_001_threads_create_001();
        class_001_threads_create_001_2.start();


    }
}


class class_001_threads_create_001 extends Thread{
    public class_001_threads_create_001() {
        super();
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + "子线程  ===  " + i);
        }
    }
}
