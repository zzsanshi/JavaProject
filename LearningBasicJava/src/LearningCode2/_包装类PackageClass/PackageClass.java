package LearningCode2._包装类PackageClass;

/**
 * 引用数据类型是对象;基本数据类型不是对象--对象话为类包装类
 * 基本数据类型  包装类(引用数据类型)
 * byte        Byte
 * short       Short
 * int         Interger(特殊)
 * 自动装箱:可以直接把基本数据类型的值或者变量赋值给包装类
 * 自动拆箱:可以把包装类的对象赋值给基本数据类型
 */
public class PackageClass {
    public static void main(String[] args) {
        int a=10;
        Integer a2=a;//自动装箱
        //基本数据类型转为字符串
        String s=a2.toString();//1.调用toString
        String s1=Integer.toString(a2);//2.调用Interger.toString()
        String s2=a2+"";//3.直接基本数据类型加空字符串""

        //字符串类型的数值转换为基本数据类型
        String num="231";
        int num1=Integer.parseInt(num);

        double num2=Double.valueOf(num);
    }
}
