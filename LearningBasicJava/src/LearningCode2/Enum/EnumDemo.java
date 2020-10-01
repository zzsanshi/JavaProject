package LearningCode2.Enum;

/**
 * 作用:信息标志和信息分类
 * 格式:修饰符 enum 名称{}
 * --第一行必须是枚举的对象名称
 * --
 * 特点:1.final修饰不能被继承
 * 2.默认继承Java.lang.enum
 * 3.第一行罗列枚举的对象,常量存储
 * 4.所有的第一行写的都是常量名称,默认存储了枚举对象
 * 5.枚举相当于是多例对象
 * 6.构造器默认私有
 */
public class EnumDemo {
}

enum Sex {
    BOY, GIRl;
}