package LearningJavaDay0803._08ConCurrent并发包;
/*
 Exchanger(交换者)作用:是一个用于线程间协作的工具类.Exchanger用于进行线程间的数据交换.
                     这两个线程通过exchange方法交换数据.如果第一个线程先执行exchange()方法,他会一直等待第二个线程执行exchang()方法.
                     当两个线程都到达同步点时,这两个线程就可以交换数据,将本线程生产出来的数据传递给对方.
                  构造方法: public Exchanger()

                  方法 :public v exchange (V x)
                  分析:需要两个线程
                      需要一个交换对象负责交换两个线程执行的结果
                      可以实现线程间的数据交换
 */
public class ExchangerDemo {
}
