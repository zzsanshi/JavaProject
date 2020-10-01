package LearningCode.Test_class;

public class Test {
    public static void main(String[] args) {
        Student stu2 = new Student("11", 10);
        Student stu1 = new Student();
        stu2.show();
        System.out.println(stu1);
        stu1.setAge(100);
        stu1.show();


    }
}
