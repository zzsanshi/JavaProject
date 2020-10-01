package LearningCode.BasicCode;

public class BasicCode2_array {
    public static void main(String[] args) {
        //数组
        int[] arr = new int[3];//动态初始化

        System.out.println("内存地址:" + arr);//打印出内存地址
        System.out.println(arr[1]);

        int[] arr1 = arr;
        System.out.println(arr1);
        int[] arr2 = new int[]{1, 2, 3};//静态初始化
        int[] arr3 = {1, 2, 4};

        System.out.println(arr2[2]);
        System.out.println(arr3[2]);

        for (int i = 0; i < arr3.length; i++) {
            System.out.println("输出第" + i + "个元素:" + arr3[i]);//遍历
        }
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum += arr3[i];//求和
        }
        System.out.println(sum);
















    }
}
