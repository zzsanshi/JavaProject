package LearningJavaDay0803._09Lambda表达式;
/*
   Lambda表达式作用:是为了简化匿名内部类的代码写法--简化代码

   格式:(匿名内部类被重写方法的形参列表)->{
       被重写的方法体代码
   }
   ->为新语法,没有实际含义,不能省略

   使用前提:
        (1)并不能简化所有匿名内部类的写法
        (2)只能简化接口中只有一个抽象方法的匿名内部类的形式

   只能简化函数式接口的匿名内部类写法:
       1.首先必须是接口
       2.接口只能由一个抽象方法
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("启动!");
            }
        });
        t.start();
        Thread t1 = new Thread(()->{
                System.out.println("启动!");
        });
        t1.start();
    }
}
