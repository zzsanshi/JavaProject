package LearningCode3._01Collection集合的遍历方式;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection集合遍历方式:--没有索引
 *    1.迭代器:
 *       public Iterator iterator():获得对应的迭代器,用来遍历集合中的元素
 *       --1.获取迭代器;2.定义一个循环进行输出
 *    2.foreach
 *    可以遍历集合或数组
 *    是迭代器遍历的简化写法
 *    格式:for(数据类型 变量:数组-迭代对象)
 *
 *    3.lambda
 *
 */
public class Demo1 {
    public static void main(String[] args) {
        Collection<String> lists=new ArrayList<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        System.out.println("集合对象"+lists);
        //迭代器
        //1.得到集合的迭代器对象
        Iterator<String> it=lists.iterator();//得到迭代器对象
//        System.out.println(it.next());//获取下一个元素
//        System.out.println(it.next());//获取下一个元素
//        System.out.println(it.next());//获取下一个元素
        //System.out.println(it.next());//获取下一个元素--会报错
        //2.使用while循环
//        while(it.hasNext()){//hasNext询问是否有下一个元素
//            System.out.println(it.next());
//        }
        for (String list : lists) {

        }
        //foreach:快捷写法 数组名.for
        for (String ele:lists) {
            System.out.println(ele);
        }
        //3.lambda
        lists.forEach(s->{
            System.out.println(s);
        });
    }
}
