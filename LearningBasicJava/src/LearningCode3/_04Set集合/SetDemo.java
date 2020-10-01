package LearningCode3._04Set集合;

import java.util.*;

/**
 * set系列集合:无序,不重复,无索引
 *     --HashSet:无序,不重复,无索引
 *     --LinkedHashSet:有序,不重复,无索引:使用哈希表存储元素,但是添加了一个链用来维护添加顺序
 *     --TreeSet:无重复,无索引,按照大小默认升序排序
 * 去重复原因:
 *   1.有值特性的,Set集合可以直接判断去重复
 *   2.对于引用数据类型的类对象,Set对象操作流程
 *      a.让两两对象调用hashCode()得到彼此的哈希值--哈希值相当于内存地址
 *      b.比较是否相同,相同则继续equals比较内容,相同则去重复,不同则留下(如果希望内容一样就重复,需要重写hash
 *      Code方法)
 * 无序原因:
 *   1.根本原因:底层采用了哈希表存储元素(哈希表增删改查方便)
 *
 *
 * TreeSet排序流程:
 *     1.有值特性的直接升序拍
 *     2.字符串则按元素首字母的编号拍
 *     3.对于自定义的引用类型,会报错
 *         自定义排序实现过程:
 *            a.直接为对象的类实现比较规则接口Comparable,重写比较方法;
 *            b.直接为集合对象设置比较器Comparator对象,重写方法
 */
public class SetDemo {
    public static void main(String[] args) {
        //HashSet
        Set<String> sets = new HashSet<>();//今典操作
        sets.add("1");
        sets.add("2");
        sets.add("4");
        sets.add("4");
        sets.add("3");
        System.out.println(sets);
        System.out.println("------");

        //LinkedHashSet
        Set<String> sets1 = new LinkedHashSet<>();//今典操作
        sets1.add("1");
        sets1.add("2");
        sets1.add("4");
        sets1.add("4");
        sets1.add("3");
        System.out.println(sets1);
        System.out.println("------");

        //TreeSet
        System.out.print("TreeSet:");
        TreeSet<String> sets2 = new TreeSet<>();
        sets2.add("1");
        sets2.add("2");
        sets2.add("4");
        sets2.add("4");
        sets2.add("3");
        System.out.println(sets2);
        System.out.println("------");

    }
}
