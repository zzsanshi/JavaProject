package LearningCode3._10Exception异常;

/**
 * 异常:
 * 1.编译时的异常,继承自Exception
 * 2.运行时的异常,继承自RuntimeException
 *
 *
 * try只能出现一次
 * finally只能出现0-1次
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("2");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
