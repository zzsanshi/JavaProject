package LearningJavaDay0803._07Atomic原子性;
/*
   原子性:在一次或者多次操作中,要么所有的操作全部都得到了执行并且不会受到任何因素的干扰而中断,要么所有的操作都不执行
          一批操作是一个整体,要么同时成功,要么同时失败,不能干扰
   volatile 只能保证线程间的可见性,不能保证原子性
   解决方法:1.加锁--性能较差
           2.原子类--性能好,安全
             原因: 原子类CAS(比较再交换)机制,

 */
public class VolatileAtomicDemo {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        for (int i = 1; i <= 10; i++) {
            //启动100个线程,执行100次
            new Thread(target).start();
        }

    }
}

class MyRunnable implements Runnable {
    private volatile int count;

    @Override
    public void run() {
        //System.out.println(count);
        synchronized ("11") {
            for (int i = 1; i <= 10; i++) {
                count++;
                System.out.println(Thread.currentThread().getName() + "输出" + count);
            }
        }
    }
}