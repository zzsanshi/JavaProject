package LearningJavaDay0803._08ConCurrent并发包;

import java.util.concurrent.CountDownLatch;

/*
   CountDownLatch允许一个或多个线程等待其他线程完成操作,再执行自己
      构造器:public CountDownLatch(int count)//初始化唤醒需要的down几步.

      方法: public void await() throws InterruptedException 让当前线程等待,必须down
           public void countDown()   计数器进行-1
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        //创建countdown进行监督
        CountDownLatch c=new CountDownLatch(1);
    }
}
class ThreadA extends Thread{
    private CountDownLatch c;

    public ThreadA(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
        c.countDown();//计数器-1
    }
}