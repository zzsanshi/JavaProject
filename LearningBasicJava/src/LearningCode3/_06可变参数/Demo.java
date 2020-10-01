package LearningCode3._06可变参数;

/**
 * 数据类型...变量名称
 * 可以为:不传,一个,一批
 * 本质上是一个数组
 * 一个形参列表中可变参数只能有一个,且在最后
 */
public class Demo {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10,20);
        sum(new int[]{10,20});
    }
    public static void sum(int... nums){
        System.out.println(nums.length);
    }
}
