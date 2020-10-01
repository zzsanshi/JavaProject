package LearningJavaDay0803._02ThreadSafe线程安全;

import javax.security.auth.login.AccountException;

/**
 * 线程安全:多个线程操作同一个共享资源时可能会出现线程安全问题
 *
 * 解决方法:线程同步--多个线程实现先后依次操作资源--上锁
 *    线程同步三种方式:1.同步代码快
 *                  2.同步方法
 *                  3.lock显示锁
 *
 *         a.同步代码块
 *            作用:把出现线程安全问题的核心代码块给上锁.每次只能一个线程进入
 *                 执行完毕以后自动解锁,其他线程才可以进入
 *
 *             格式:synchronized(锁对象){
 *                 //访问共享资源的核心代码
 *             }
 *
 *          b.同步方法
 *          作用:把出现线程安全问题的核心方法锁起来
 *              每次只能一个线程进入,其他线程在外等待
 *           用法:直接给方法加上一个修饰符 synchronized
 *
 *          c.lock显示锁
 *            --public void lock():加同步锁
 *            --public void unlock():释放同步锁
 */
public class Threadsafe {
    public static void main(String[] args) {
        //创建一个共享资源
        //创建2个线程对线进行操作
    }
}
