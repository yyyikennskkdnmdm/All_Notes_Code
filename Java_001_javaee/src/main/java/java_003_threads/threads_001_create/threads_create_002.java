package java_003_threads.threads_001_create;

import org.testng.annotations.Test;

// TODO 实现Runnable的方式实现多线程
public class threads_create_002 {


    @Test
    public void threads_create_002_test_001(){
        //1.创建实现类的对象
        threads_create_002_class threads_create_002_class_1 = new threads_create_002_class();
        //2.创建thread类，将实现类的对象放入构造器
        Thread thread1 = new Thread(threads_create_002_class_1);
        // TODO 如果自己手动调用run()方法，那就是普通的方法，没有启动多线程模式
        // TODO 想要启动多线程，必须调用start方法
        //3.通过Thread类的对象调用start()
        thread1.start();

        threads_create_002_class threads_create_002_class_2 = new threads_create_002_class();
        Thread thread2 = new Thread(threads_create_002_class_2);
        thread2.start();


    }
}



class threads_create_002_class implements Runnable{



    @Override
    public void run() {
        for(int i = 0 ; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + "子线程  ===  " + i);
        }
    }
}
