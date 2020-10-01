package LearningCode3._03List集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * list系列集合:添加的元素,有序,可重复,有索引--可以根据索引查找
 *     --LinkedList:有序,可重复,有索引
 *                  基于链表的,增删快,查询慢,支持双链表
 *                   有新的API
 *     --ArrayList:有序,可重复,有索引
 *                 基于数组存储数据的,查询快,增删慢
 *     --Vector:线程安全,速度慢,
 */
public class ListDemo {
    public static void main(String[] args) {
        //ArrayList
        List<String> lists1 = new ArrayList();

        //LinkedList,有新的API
        //实现队列
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("1");
        queue.addLast("2");
        System.out.println(queue);
        //出队
        queue.removeFirst();//移除第一个
        System.out.println(queue);

        System.out.println("-------");
        //栈
        //入栈
        LinkedList<String> stack = new LinkedList<>();
        stack.push("1");
        stack.push("4");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        //出栈
        stack.pop();
        System.out.println(stack);
    }
}
