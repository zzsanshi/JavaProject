package LearningJavaDay0803._01Thread多线程;

/**
 * 什么是进程:运行中的程序就是进程
 *   进程的三个特性:1.动态性
 *                2.独立性
 *                3.并发性
 * 什么是线程:属于进程.一个进程可以包含多个线程.进程中的一个独立执行单元
 *    作用:1.提高程序的效率,更多机会获得CPU
 *         2.解决很多业务模型
 *         3.大型高并发的核心技术
 *         4.多线程的开发难以理解
 * 创建线程的方式:1.直接定义一个类继承线程类Thread,重写run()方法,创建线程对象调用线程对象的start()方法启动线程
 *             2.定义一个线程任务类实现Runnable接口,重写run()方法,创建线程任务对象,把线程对象包装成线程对象,
 *               调用线程对象的start()方法启动
 *             3.实现Callable接口
 *
 *      a.继承Thread类的方式
 *           ---1.定义一个线程类继承Thread类
 *           ---2.重写run()
 *           ---3.创建一个新的线程对象
 *           ---4.调用线程对象的start()方法启动线程
 *         优点:编码简单
 *         缺点:无法继承其它类,功能单一
 *       小结:1.线程类继承了Thread的类
 *           2.启动线程必须调用start()方法
 *           3.多线程并发抢占CPU执行,所以在执行的过程中会出现并发随机性
 *      常用API:
 *          1.setName(String name):给线程取名字
 *          2.getName():获取线程的名字
 *                  ---线程存在迷人名称,子线程的默认名称是:Thread-索引
 *                  ---主线程默认名称是:main
 *           3.public static Thread currentThread():获取当前线程的对象,这个代码在哪个线程中,就得到哪个线程对象
 *           4.sleep(long time):让线程休眠多少毫秒,再执行.
 *
 *      b.实现Runable接口
 *          ---1.创建一个线程任务类实现Runnable接口
 *          ---2.重写run()方法
 *          ---3.创建一个线程任务对象
 *          ---4.把线程任务对象包装成线程对象
 *          ---5.调用线程对象的start()方法启功线程
 *          优点:
 *              ---线程任务类只是实现了Runnable接口,可以继承其他类而且可以继续实现其他接口避免了单继承的局限性
 *              ---同一个任务对象可以被包装成多个线程对象
 *              ---适合多个线程共享一个资源
 *              ---实现解耦操作,线程任务代码可以被多个线程共享,任务代码和线程独立.
 *              ---线程池可以实现runnable和callable线程任务对象(其实Thread类本身也是实现了Runnable接口的)
 *           缺点:
 *              ---代码复杂
 *
 *      c.实现Callable接口
 *            ---1.定义一个线程任务类实现Callable接口,申明线程执行的结果类型
 *            ---2.重写线程任务类的call方法,这个方法直接返回执行结果
 *            ---3.创建一个Callable的线程任务对象,将其包装成一个未来任务对象
 *            ---4.把未来任务对象包装成线程对象
 *            ---5.调用线程的start()方法启动线程
 *            优点:全是优点
 *              --线程任务类只是实现了Callable接口,可以继承其他类.同时实现其他接口
 *              --一个线程任务对象可以被共享成多个线程对象,适合最多线程的资源共享操作
 *              --很适合线程池的执行任务
 *              --可以直接获取线程执行的结果
 *             缺点:编码复杂
 *
 *
 *
 *  线程注意事项:1.线程启动必须调用start()方法,否则当成普通类处理
 *               ---如果线程直接调用run()方法,相当于变成了普通类的执行,此时将只有主线程在执行他们
 *               ---start()方法底层其实是给CPU注册当前线程,并且触发run()方法
 *              2.建议线程先创建子线程,主线程的任务放在之后.否则主线程永远在执行它.
 * Thread的构造器:
 *        ---public Thread(){}
 *        ---public Thread(String name){}
 *        ---public Thread(Runnable target){}
 *        ---public Thread(Runable target ,String name){}
 */
public class ThreadDemo {
    //Threaddemo可以当成一个进程
    //main可以理解为主线程
    public static void main(String[] args) {
        //创建一个线程对象

        //调用线程对象启动线程--继承Thread类
        Thread t1 = new MyThread();
        t1.setName("继承Thread类创建的线程");
        t1.start();
        System.out.println(t1.getName());
        //有参构造器为线程取名
        Thread t2 = new MyThread("2号线程");
        System.out.println(t2.getName());

        //实现Runnable接口
        //创建线程任务对象--线程任务对象不是线程对象,只是执行线程的任务
        Runnable target = new MyRunnable();
        //把线程任务对象包装成线程对象
        Thread t3=new Thread(target,"3号线程实现Runnable");
        System.out.println(t3.getName());



        //获得当前主线程对象
        Thread m = Thread.currentThread();
        System.out.println(m.getName());
//        for (int i = 0; i < 5; i++) {
//            System.out.println("main线程输出:" + i);
//        }
    }
}

//定义一个类继承Thread类
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);//因为在父类中,需要传给父类,调用父类的构造器
    }

    public MyThread() {
    }

    //重写run()
    @Override
    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + "输出:" + i);
//        }
    }
}

class MyRunnable implements Runnable {


    //重写run()
    @Override
    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + "输出:" + i);
//        }
    }
}