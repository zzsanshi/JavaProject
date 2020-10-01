package LearningJavaDay0803._08ConCurrent并发包;
/*
    控制线程并发的数量

    构造方法:public Semaphore(int permints):
            public Semaphore(int permints,boolean fair): fair表示公平性,如果设为true,下次执行的线程会是等待最久的线程
       方法:public void acquire()      表示获取许可==得到锁
           public void release()      表示释放许可
 */
public class SemaphoreDemo {
}
