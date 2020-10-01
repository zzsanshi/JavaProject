package LearningCode2.Code;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

/**
 * 静态代码块类:变量\方法\构造器\代码块\内部类
 * 有无static划分
 * (1)静态代码块:
 * --会与类一起加载,并自动触发一次!
 * --可以用于在执行类之前进行静态资源初始化操作
 * (2)实力代码块
 * --每次创建对象时,加载使用
 * --初始化实例资源
 * --实际是提到构造器中执行的
 */
public class CodeDemo1 {
    public static List<String> cards = new ArrayList<>();//集合

    //静态
    static {
        System.out.println("静态代码块执行一次!");
        cards.add("111");
    }

    //实例
    {
        System.out.println("实例代码执行!");
    }
}


