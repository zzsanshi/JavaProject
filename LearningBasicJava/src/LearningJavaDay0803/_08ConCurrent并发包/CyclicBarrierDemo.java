package LearningJavaDay0803._08ConCurrent并发包;
/*
   循环屏障作用:某个线程任务必须等待其他线程任务执行完毕以后才能最终触发自己执行
   构造器:public CyclicBarrier(int parties,Runnable barrierAction)用于再线程到达屏障时,优先执行barrierAction,方便处理更复杂的
                                                                 业务场景
   方法:public int await()  每个线程调用await方法告诉CyclicBarrier我已经到达了屏障,然后当前线程被回收
   小结:  可以实现多线程中,某个任务在等待其他线程执行完毕以后触发
          循环屏障可以实现达到一组屏障就触发一个任务执行!
 */
public class CyclicBarrierDemo {
}
