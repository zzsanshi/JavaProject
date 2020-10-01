package LearningCode.String;

public class String_Bulider {
    //StringBuilder 可变的字符串类
    public static void main(String[] args) {
        Method1();
        Method2();
    }

    private static void Method2() {
        StringBuilder s1=new StringBuilder();//toString :StringBuild转换为String;reverse:返回相反的字符序列
        for (int i=0;i<=50000;i++){//length:返回长度
            s1.append(i);
        }
    }

    private static void Method1() {
        long start=System.currentTimeMillis();
        String s="";
        for (int i=0;i<5000;i++){
            s+=i;
        }
        long end=System.currentTimeMillis();
    }
}
