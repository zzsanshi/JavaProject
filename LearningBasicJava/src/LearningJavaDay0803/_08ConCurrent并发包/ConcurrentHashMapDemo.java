package LearningJavaDay0803._08ConCurrent并发包;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 并发包来历:为了满足性能优异且线程安全,于是Java开发了并发包

 Map集合汇中的经典集合:HashMap不是线程安全,性能好的
      --HashTable加入了线程安全,但性能较差,加入了计时机制,加了锁
      --ConcurrentHashMap保证线程安全,综合性能好--局部锁

 */
public class ConcurrentHashMapDemo {
    public Map<String,String> map=new ConcurrentHashMap<>();
}
