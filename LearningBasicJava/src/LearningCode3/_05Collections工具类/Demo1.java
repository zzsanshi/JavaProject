package LearningCode3._05Collections工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 不是集合,是操作集合的工具类
 * 常用API:
 *      1.addAll,批量添加元素
 *      2.shuffle,打乱集合顺序
 *      3.sort(list),按照默认顺序排序,可以修改类的排序规则
 *      4.sort(list,comparator),按照指定比较排序,自定义类型
 */
public class Demo1 {
    public static void main(String[] args) {
        Collection<String> names=new ArrayList<>();
        Collections.addAll(names,"wo","2","3");
        System.out.println(names);
    }
}
