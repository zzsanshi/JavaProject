package LearningCode2.ClassExtend;

/**
 * 一个类只能继承一个父类
 * 多层继承:间接继承
 * 一个类可以有多个子类
 * 一个类默认继承object或间接继承
 * public>protected>缺省>private
 */
public class Main {
    public static void main(String[] args) {
        Teacher ss=new Teacher();
        ss.teach();
        Student stu=new Student();
        stu.run();
    }
}
