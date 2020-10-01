package LearningCode.BasicCode;

public class BasicCode6_Arry {
    public static void main(String[] args) {
        //动态初始话
        int[][] arr = new int[2][3];
        System.out.println(arr.length);
        arr[1][1] = 10;
        System.out.println(arr[1][1]);
        int[] arr1 = {1, 2};
        arr[0] = arr1;
        System.out.println(arr[0][1]);
        //静态初始话
        //遍历两个for循环
        int[][] arr2 = {{1, 2, 3}, {2, 3, 4}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }


    }
}
