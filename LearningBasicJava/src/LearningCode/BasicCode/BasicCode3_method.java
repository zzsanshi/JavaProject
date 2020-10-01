package LearningCode.BasicCode;

public class BasicCode3_method {
    public static void main(String[] args) {
//        int num = 2;
//        method(num);
//        System.out.println(num);
        method1(2, 10);
        int x = Demo1(2, 3);
        System.out.println("带返回值:" + x);
        x = Demo2(1, 2);
        System.out.println("结果1:" + x);
        x = Demo2(1, 2, 3);
        System.out.println("结果2:" + x);
        int[] arr = {1, 2};
        change(arr);
        System.out.println(arr[0]);
    }

    public static void eat() {
        study();
        System.out.println("吃饭吗?");
        System.out.println("好!");
    }

    public static void study() {
        System.out.println("学习吗? ");
        System.out.println("No!");
    }

    //带参数
    public static void method(int num) {
        num += 1;
        System.out.println(num);
    }

    //形参、实参
    public static void method1(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    //返回值,return 只能返回一个结果;多个结果需要封装
    public static int Demo1(int a, int b) {
        int c = a + b;
        return c;
    }

    //方法重载overload
    public static int Demo2(int a, int b) {
        return a + b;
    }

    public static int Demo2(int a, int b, int c) {
        return a + b + c;
    }

    //参数传递--引用
    public static void change(int[] num) {
        num[0] = 10;
        //return num;
    }

}
