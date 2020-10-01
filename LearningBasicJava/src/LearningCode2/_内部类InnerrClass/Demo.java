package LearningCode2._内部类InnerrClass;

/**
 * 作用:更好的封装性,内部有更多权限修饰符,封装有更多的控制.
 *分类:(1)静态内部类
 *    (2)实例内部类(成员内部类)
 *    (3)局部内部类
 *    (4)匿名内部类
 */
public class Demo {
    //实例内部类创建对象
    Outter.Inner1 s2=new Outter().new Inner1();
    //静态内部类
    Outter.Inner2 s1=new Outter.Inner2();


}
class Outter{
    static String name="ss";
    int age=12;

    //实例内部类
    //不能定义静态成员
    //能访问外部类静态成员和实例成员
    public class Inner1{
    }
    //静态内部类
    //能访问外部类静态成员
    static class Inner2{

    }
    //局部内部类:在构造器,代码块,for循环中定义的类就是局部内部类

    //匿名内部类
     

}