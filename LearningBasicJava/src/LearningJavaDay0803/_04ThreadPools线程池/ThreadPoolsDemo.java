package LearningJavaDay0803._04ThreadPools线程池;

import java.util.concurrent.*;

/**
 * 线程池: 就是一个容纳多个线程的容器,其中的线程可以反复的使用,
 *         省去了频繁创建和销毁线程对象的操作,无需反复创建线程而消耗过多资源
 *
 *     工作线程
 *     任务队列
 *     任务接口
 *     线程池管理
 *
 *为什么会有线程池:
 *     合理利用线程池能够带来三个好处
 *     1.降低资源消耗
 *          --减少了创建和i笑傲会线程的次数,每个工作线程都可以被重复利用,可执行多个任务
 *     2.提高响应速度
 *          --不需要频繁的创建线程如果有线程可以直接用,不会出现系统僵死
 *     3.提高线程的可管理性
 *
 * 创建线程池
 *      代表类:ExecutorService(接口)
 *      public static Executorervice newFixedThreadPool(int nThreads):
 *         创建一个线程池返回
 *      提交线程任务对象执行的方法:
 *        1.Future<?> submit (Runnable task):提交一个Runnable的任务对象给线程池执行
 *
 */
public class ThreadPoolsDemo {
    public static void main(String[] args)  {
            //创建线程池对象
        ExecutorService pools= Executors.newFixedThreadPool(3);
        //添加任务
        Runnable target=new MyRunnable();
        pools.submit(target);//提交任务
        pools.submit(target);//提交任务
        pools.submit(target);//提交任务
        pools.submit(target);//提交任务



        //Callable
        Future<String > t1=pools.submit(new MyCallable());
        //获取结果
        try {
            System.out.println(t1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        pools.shutdown();//任务执行完,关闭线程池
        //pools.shutdownNow();//立即关闭线程池
    }

}
class MyRunnable implements Runnable {
    //重写run()
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName() + "输出:" + i);
        }
    }
}
class MyCallable implements Callable<String> {
    //2.重写call
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+",Callable!");
        return "hao!";
    }
}