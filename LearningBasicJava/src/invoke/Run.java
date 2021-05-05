package invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Animal animal = new Dog();
//        animal.eat();
        Class clazz = Class.forName("invoke.Dog");
        Dog dog = (Dog) clazz.newInstance();
        Method method = clazz.getMethod("eat");
        method.invoke(dog);

    }

}
