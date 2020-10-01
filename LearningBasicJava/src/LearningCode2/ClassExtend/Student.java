package LearningCode2.ClassExtend;

//静态成员变量用类名访问
//实力成员变量用对象访问
public class Student extends People {
    public static String schoolName = "hhu";

    @Override//校验
    public void study() {
        System.out.println("xuexi");
    }

    @Override
    public void run() {
        System.out.println("学生跑");
    }

}
