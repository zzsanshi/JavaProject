package LearningCode3._07Map集合;


import java.util.HashMap;
import java.util.Map;

/**
 * Map集合
 * 键值对集合,双列集合,一个元素两个值,每个值叫键值对象,元素格式:key=value
 * 特点:1.特点由键决定
 *      2.无序,不重复,无索引:重复键的元素会覆盖前面的元素
 *      3.值没有要求
 *      4.键值对可以为null
 * HashMap:无序,不重复,无索引,值不做要求
 * LinkedHashMap:有序,不重复,无索引,值不做要求
 * 常用API:1.put(key,value):添加元素
 *     2.remove(key):删除元素,并返回
 *     3.get(key):根据指定的键,获取对应的值
 *     4.keySet:获取所用键,存储在Set集合中
 *     5.entrySet:获取所有键值对对象,存储在Set集合中
 *     6.containKey(key):判断是否存在此键
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("手机", 2);
        maps.put("电脑", 20);
        maps.put(null, null);
        System.out.println(maps);
        System.out.println("-------");
        //遍历
        maps.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
        System.out.println("----");

    }
}
