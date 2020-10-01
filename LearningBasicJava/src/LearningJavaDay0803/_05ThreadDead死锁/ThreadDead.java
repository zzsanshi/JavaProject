package LearningJavaDay0803._05ThreadDead死锁;

/**
 *  死锁:是由多个线程同时被阻塞,他们中的一个或者多个全部都在等待某个资源被释放
 *       由于线程被无期限地阻塞,因此程序不可能正常中止
 *
 *   死锁的死个必要条件:
 *      1.互斥使用,即当资源被一个线程使用(占有)时,别的线程不能使用
 *      2.不可抢占,资源请求者不能强制从资源占有者手中夺取资源,资源只能主动释放
 *      3.请求和保持,当资源请求者在请求其他的资源的同时保持对原有资源的占有
 *      4.循环等待,即存在一个等待循环队列:p1要p2的资源,p2要p1的资源,这样就形成了一个等待循环
 */
public class ThreadDead {
    //定义资源对象
    public static Object resource01=new Object();
    public static Object resource02=new Object();

    public static void main(String[] args) {
        //定义两个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource01){
                    System.out.println("线程1占用资源1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource02){
                        System.out.println("线程1请求资源2");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {synchronized (resource02){
                System.out.println("线程2占用资源2");
                synchronized (resource01){
                    System.out.println("线程2请求资源1");
                }

            }
            }}).start();
        //

    }
}
