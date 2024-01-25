package java_003_threads.threads_002_methods;

import org.testng.annotations.Test;
// TODO join() ：当某个程序执行流中调用其他线程的 join() 方法时，调用线程将
// 被阻塞，直到 join() 方法加入的 join 线程执行完为止
// 低优先级的线程也可以获得执行
public class methods_002_join {

    @Test
    public void  methods_001j_test_001() throws InterruptedException {

        methods_001_class_001 methods_001_class_001 = new methods_001_class_001();
        methods_001_class_001.start();

        Thread.currentThread().setName("主线程");

        for(int i = 0 ; i < 100;i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);

            if(i == 10){
                methods_001_class_001.join();
            }
        }

    }


}

class methods_001_class_001 extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 100;i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
