package LearningCode.BasicCode;

public class BasicCode5 {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(0b10);//输出为十进制
        System.out.println(010);
        System.out.println(0x10);
        //进制转化
        byte b = (byte) 130;
        System.out.println(b);
        //数据交换,异或两次数据不变
        int a = 10;
        int c = 20;
        a=a^c;
        c=a^c;
        a=a^c;
        System.out.println(a);
        System.out.println(c);
        //数组反转:双指针+异或



    }
}
