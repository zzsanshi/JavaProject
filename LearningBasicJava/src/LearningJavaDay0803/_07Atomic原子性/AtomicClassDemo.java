package LearningJavaDay0803._07Atomic原子性;

import java.util.concurrent.atomic.AtomicInteger;

/*
   原子类:高效,简单
       AtomicInteger
       原子型Integer,可以实现原子操作
       public AtomicInteger():初始化一个默认值为0的原子型Integer
       public AtomicInteger(int initialValue):初始化一个指定值的原子型Integer

       int  get():获取值
       int  getAndIncrement():以原子方式将当前值+1,返回自增前的值
       int  incrementAndGet():以原子方式将当前值+1,返回自增后的值
       int  addAndGet(int data):以原子方式将输入的数值和实例中的值相加
       int  getAndSet(int value):以原子方式设置为newValue,并返回旧值
 */
public class AtomicClassDemo {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        for (int i = 1; i <= 10; i++) {
            //启动100个线程,执行100次
            new Thread(target).start();
        }
    }
}

class MyRunnable2 implements Runnable {
    //创建原子类
    private AtomicInteger atmo = new AtomicInteger();
    private volatile int count;

    @Override
    public void run() {
        //System.out.println(count);
        synchronized ("11") {
            for (int i = 1; i <= 10; i++) {

                System.out.println(Thread.currentThread().getName() + "输出" + atmo.incrementAndGet());
            }
        }
    }
}