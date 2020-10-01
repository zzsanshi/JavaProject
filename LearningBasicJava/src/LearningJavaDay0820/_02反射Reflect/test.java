package LearningJavaDay0820._02反射Reflect;

import java.io.IOException;

public class test {
    public static void main(String[] args) {
        int num=1;
        int result=method(num);
        System.out.println(result);

    }
    public static int method(int num){
        num++;
        try {
            return ++num;
        }
        finally{
            num++;
            System.out.println(num);
        }

    }
}

