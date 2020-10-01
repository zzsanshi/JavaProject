package LearningJavaDay0820._03注解Annotation;
/*
    注解:
        用在类上,方法上,成员变量,构造器,...上对成分进行编译约束,标记等操作的.
        注解是JDK1.5的新特性
        注解相当一种标记,是类的组成部分,可以给类携带一些额外的信息.
        注解是给编译器或JVM看的,编译器或JVM可以根据注解来完成对应的功能

    注解作用:
         1.标记
         2.方法重写约束 @override
         3.函数是接口约束.@FunctionalInterface
         4.现今最牛逼的框架技术多半都是在使用注解或反射.都是属于框架的基础技术


     自定义注解的格式:
         [修饰符]@interface 注解名{
         //注解属性
         }
        自定义注解用@interface关键字
        注解默认可以标记很多地方

     注解的属性
        格式:-格式1:数据类型 属性名()
            -格式2:数据类型 属性名() default 默认值

        属性适用的数据类型:
            八种基本数据类型:int,short,long,double,byte,char,boolean,float
            String Class
            以上类型的数组形式都支持

         注解可以有属性,属性名必须带()
         在用注解的时候,属性必须赋值,除非这个属性有默认值

         特殊属性:value,如果只有一个value属性的情况下使用value属性的时候可以省略calue不写
   元注解
     是用来注解自定义注解的
      两类:@target 约束自定义注解只能在哪些地方使用
          用来标注注解使用的位置，如果没有使用该注解标识，则自定义的注解可以使用在任意位置
          可使用的值定义在ElementType枚举类中，常用值如下
             TYPE 类，接口
             FIELD 成员变量
             METHOD 成员方法
             PARAMETER 方法参数
             CONSTRUCTOR 构造器
             LOCAL_VARIABLE 局部变量
          @Retention 申明注解的生命周期
 */
public class AnnotationDemo {
    public static void main(String[] args) {
        System.out.println("");
    }
}

@interface book {
    String name();
    int[] price() default 10;
}