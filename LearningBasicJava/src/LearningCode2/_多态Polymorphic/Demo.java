package LearningCode2._多态Polymorphic;

/**
 * 特征:封装,继承,多态
 * 形式:父类类型 对象名称=new 子类构造器(父类范围大)
 *      接口    对象名称=new 实现类构造器
 *概念:同一类型对象,执行同一个行为,在不同状态下变现不同行为
 *识别技巧:1.对于方法的调用:编译看左边,运行看右边
 *        2.对于变量的调用:编译看左边,运行看左边
 *使用前提:(1)必须存在父类类型的变量引用子类类型的对象
 *        (2)必须存在继承或实现
 *        (3)存在方法重写
 *劣势:独有功能会出问题
 */
public class Demo {
    public static void main(String[] args) {
        //多态
        Animal dlam = new Cat();
        dlam.run();
    }

}

class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("mao");
    }
}
class Wolf extends Animal{
    public void catchSheep() {
        System.out.println("zhua");
    }
    @Override
    public void run(){
        System.out.println("lang");
    }
}
class Animal {
    public void run() {
        System.out.println("run");
    }
}