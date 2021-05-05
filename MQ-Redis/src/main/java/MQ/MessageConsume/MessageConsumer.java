package MQ.MessageConsume;

import Utils.JedisPoolUtils;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
* Description:
 * 开启两个线程消费消息
 *
* date: 2021/4/30 12:52
* @author: zzsanshi 
* @since JDK 14
*/
public class MessageConsumer implements Runnable {
    public static final String MESSAGE_KEY = "message:queue";
    private volatile int count;


    public void consumerMessage() {
        Jedis jedis = JedisPoolUtils.getJedis();
        List<String> message = jedis.brpop(0,MESSAGE_KEY);
        //System.out.println(Thread.currentThread().getName() + " consumer message,message=" + message + ",count=" + count);
        System.out.println(message);
        count++;
    }
    @Override
    public synchronized void run() {
        while (true) {
            consumerMessage();
        }
    }
    public static void main(String[] args) {
        MessageConsumer messageConsumer = new MessageConsumer();
        Thread t1 = new Thread(messageConsumer, "thread6");
        Thread t2 = new Thread(messageConsumer, "thread7");
        t1.start();
        t2.start();
    }
}
