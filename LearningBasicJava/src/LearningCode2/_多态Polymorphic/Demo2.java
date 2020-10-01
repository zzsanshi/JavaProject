package LearningCode2._多态Polymorphic;

/**
 * 自动类型转换:
 *1.子类型的对象或变量可以自动类型转换赋值给父类类型的变量
 * 强制类型转换
 * 1.父类的变量或者对象必须强制类型转换为子类类型的变量.否则报错
 *   形式:类型 变量名称=(类型)(对象或者变量)
 * 2.类型转换异常研究
 *   需要进行正式类型判断:变量 instanceof 类型
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        //小范围的对象赋值给大范围的变量
        Animal a=new Cat();
        //小范围的变量赋值给大范围的变量
        Cat c=new Cat();
        Animal al=c;

        Animal a2= new Wolf();
        a2.run();
        //a2.catchSheep;
        Wolf w=(Wolf)a2;
        w.catchSheep();
    }
}