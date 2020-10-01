package LearningCode2._Objects类;


import java.util.Objects;
/**
 * 方法:1.eauals:--比较两个对象
 *              --底层进行非空判断,从而可以避免空指针异常
 *      2.isNull:--判断变量是否为null
 */
public class Demo {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=null;

        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));
    }
}
class Student {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}