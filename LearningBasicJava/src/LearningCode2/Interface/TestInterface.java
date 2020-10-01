package LearningCode2.Interface;
//全部为抽象类
//接口可以多继承,合并接口

/**
 * 基本实现:方法 常量
 * 常量值只有一个,且运行过程中不可更改,全部大写用_连接
 * 修饰符为public static final,可以不加
 * 没有其他成分
 * 父类和接口默认方法重名时,用父类的.
 * 接口重名时,需重新构造
 */
public interface TestInterface {
    public abstract void run();//接口 可以省略不写

    public static final String SS = "11";//常量

    //1.8接口新增
    //默认方法==实例方法
    default public void eat() {
    }

    //静态方法 只能用接口名来掉
    public static void study() {

    }
    //私有方法==private修饰1.9开始支持


}
