package LearningCode2._内部类InnerrClass;

/**
 * 匿名内部类:1.没有名字的局部内部类
 *          2.一旦写出,会立即创建一个匿名内部类的对象返回
 *          3.相当于子类类型
 * 格式: new 类名|抽象类|接口(形参){}
 */
public class Anonymity {
    public static void main(String[] args) {
        //匿名内部类
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        };
        a.run();
    }
}

abstract class Animal {
    public abstract void run();
}