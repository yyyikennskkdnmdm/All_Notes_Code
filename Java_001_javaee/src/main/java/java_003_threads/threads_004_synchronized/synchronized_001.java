package java_003_threads.threads_004_synchronized;

import org.testng.annotations.Test;

/**
 * TODO 使用同步块，实现线程同步
 *  同步代码块实现线程同步，对于实现Runnable和继承Thread的方式使用方式不同，具体下述说明
 */
public class synchronized_001 {

    @Test
    public void synchronized_001_test_001(){

        synchronized_001_class_001 thread = new synchronized_001_class_001();

        Thread thread001 = new Thread(thread);
        Thread thread002 = new Thread(thread);

        thread001.start();
        thread002.start();
    }


    @Test
    public void synchronized_001_test_002(){
        synchronized_001_class_002 thread001 = new synchronized_001_class_002();
        synchronized_001_class_002 thread002 = new synchronized_001_class_002();

        thread001.start();
        thread002.start();

    }
}

// TODO 同步代码块对于实现Runnable的线程来说，只需要将自身当作锁就可以实现线程同步
class synchronized_001_class_001 implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {

        while(true){
            synchronized (this){

                if (ticket > 0) {

                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);

                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
// TODO 对于继承Thread的线程来说，由于有多少个线程就需要创建多少个对象，所以不能使用this来当作锁，需要将要实现同步的属性都设置为static的
//      才可以在同步代码块中实现线程同步。
class synchronized_001_class_002 extends Thread{
    private static int ticket = 100;
    private static final threads_004_synchronized_lock obj = new threads_004_synchronized_lock();

    @Override
    public void run() {
        while(true){
            synchronized (obj){

                if (ticket > 0) {

                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);

                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

class threads_004_synchronized_lock{

}