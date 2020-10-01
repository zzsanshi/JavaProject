package LearningCode0922.反射.Test;

public class t2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        t1 t=new t1();
        Class c1=t.getClass();
        System.out.println(c1.getMethods());

        System.out.println(t1.m);

        //反射创建对象
        t1 t3= (t1)c1.newInstance();//需要有无参构造器
        System.out.println(t3.m);
    }

}
