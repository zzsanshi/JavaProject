package LearningCode0922.反射;

public class ReflactionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("LearningCode0922.反射.User");
        System.out.println(c1);
        System.out.println(c1.hashCode());//一个类在内存中只有一个Class对象
        //一个类被加载后,类的整个结构都会被封装在Class对象中
        User u1 = new User();
        Class c2 = u1.getClass();
        System.out.println(c2.hashCode());
        Class c3 = User.class;
        System.out.println(c3.hashCode());
//获得父类
        Class c4 = c1.getSuperclass();
        System.out.println(c4);
    }
}

//实体类
class User {
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}