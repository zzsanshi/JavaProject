package LearningCode2.SingleInstance;

/**
 * 什么是单例:
 * --一个类永远只存在一个对象,不能创建多个对象
 * why?
 * --有些开发只需要一个对象;对象越多越占内存
 * 如何实现:
 * --1饿汉单例:
 * 通过类获取单例对象的时候,对象提前做好
 * 实现步骤:
 * 1.定义一个单例类
 * 2.把构造器私有,定义一个静态成员变量存储对象
 * 3.提供一个方法返回单例对象
 * --2懒汉单例:
 * 通过类获取单例对象的时候,发现没有对象才会创建一个对象
 * 1.创建一个单例类
 * 2.构造器私有化,定义一个静态成员变量存储,不创建对象
 * 3.通过方法返回对象,创建对象
 * 4.
 */
public class SingleInstance {


}

//饿汉--占内存
class SingleInstace01 {
    //定义静态成员变量存储对象,提前创建出对象
    public static SingleInstace01 ins = new SingleInstace01();

    //私有构造器
    private SingleInstace01() {

    }

    //提供方法返回对象
    public static SingleInstace01 GetInstance() {
        return ins;
    }
}

//懒汉
class SingleInstace02 {
    //定义静态成员变量存储对象,提前创建出对象
    public static SingleInstace02 ins1;

    //私有构造器
    private SingleInstace02() {

    }

    //提供方法返回对象,并存储
    public static SingleInstace02 GetInstance() {
        if (ins1 == null) {
            ins1 = new SingleInstace02();
        }
        return ins1;

    }
}