package LearningCode2._Object类;

import java.util.Objects;

/**
 * 所有类都默认继承了Object
 * --开发中直接输出对象地址无意义,需要重写方法
 */
public class ObjectEqualsDemo {
        public static void main(String[] args) {
                Student s=new Student();
                System.out.println(s.toString());//直接调用toString,返回的对象调用的内存地址
                System.out.println(s);             //toString 可以省略不写

        }
}

class Student {
         String name;

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;//判断是否与自己比较
                if (o == null || getClass() != o.getClass()) return false;//判断是否为空,以及类型
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