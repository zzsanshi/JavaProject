package LearningCode2._System类;

/**
 * 系统类
 */
public class DemoSyetem {
    public static void main(String[] args) {
        //System.exit(0);//0代表正常中止
        //System.err.println();
        long time = System.currentTimeMillis();//得到时间毫秒值
        int[] arr = {1, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] arr2 = new int[2];//数组的拷贝
        System.arraycopy(arr, 0, arr2, 0, 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
