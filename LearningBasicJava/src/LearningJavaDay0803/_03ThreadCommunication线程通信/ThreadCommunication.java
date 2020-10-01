package LearningJavaDay0803._03ThreadCommunication线程通信;

/**
 * 线程状态:
 *     1.New:线程刚创建,还未被启动,未调用start
 *     2.Runnable:线程在jvm中的运行状态,可以运行代码,也可以不用行,取决于操作系统处理器.调用start
 *     3.Blocked:当线程试图获取一个对象锁,而对象锁被其他线程持有,则该线程进入Blocked状态;当该线程持有锁,该线程变为Runnable
 *     4.Waiting:一个线程在等待另一个线程执行一个唤醒动作时,该线程进入Waiting状态.进入这个状态后是不能自动唤醒的,
 *               必须等待另一个线程调用notify或者notifyall方法才能唤醒
 *     5.Timed:同Waiting状态,与几个方法由超时参数,调用他们将进入Timed waiting状态.这一状态将一直保持到超时期满或者接收到唤醒通知.
 *               带有超时参数的常用方法有Thread.sleep,object.wait
 *     6.Teminated:应为Run方法正常退出死亡,或者因为没有捕获异常终止了run方法而死亡
 */
public class ThreadCommunication {
}
