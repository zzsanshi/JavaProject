package LearningCode.String;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);//返回索引处的char值
            System.out.println("输出:" + c1);
        }
        String s1 = sc.nextLine();
        //拆分
        char[] chars = s1.toCharArray();//将当前字符串拆分为字符数组
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        //统计字符次数
        String s2 = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numCout = 0;

        char[] chars1 = s2.toCharArray();//将当前字符串拆分为字符数组
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] >= 'A' && chars1[i] <= 'Z') {
                bigCount += 1;
            }
        }
//字符串截取
        String s3 = "ssss";
        s3.substring(2);//截取字符串

        //字符串替换
        String s4 = "adadas";
        String s5 = s4.replace("a", "*");
        System.out.println(s5);
        //切割字符
        String s6 = "123";
        //split:根据传入的字符串进行切割,返回字符串数组
    }
}
