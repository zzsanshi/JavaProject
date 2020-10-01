package LearningJavaDay0820._02反射Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
   反射的概念

     反射,注解,代理,泛型是Java的高级技术,是以后框架的底层原理必须使用的技术

     反射是指对于任何一个类,在"运行的时候"都可以得到这个类全部成分
         在运行时,可以直接得到这个类的构造器对象.(Constructor)
         在运行时,可以直接得到这个类的成员变量对象(Field)
         在运行时,可以直接得到这个类的成员方法对象(Method)

     反射的核心思想关键就是得到:编译后的class对象

     反射提供了一个Class类型,就是可以得到编译以后的class类对象
     HelloWord.java->javac->HelloWord.class
     class c=HelloWord.class

反射获取class类对象
   反射为一个类的全部成分都设计了一个类型来代表这个对象:
     Class:字节码文件的类型
     Constructor:构造器的类型
     Field:成员变量的类型
     Method:方法的类型

   反射技术的第一步永远是先得到Class类对象:有三种方式获取
      1.类名.class
      2.通过类的对象.getClass()方法
      3.Class.forName("类的全限名")
           --public static Class<?> forName(String className)

    Class类下的方法:
       String getSimpleName();获得类名字符串:类名
       String getName();获得类全名:包名+类名
       T newInstance();创建Class对象关联类的对象,其实底层也是调用无参数构造器,以淘汰

      第二步:获取构造器:
        1.Constructor getConstructor(Class ... parameterTypes)
           根据参数匹配获取某个构造器,只能拿public修饰的构造器,几乎不用
        2.Constructor getDeclaredConstructor(Class... parameterTypes)
           根据参数匹配获取某个构造器,只要声名就可以定位不关心权限修饰符,建议使用
        3.Constructor[] getConstructors()
            获取所有的构造器,只能拿public修饰的构造器,几乎不用
        4.Constructor[] getDeclaredConstructors()
            获取所有申明的构造器,只要你写我就能拿到,无所谓权限.建议使用
        目的:通过构造器初始化对象
          API:setAccessible()
              newInstance()

        获取成员变量:
        1.Field getField(String name);
            根据成员变量名获得对应Field对象,只能获得public对象
        2.Field getDeclaredField(String name);
            根据成员变量名获得对应Field对象,只要申明了就可以获得
        3.Field[] getFields();
            获得所有的成员变量对应的Field对象,只能获得public的
        4.Field[] getDeclaredFields();
            获得所有的成员变量对应的Field对象,只要申明了就可以得到
        目的:取值和赋值

        获取Method方法对象
          1.Method getMethod(String name,Class...args);
            根据方法名和参数类型获得对应的方法对象,只能获得public的
          2.Method getDeclardMethods(String name,class...args)
            根据方法名和参数类型获得对应的方法对象,包括private的
          3.Method[] getMethods();
            获得类中的所有成员方法对象,返回数组,只能获得public修饰的且包含父类的
          4.Method[] getDeclardMethods();
             获得类中的所有成员对象,返回数组,只获得本类申明的方法
           目的:




 */
public class ReflectDemo {
    public static void main(String[] args) {
        //反射的第一步永远时先得到类的class文件对象:字节码文件
        //1.类名class
        Class <Student> c1=Student.class;

        //2.对象.getClass()
        Student s1=new Student();
        Class c2=s1.getClass();
        System.out.println(c2.getSimpleName());

        //3.Class.forName("类的全限名")
        //直接去加载该类的class文件
        try {
            Class c3=Class.forName("LearningJavaDay0820._02反射Reflect.Student");
            //System.out.println(c3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Constructor m1=c2.getDeclaredConstructor();
            System.out.println(m1);
            m1.setAccessible(true);//暴力打开访问权限
            Student swk=(Student) m1.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        Constructor[] m =c1.getDeclaredConstructors();
        System.out.println(m[1]);


        //



    }
}
