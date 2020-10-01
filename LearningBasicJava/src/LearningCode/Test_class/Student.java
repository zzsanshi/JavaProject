package LearningCode.Test_class;

//JavaBean类:
public class Student {
    //变量
    private String name;
    private int age;

    //方法
    public void show() {
        System.out.println("测试!" + age);
        System.out.println("年龄:" + age);
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
